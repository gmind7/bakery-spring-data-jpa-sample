package com.gmind7.bakery.config;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.gmind7.bakery.handler.RoutingDataSource;

@Configuration
public class DataSourceConfig extends AbstractDataSourceConfig {

	@Inject 
	private Environment environment;
	
	@Bean(destroyMethod = "close")
	public DataSource defaultDataSource() {
		DataSource ds = parentDatasource();
		ds.setDriverClassName(environment.getRequiredProperty("default.ds.jdbc.driverClassName"));
		ds.setUrl(environment.getRequiredProperty("default.ds.jdbc.url"));		
		ds.setUsername(environment.getRequiredProperty("default.ds.jdbc.username"));
		ds.setPassword(environment.getRequiredProperty("default.ds.jdbc.password"));
		return parentDatasource();
	}
	
	@Override
	public RoutingDataSource dataSource() {
		RoutingDataSource routingDateSource = new RoutingDataSource();
		Map<Object, Object> targetDataSources = new HashMap<Object, Object>();
		targetDataSources.put(DataSourceType.DEFAULT, defaultDataSource());
		routingDateSource.setDefaultTargetDataSource(defaultDataSource());
		routingDateSource.setTargetDataSources(targetDataSources);
		return routingDateSource;
	}
	
}
