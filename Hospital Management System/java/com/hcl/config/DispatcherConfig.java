package com.hcl.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		Class<?> arr[]= {AppContextConfig.class};
		return arr;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class<?> arr[]= {MvcWebConfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String s[]= {"/"};
		return s;
	}

}
