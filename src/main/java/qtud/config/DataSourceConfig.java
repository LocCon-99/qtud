package qtud.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import qtud.component.DataSourceUtil;

@Configuration
@EnableJpaRepositories(entityManagerFactoryRef = "firstDbEntityManagerFactory", transactionManagerRef = "firstDbTransactionManager", basePackages = {"qtud.repository"})
@EnableTransactionManagement
public class DataSourceConfig {
	@Autowired
	private DataSourceUtil dsUtil;

	@Bean
	@Primary
	public DataSource primaryDataSource() {
		return this.dsUtil.createDatasource("spring.datasource", "Datasource1");
	}

	@Primary
	@Bean(name = {"firstDbEntityManagerFactory"})
	public LocalContainerEntityManagerFactoryBean firstDbEntityManagerFactory(EntityManagerFactoryBuilder builder,
			@Qualifier("primaryDataSource") DataSource datasource) {
		return builder.dataSource(datasource)
				.packages(new String[]{"qtud.model", "qtud.model.entity"})
				.persistenceUnit("firstDb").build();
	}

	@Primary
	@Bean(name = {"firstDbTransactionManager"})
	public PlatformTransactionManager firstDbTransactionManager(
			@Qualifier("firstDbEntityManagerFactory") EntityManagerFactory firstDbEntityManagerFactory) {
		return new JpaTransactionManager(firstDbEntityManagerFactory);
	}
}
