package com.gmind7.bakery.order;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.gmind7.bakery.domain.OrderDetails;
import com.gmind7.bakery.domain.ids.OrderDetailsIDs;

public interface OrderDetailRepository extends PagingAndSortingRepository<OrderDetails, OrderDetailsIDs> {

}