package com.abhiroop.spring.springin10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.abhiroop.spring.basics.componentscan.ComponentDAO;
import com.abhiroop.spring.springin10steps.scope.PersonDAO;

@SpringBootApplication
@ComponentScan("com.abhiroop.spring.basics.componentscan")
public class SpringIn10StepsComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsComponentScanApplication.class);
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringIn10StepsComponentScanApplication.class, args);
		ComponentDAO componentDao =applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}", componentDao);
	}

}
