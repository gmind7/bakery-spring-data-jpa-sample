package com.gmind7.bakery.order;

import static org.junit.Assert.assertNotNull;

import javax.transaction.Transactional;

import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gmind7.bakery.config.AbstractApplicationTest;
import com.gmind7.bakery.domain.OrderDetails;
import com.gmind7.bakery.domain.ids.OrderDetailsIDs;

@Slf4j
@Transactional
public class TestOrderDetailRepository extends AbstractApplicationTest {
	
	@Autowired
	private OrderDetailRepository repository;
	
	@Test
	public void findOne(){
		OrderDetails orderDetail = repository.findOne(new OrderDetailsIDs(10100L, "S18_1749"));
		log.debug("order {}", orderDetail.getOrder().toString());
		log.debug("product {}", orderDetail.getProduct().toString());
		log.debug("orderDetail {}", orderDetail.toString());
		assertNotNull(orderDetail);
	}
	
}