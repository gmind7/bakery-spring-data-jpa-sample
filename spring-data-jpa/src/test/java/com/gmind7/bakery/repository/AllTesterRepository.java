package com.gmind7.bakery.repository;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TestBakeryJpaRepository.class,
	TestBakerJpaRepository.class
})
public class AllTesterRepository {

}