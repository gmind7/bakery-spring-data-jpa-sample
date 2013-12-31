package com.gmind7.bakery.config;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.gmind7.bakery.config.AppConfig;
import com.gmind7.bakery.support.AuditorAwareOperations;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@TransactionConfiguration(defaultRollback = true)
@ActiveProfiles("loc")
public abstract class AbstractIntegrationTest {

	@Resource(name="defaultDatasource")
	public org.apache.tomcat.jdbc.pool.DataSource defaultDatasource;

	@Autowired
	private AuditorAwareOperations auditorAware;
	
	@Before
	public void AuditorAware(){
		auditorAware.setAuditor(1L);
	}
	
	@Before
	public void 테스트데이터생성() throws SQLException {
		ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
		populator.addScript(new ClassPathResource("src/test/resources/init/data.sql"));
		Connection connection = defaultDatasource.getConnection();
		populator.populate(connection);
	}
}
