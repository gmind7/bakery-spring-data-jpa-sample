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
public class TestBakeryJpaRepository extends AbstractApplicationTest {
	
	@Autowired
	private BakeryJpaRepository repository;
	
	private Bakery bakery;
	
	@Before
	public void before(){
		Bakery bakery = new Bakery(1L);
		bakery.setBakeryname("Gmind7BakeryHouse");
		
		Baker baker = new Baker(1L);
		baker.setUsername("daesungkim");
		baker.setFirstname("kim");
		baker.setLastname("daesung");
		
		bakery.addBaker(baker);
		
		this.bakery = repository.save(bakery);
		this.bakery.getBaker();
		
	}
	
	@Test
	public void test(){
		Bakery result = repository.findOne(this.bakery.getId());
		log.debug("Lazy GetBaker {}", result.getBaker());
		assertEquals(bakery, result);
	}
	
}
