package com.abhiroop.spring.springin10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.abhiroop.spring.springin10steps.cdi.SomeCDIBusiness;

@Configuration
@ComponentScan
@ComponentScan("com.abhiroop.spring.springin10steps.cdi")
public class SpringIn10StepsCDIApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsCDIApplication.class);
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn10StepsCDIApplication.class)) {
		SomeCDIBusiness business =applicationContext.getBean(SomeCDIBusiness.class);
		
		LOGGER.info("{} - dao {}", business, business.getSomeCDIDAO());
		}
	}

}
