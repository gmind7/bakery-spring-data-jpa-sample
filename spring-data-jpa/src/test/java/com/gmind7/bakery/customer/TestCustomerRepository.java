package com.gmind7.bakery.customer;

import static org.junit.Assert.assertNotNull;

import javax.transaction.Transactional;

import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gmind7.bakery.config.AbstractApplicationTest;
import com.gmind7.bakery.domain.Customers;

@Slf4j
@Transactional
public class TestCustomerRepository extends AbstractApplicationTest {
	
	@Autowired
	private CustomerRepository repository;
	
	@Test
	public void findOne(){
		Customers customer = repository.findOne(103L);
		log.debug("customer {}", customer.toString());
		log.debug("salesRepEmployee {}", customer.getSalesRepEmployee().toString());
		log.debug("orders {}", customer.getOrders().toString());
		assertNotNull(customer);
	}
	
}
