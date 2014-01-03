package com.gmind7.bakery.product;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.gmind7.bakery.domain.ProductLines;

public interface ProductLineRepository extends PagingAndSortingRepository<ProductLines, String> {

}