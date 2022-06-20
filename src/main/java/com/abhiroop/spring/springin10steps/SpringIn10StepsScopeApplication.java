package com.abhiroop.spring.springin10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.abhiroop.spring.springin10steps.scope.PersonDAO;

@SpringBootApplication
public class SpringIn10StepsScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsScopeApplication.class);
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringIn10StepsScopeApplication.class, args);
		PersonDAO personDao1 =applicationContext.getBean(PersonDAO.class);
		PersonDAO personDao2 =applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}", personDao1);
		LOGGER.info("{}", personDao1.getJdbcConnection());
		
		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());
	}

}
