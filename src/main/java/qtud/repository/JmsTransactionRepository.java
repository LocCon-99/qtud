package qtud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import qtud.model.entity.JmsTransaction;

/**
 * @author YenCVT.
 * @version 0.1
 *
 */
@Repository
public interface JmsTransactionRepository extends JpaRepository<JmsTransaction, String>{

}
