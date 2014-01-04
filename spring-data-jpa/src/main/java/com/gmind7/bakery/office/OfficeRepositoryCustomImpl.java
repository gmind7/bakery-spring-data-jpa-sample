package com.gmind7.bakery.office;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import com.gmind7.bakery.domain.Offices;

public class OfficeRepositoryCustomImpl extends QueryDslRepositorySupport implements OfficeRepositoryCustom {
	
	public OfficeRepositoryCustomImpl()	{
		super(Offices.class);
	}
	
	@PersistenceContext
	private EntityManager em;
	
}
