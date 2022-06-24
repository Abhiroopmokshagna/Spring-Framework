package com.abhiroop.spring.springin10steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {
	// from property file
//	private String url;
	
	@Value("${external.service.url}")
	private String url;
	
	public String returnServiceUrl() {
		return url;
	}
}
