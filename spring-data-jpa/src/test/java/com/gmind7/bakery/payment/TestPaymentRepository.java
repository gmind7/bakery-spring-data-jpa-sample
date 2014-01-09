package com.gmind7.bakery.payment;

import static org.junit.Assert.assertNotNull;

import javax.transaction.Transactional;

import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gmind7.bakery.config.AbstractApplicationTest;
import com.gmind7.bakery.domain.Payments;
import com.gmind7.bakery.domain.ids.PaymentsIDs;

@Slf4j
@Transactional
public class TestPaymentRepository extends AbstractApplicationTest {
	
	@Autowired
	private PaymentRepository repository;
	
	@Test
	public void findOne(){
		Payments payment = repository.findOne(new PaymentsIDs(103L, "HQ336336"));
		log.debug("customer {}", payment.getCustomer().toString());
		log.debug("payment {}", payment.toString());
		assertNotNull(payment);
	}
	
}
