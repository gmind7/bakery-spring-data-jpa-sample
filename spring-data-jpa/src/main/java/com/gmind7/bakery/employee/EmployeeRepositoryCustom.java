package com.gmind7.bakery.employee;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.gmind7.bakery.domain.Employees;

public interface EmployeeRepositoryCustom {
	
	Page<Employees> QFindByOfficeCode(long officeCode, Pageable pageable);
	
	Page<Employees> QFindByJoinOfficeCode(long officeCode, Pageable pageable);
}
