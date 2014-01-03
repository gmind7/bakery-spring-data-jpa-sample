package com.gmind7.bakery.product;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.gmind7.bakery.domain.Products;

public interface ProductRepository extends PagingAndSortingRepository<Products, String> {

}