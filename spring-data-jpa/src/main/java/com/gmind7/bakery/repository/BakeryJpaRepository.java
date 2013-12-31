package com.gmind7.bakery.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.gmind7.bakery.domain.Bakery;

public interface BakeryJpaRepository extends PagingAndSortingRepository<Bakery, Long> {

}