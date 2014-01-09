package com.gmind7.bakery.product;

import static org.junit.Assert.assertNotNull;

import javax.transaction.Transactional;

import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gmind7.bakery.config.AbstractApplicationTest;
import com.gmind7.bakery.domain.Products;

@Slf4j
@Transactional
public class TestProductRepository extends AbstractApplicationTest {
	
	@Autowired
	private ProductRepository repository;
	
	@Test
	public void findOne(){
		Products product = repository.findOne("S10_1678");
		log.debug("product {}", product.toString());
		log.debug("productLine {}", product.getProductLine().toString());
		log.debug("orderDetails {}", product.getOrderDetails().toString());
		assertNotNull(product);
	}
	
}
