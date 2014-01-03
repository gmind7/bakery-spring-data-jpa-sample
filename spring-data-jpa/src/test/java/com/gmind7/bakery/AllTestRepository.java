package com.gmind7.bakery;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import com.gmind7.bakery.customer.TestCustomerRepository;
import com.gmind7.bakery.employee.TestEmployeeRepository;
import com.gmind7.bakery.handler.RoutingDataSource;
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
public class AllTestRepository {
	
	@Autowired
	private RoutingDataSource dataSource;
	
	@Before
	public void initScriptSQL() throws SQLException {
		ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
		populator.addScript(new ClassPathResource("src/test/META-INF/mysqlsampledatabase.sql"));
		Connection connection = dataSource.getConnection();
		populator.populate(connection);
	}
	
}
