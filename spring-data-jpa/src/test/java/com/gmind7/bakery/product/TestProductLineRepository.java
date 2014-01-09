package com.gmind7.bakery.product;

import static org.junit.Assert.assertNotNull;

import javax.transaction.Transactional;

import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gmind7.bakery.config.AbstractApplicationTest;
import com.gmind7.bakery.domain.ProductLines;

@Slf4j
@Transactional
public class TestProductLineRepository extends AbstractApplicationTest {
	
	@Autowired
	private ProductLineRepository repository;
	
	@Test
	public void findOne(){
		ProductLines productLine = repository.findOne("Classic Cars");
		log.debug("productLine {}", productLine.toString());
		log.debug("products {}", productLine.getProducts().toString());
		assertNotNull(productLine);
	}
	
}
