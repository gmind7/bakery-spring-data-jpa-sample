package com.gmind7.bakery.config;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
public abstract class AbstractApplicationTest {
	
	@Autowired
	private AuditorAwareOperations auditorAware;
	
	@Before
	public void AuditorAware(){
		auditorAware.setAuditor(1L);
	}
}
