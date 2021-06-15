package qtud.service.impl;

import java.util.Optional;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import qtud.model.entity.Application;
import qtud.repository.ApplicationRepository;
import qtud.service.ApplicationService;

@Transactional
@Service
public class ApplicationServiceImpl implements ApplicationService {
	
	
	@Autowired
	ApplicationRepository applicationRepository;

	@Override
	public Application newApplication(Application application) {
		// TODO Auto-generated method stub
		return applicationRepository.save(application);
	}

	@Override
	public void updateApplication(Application application) {
		// TODO Auto-generated method stub
		 applicationRepository.save(application);
	}

	@Override
	public void deleteApplication(String id) {
		// TODO Auto-generated method stub
		 applicationRepository.deleteById(id);
	}

	@Override
	public Optional<Application> findOne(String id) {
		// TODO Auto-generated method stub
		return applicationRepository.findById(id);
	}

	@Override
	public Page<Application> findApplications(String id, String name, Integer status, Pageable pageable) {
		// TODO Auto-generated method stub
		return applicationRepository.findApplications(id, name, status, pageable);
	}

	
	
	
}
