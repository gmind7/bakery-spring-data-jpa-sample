package com.gmind7.bakery.office;

import static org.junit.Assert.assertNotNull;

import javax.transaction.Transactional;

import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gmind7.bakery.config.AbstractApplicationTest;
import com.gmind7.bakery.domain.Offices;

@Slf4j
@Transactional
public class TestOfficeRepository extends AbstractApplicationTest {
	
	@Autowired
	private OfficeRepository repository;
	
	private Offices office;
	
	@Test
	public void test(){
		office = repository.findOne(1L);
		log.debug("office {}", office.toString());
		log.debug("employees {}", office.getEmployees().toString());
		assertNotNull(office);
	}
	
}
