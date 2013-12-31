package com.gmind7.bakery.repository;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gmind7.bakery.config.AbstractApplicationTest;
import com.gmind7.bakery.domain.Baker;

public class TestBakerJpaRepository extends AbstractApplicationTest {
	
	@Autowired
	private BakerJpaRepository repository;
	
	private Baker baker;
	
	@Before
	public void initBaker(){
		Baker source = new Baker(1L);
		source.setUsername("daesungkim");
		source.setFirstname("kim");
		source.setLastname("daesung");
		this.baker = repository.save(source);
	}
	
	@Test
	public void test(){
		Baker result = repository.findOne(1L);
		assertEquals(baker, result);
	}
}
