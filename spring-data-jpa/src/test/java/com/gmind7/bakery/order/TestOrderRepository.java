package com.gmind7.bakery.order;

import static org.junit.Assert.assertNotNull;

import javax.transaction.Transactional;

import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gmind7.bakery.config.AbstractApplicationTest;
import com.gmind7.bakery.domain.Orders;

@Slf4j
@Transactional
public class TestOrderRepository extends AbstractApplicationTest {
	
	@Autowired
	private OrderRepository repository;
	
	@Test
	public void findOne(){
		Orders order = repository.findOne(10100L);
		log.debug("customer {}", order.getCustomer().toString());
		log.debug("order {}", order.toString());
		assertNotNull(order);
	}
	
}
