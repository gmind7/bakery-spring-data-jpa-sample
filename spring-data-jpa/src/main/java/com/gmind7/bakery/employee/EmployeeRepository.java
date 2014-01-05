package com.gmind7.bakery.employee;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.gmind7.bakery.domain.Employees;

public interface EmployeeRepository extends PagingAndSortingRepository<Employees, Long>, QueryDslPredicateExecutor<Employees>, EmployeeRepositoryCustom  {

}