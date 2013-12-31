package com.gmind7.bakery.repository;

import static org.junit.Assert.assertEquals;

import javax.transaction.Transactional;

import lombok.extern.slf4j.Slf4j;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gmind7.bakery.config.AbstractApplicationTest;
import com.gmind7.bakery.domain.Baker;
import com.gmind7.bakery.domain.Bakery;

@Slf4j
@Transactional
public class TestBakerJpaRepository extends AbstractApplicationTest {
	
	@Autowired
	private BakerJpaRepository repository;
	
	private Baker baker;
	
	@Before
	public void before(){
		Baker baker = new Baker(1L);
		baker.setUsername("daesungkim");
		baker.setFirstname("kim");
		baker.setLastname("daesung");
		
		Bakery bakery = new Bakery(1L);
		bakery.setBakeryname("Gmind7BakeryHouse");
		baker.setBakery(bakery);
		
		this.baker = repository.save(baker);
		this.baker.getBakery();
	}
	
	@Test
	public void test(){
		Baker result = repository.findOne(this.baker.getId());
		log.debug("Lazy GetBakery {}", result.getBakery());
		assertEquals(baker, result);
	}
	
}
