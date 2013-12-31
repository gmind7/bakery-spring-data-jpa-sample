package com.gmind7.bakery.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class EhCacheConfig extends AbstractEhCacheConfig {
	
	@Bean
	@Override
	public EhCacheCacheManager cacheManager() {
		EhCacheCacheManager ehCacheCacheManager = new EhCacheCacheManager();
    	ehCacheCacheManager.setCacheManager(this.ehCacheManagerFactory().getObject());
        return ehCacheCacheManager;
	}

	@Override
	public String getEhcacheConfigResource() {
		return "META-INF/ehcache.xml";
	}
	
}
