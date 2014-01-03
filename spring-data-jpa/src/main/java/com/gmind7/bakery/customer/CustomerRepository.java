package com.gmind7.bakery.customer;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.gmind7.bakery.domain.Customers;

public interface CustomerRepository extends PagingAndSortingRepository<Customers, Long> {

}