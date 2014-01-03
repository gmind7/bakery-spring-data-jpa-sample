package com.gmind7.bakery.employee;

import static org.junit.Assert.assertNotNull;

import javax.transaction.Transactional;

import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gmind7.bakery.config.AbstractApplicationTest;
import com.gmind7.bakery.domain.Employees;

@Slf4j
@Transactional
public class TestEmployeeRepository extends AbstractApplicationTest {
	
	@Autowired
	private EmployeeRepository repository;
	
	private Employees employee;
	
	@Test
	public void test(){
		employee = repository.findOne(1002L);
		log.debug("office {}", employee.getOffice());
		log.debug("reportsToEmployee {}", employee.getReportsToEmployee().toString());
		log.debug("customers {}", employee.getCustomers().toString());
		log.debug("employee {}", employee.toString());
		assertNotNull(employee);
	}
	
}
