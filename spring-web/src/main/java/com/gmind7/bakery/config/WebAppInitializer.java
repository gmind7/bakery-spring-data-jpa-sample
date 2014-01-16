package com.gmind7.bakery.config;

import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.filter.ShallowEtagHeaderFilter;

import com.gmind7.bakery.filter.CorsFilter;

public class WebAppInitializer extends AbstractWebAppInitializer {

	@Override
	protected javax.servlet.Filter[] getServletFilters() {
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("UTF-8");
		encodingFilter.setForceEncoding(true);
		return new javax.servlet.Filter[] { encodingFilter, 
											new OpenEntityManagerInViewFilter(),
			                                new CorsFilter(), 
			                                new HiddenHttpMethodFilter(), 
			                                new ShallowEtagHeaderFilter()};
	}

}
