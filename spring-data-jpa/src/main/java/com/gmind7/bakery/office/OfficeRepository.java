package com.gmind7.bakery.office;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.gmind7.bakery.domain.Offices;

public interface OfficeRepository extends PagingAndSortingRepository<Offices, Long> {

}