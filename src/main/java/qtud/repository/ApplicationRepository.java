package qtud.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import qtud.model.entity.Application;

/**
 * @author YenCVT.
 * @version 0.1
 *
 */
@Repository
public interface ApplicationRepository extends JpaRepository<Application, String>{

//	@Query("SELECT a FROM application p " +
//            "WHERE (:appCode IS NULL OR (p.appCode = :categoryId))" +
//            "AND (:productName IS NULL OR UPPER(p.name) LIKE CONCAT('%',UPPER(:productName),'%'))" +
//            "AND (:productName IS NULL OR UPPER(p.name) LIKE CONCAT('%',UPPER(:productName),'%'))");
	
	@Query(value = "SELECT a FROM Application a where (:appCode is null or a.appCode = :appCode) and (:appName is null or a.appName = :appName) and (:status is null or a.status = :status)")
	Page<Application> findApplications(@Param("appCode") String appCode, @Param("appName") String appName,@Param("status") Integer status, Pageable pageable);
	
}
