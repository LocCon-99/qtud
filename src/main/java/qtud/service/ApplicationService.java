package qtud.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import qtud.model.entity.Application;

public interface ApplicationService {
	
	Application newApplication(Application application);
	void updateApplication(Application application);
	void deleteApplication(String id);
	Optional<Application> findOne(String id);
	Page<Application> findApplications(@Param("id") String id, @Param("name") String name,@Param("name") Integer status, Pageable pageable);
}
