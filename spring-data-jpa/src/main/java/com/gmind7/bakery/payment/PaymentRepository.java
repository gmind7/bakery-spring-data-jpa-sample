package com.gmind7.bakery.payment;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.gmind7.bakery.domain.Payments;
import com.gmind7.bakery.domain.ids.PaymentsIDs;

public interface PaymentRepository extends PagingAndSortingRepository<Payments, PaymentsIDs> {

}