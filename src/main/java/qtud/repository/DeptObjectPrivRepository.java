package qtud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import qtud.model.entity.DeptObjectPriv;

/**
 * @author YenCVT.
 * @version 0.1
 *
 */
@Repository
public interface DeptObjectPrivRepository extends JpaRepository<DeptObjectPriv, String>{

}
