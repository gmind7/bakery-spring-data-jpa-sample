package com.gmind7.bakery.order;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.gmind7.bakery.domain.Orders;

public interface OrderRepository extends PagingAndSortingRepository<Orders, Long> {

}