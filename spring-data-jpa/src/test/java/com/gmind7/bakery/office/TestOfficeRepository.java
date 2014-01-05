package com.gmind7.bakery.office;

import static org.junit.Assert.assertNotNull;

import javax.transaction.Transactional;

import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

import com.gmind7.bakery.config.AbstractApplicationTest;
import com.gmind7.bakery.domain.Offices;

@Slf4j
@Transactional
public class TestOfficeRepository extends AbstractApplicationTest {
	
	@Autowired
	private OfficeRepository repository;
	
	@Test
	public void findOne(){
		Offices office = repository.findOne(1L);
		log.debug("office {}", office.toString());
		log.debug("employees {}", office.getEmployees().toString());
		assertNotNull(office);
	}
	
	@Test
	public void saveNdelete(){
		Offices office = new Offices();
		office.setCity("city");
		office.setPhone("phone");
		office.setAddressLine1("address1");
		office.setAddressLine2("address2");
		office.setState("state");
		office.setCountry("country");
		office.setPostalCode("postalCode");
		office.setTerritory("territory");
		
		repository.save(office);
		repository.delete(office.getId());
	}
	
	@Test
	public void setTerritory(){
		repository.setTerritory(1L, "modify");
	}
	
	@Test
	public void findByCity(){
		assertNotNull(repository.findByCity("London"));
	}
	
	@Test
	public void findBycountry(){
		assertNotNull(repository.findBycountry("USA"));
	}
	
	@Test
	public void findByPagecountry(){
		assertNotNull(repository.findBycountry("USA", new PageRequest(0, 5)));
	}
}