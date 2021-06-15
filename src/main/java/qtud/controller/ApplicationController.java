package qtud.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import qtud.model.dto.api.DataApiResult;
import qtud.model.dto.request.ApplicationRequest;
import qtud.model.dto.respone.DataRespone;
import qtud.model.entity.Application;
import qtud.service.ApplicationService;

@RestController
@RequestMapping("/api/v1/application")
public class ApplicationController {

	@Autowired
	private ApplicationService applicationService;

	@PostMapping
	public ResponseEntity<DataApiResult> save(@Valid @RequestBody ApplicationRequest applicationRequest) {

		DataApiResult dataApiResult = new DataApiResult();
		Application app = applicationService.newApplication(applicationRequest);
		dataApiResult.setSuccess(true);
		dataApiResult.setMessage("success");
		dataApiResult.setData(app);

		return new ResponseEntity<>(dataApiResult, HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<DataApiResult> update(@Valid @RequestBody ApplicationRequest applicationRequest) {

		DataApiResult dataApiResult = new DataApiResult();
		Application app = applicationService.newApplication(applicationRequest);
		dataApiResult.setSuccess(true);
		dataApiResult.setMessage("success");
		dataApiResult.setData(app);

		return new ResponseEntity<>(dataApiResult, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Application> findOne(@PathVariable String id) {
		return applicationService.findOne(id).map(product -> new ResponseEntity<>(product, HttpStatus.OK))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id) {
		applicationService.deleteApplication(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/search")
	public ResponseEntity<DataRespone> findByPublished(
			@RequestParam(value = "appCode", required = false) String appCode,
			@RequestParam(value = "appName", required = false) String appName,
			@RequestParam(value = "status", required = false) Integer status,
			@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "3") int size) {
		try {

			DataRespone data = new DataRespone();

			List<Application> applications = new ArrayList<Application>();
			Pageable paging = PageRequest.of(page, size);

			Page<Application> pageApps = applicationService.findApplications(appCode, appName, status, paging);
			applications = pageApps.getContent();

			data.setData(applications);
			data.setCurrentPage(pageApps.getNumber());
			data.setTotalItems(pageApps.getTotalElements());
			data.setTotalPages(pageApps.getTotalPages());

			return new ResponseEntity<>(data, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
