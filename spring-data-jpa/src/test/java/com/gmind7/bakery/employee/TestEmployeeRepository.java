package com.gmind7.bakery.employee;

import static org.junit.Assert.assertNotNull;

import javax.transaction.Transactional;

import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.gmind7.bakery.config.AbstractApplicationTest;
import com.gmind7.bakery.domain.Employees;
import com.gmind7.bakery.domain.QEmployees;
import com.mysema.query.types.expr.BooleanExpression;

@Slf4j
@Transactional
public class TestEmployeeRepository extends AbstractApplicationTest {
	
	@Autowired
	private EmployeeRepository repository;
	
	@Test
	public void findOne(){
		Employees employee = repository.findOne(1002L);
		log.debug("office {}", employee.getOffice());
		log.debug("reportsToEmployee {}", employee.getReportsToEmployee().toString());
		log.debug("customers {}", employee.getCustomers().toString());
		log.debug("employee {}", employee.toString());
		assertNotNull(employee);
	}
	
	@Test
	public void findBySearch1(){
		final QEmployees Qemployees = QEmployees.employees;
		Page<Employees> employee = repository.findAll(Qemployees.officeCode.eq(1L), new PageRequest(0, 5));
		log.debug("findBySearch1 {}", employee.getContent().toString());
		assertNotNull(employee);
	}
	
	@Test
	public void findBySearch2(){
		BooleanExpression employeeNumber = QEmployees.employees.id.eq(1002L);
		BooleanExpression officeCode = QEmployees.employees.officeCode.eq(1L);
		Page<Employees> employee = repository.findAll(employeeNumber.and(officeCode), new PageRequest(0, 5));
		log.debug("findBySearch2 {}", employee.getContent().toString());
		assertNotNull(employee);
	}
	
	@Test
	public void QFindByOfficeCode(){
		Page<Employees> employee = repository.QFindByOfficeCode(1L, new PageRequest(0, 5));
		log.debug("QFindByOfficeCode {}", employee.getContent().toString());
		assertNotNull(employee);
	}
	
	@Test
	public void QFindByJoinOfficeCode(){
		Page<Employees> employee = repository.QFindByJoinOfficeCode(1L, new PageRequest(0, 5));
		log.debug("QFindByJoinOfficeCode {}", employee.getContent().toString());
		assertNotNull(employee);
	}
	
}
