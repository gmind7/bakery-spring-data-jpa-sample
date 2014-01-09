package com.gmind7.bakery.office;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.gmind7.bakery.domain.Offices;

public interface OfficeRepository extends PagingAndSortingRepository<Offices, Long>, QueryDslPredicateExecutor<Offices>, OfficeRepositoryCustom {
	
	List<Offices> findBycountry(String country, Pageable pageable);
	
	List<Offices> findBycountry(String country);
	
	@Query(value = "SELECT * FROM offices WHERE city = ?1", nativeQuery = true)
	List<Offices> findByCity(String city);
	
	@Modifying
	@Query("UPDATE #{#entityName} SET territory = :territory WHERE officeCode = :officeCode")
	int setTerritory(@Param("officeCode") long officeCode, @Param("territory") String territory);
	
}