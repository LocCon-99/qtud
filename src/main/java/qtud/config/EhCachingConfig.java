package qtud.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.support.CompositeCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import qtud.component.CustomKeyGenerator;

@Configuration
@EnableCaching
public class EhCachingConfig extends CachingConfigurerSupport {
	@Value("${spring.cache.ehcache.config}")
	private String ehcacheConfigPath;

	@Bean({"customKeyGenerator"})
	public KeyGenerator keyGenerators() {
		return new CustomKeyGenerator();
	}

	@Bean
	public EhCacheManagerFactoryBean ehCacheManagerFactoryBean() {
		EhCacheManagerFactoryBean cacheManagerFactoryBean = new EhCacheManagerFactoryBean();
		cacheManagerFactoryBean.setConfigLocation(new ClassPathResource(this.ehcacheConfigPath));
		cacheManagerFactoryBean.setShared(true);
		return cacheManagerFactoryBean;
	}

	@Bean
	public CacheManager compositeCacheManager(@Autowired EhCacheManagerFactoryBean factoryBean) {
		EhCacheCacheManager ehCacheCacheManager = this.ehCacheCacheManager(factoryBean);
		CompositeCacheManager cacheManager = new CompositeCacheManager(new CacheManager[]{ehCacheCacheManager});
		cacheManager.setFallbackToNoOpCache(true);
		cacheManager.afterPropertiesSet();
		return cacheManager;
	}

	private EhCacheCacheManager ehCacheCacheManager(EhCacheManagerFactoryBean factoryBean) {
		EhCacheCacheManager ehCacheCacheManager = new EhCacheCacheManager(factoryBean.getObject());
		ehCacheCacheManager.initializeCaches();
		return ehCacheCacheManager;
	}
}
