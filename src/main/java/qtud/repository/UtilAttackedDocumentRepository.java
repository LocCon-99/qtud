package qtud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import qtud.model.entity.UtilAttackedDocument;

/**
 * @author YenCVT.
 * @version 0.1
 *
 */
@Repository
public interface UtilAttackedDocumentRepository extends JpaRepository<UtilAttackedDocument, String>{

}
