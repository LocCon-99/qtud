package qtud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import qtud.model.entity.AutoSynTbParam;

/**
 * @author YenCVT.
 * @version 0.1
 *
 */
@Repository
public interface AutoSynTbParamRepository extends JpaRepository<AutoSynTbParam, String>{

}
