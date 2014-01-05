package com.gmind7.bakery.employee;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import com.gmind7.bakery.domain.Employees;
import com.gmind7.bakery.domain.QEmployees;
import com.gmind7.bakery.domain.QOffices;
import com.mysema.query.SearchResults;
import com.mysema.query.jpa.JPQLQuery;

public class EmployeeRepositoryImpl extends QueryDslRepositorySupport implements EmployeeRepositoryCustom {
	
	public EmployeeRepositoryImpl() {
		super(Employees.class);
	}
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Page<Employees> QFindByOfficeCode(long officeCode, Pageable pageable) {
		//JPAQuery query = new JPAQuery(em);
		JPQLQuery query = from(QEmployees.employees).where(QEmployees.employees.officeCode.eq(officeCode));
		query = super.getQuerydsl().applyPagination(pageable, query);
		SearchResults<Employees> entitys = query.listResults(QEmployees.employees);
		return new PageImpl<Employees>(entitys.getResults(), pageable, entitys.getTotal());
	}

	@Override
	public Page<Employees> QFindByJoinOfficeCode(long officeCode, Pageable pageable) {
		JPQLQuery query = from(QEmployees.employees)
				          .innerJoin(QEmployees.employees.office, QOffices.offices)
				          .where(QEmployees.employees.officeCode.eq(officeCode));		
		query = super.getQuerydsl().applyPagination(pageable, query);
		SearchResults<Employees> entitys = query.listResults(QEmployees.employees);
		return new PageImpl<Employees>(entitys.getResults(), pageable, entitys.getTotal());
	}
	
}
