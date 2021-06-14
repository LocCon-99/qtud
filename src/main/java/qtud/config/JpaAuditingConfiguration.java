package qtud.config;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @author  YenCVT.
 * @version 0.1
 *
 */
@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class JpaAuditingConfiguration {

//  @Autowired
//  SecurityService securityService;

  @Bean
  public AuditorAware<String> auditorProvider() {

    return () -> Optional.ofNullable("Annonymous");
  }
}
