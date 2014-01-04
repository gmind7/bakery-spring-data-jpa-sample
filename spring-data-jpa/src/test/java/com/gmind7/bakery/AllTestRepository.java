package com.gmind7.bakery;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.gmind7.bakery.config.AbstractApplicationTest;
import com.gmind7.bakery.customer.TestCustomerRepository;
import com.gmind7.bakery.employee.TestEmployeeRepository;
import com.gmind7.bakery.office.TestOfficeRepository;
import com.gmind7.bakery.order.TestOrderDetailRepository;
import com.gmind7.bakery.order.TestOrderRepository;
import com.gmind7.bakery.payment.TestPaymentRepository;
import com.gmind7.bakery.product.TestProductLineRepository;
import com.gmind7.bakery.product.TestProductRepository;

@RunWith(Suite.class)
@SuiteClasses({
	TestOfficeRepository.class,
	TestEmployeeRepository.class,
	TestCustomerRepository.class,
	TestOrderRepository.class,
	TestOrderDetailRepository.class,
	TestPaymentRepository.class,
	TestProductLineRepository.class,
	TestProductRepository.class
})
public class AllTestRepository extends AbstractApplicationTest {
	
}
