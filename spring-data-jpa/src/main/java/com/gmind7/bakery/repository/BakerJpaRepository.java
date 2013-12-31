package com.gmind7.bakery.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.gmind7.bakery.domain.Baker;

public interface BakerJpaRepository extends PagingAndSortingRepository<Baker, Long> {

}