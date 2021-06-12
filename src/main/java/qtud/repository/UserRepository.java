package qtud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import qtud.model.entity.User;

/**
 * @author YenCVT.
 * @version 0.1
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, String>{
	
	Optional<User> findByUserName(String username);
	
	Boolean existsByUserName(String username);
}
