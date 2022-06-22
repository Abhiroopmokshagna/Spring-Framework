package com.abhiroop.spring.springin10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.abhiroop.spring.springin10steps.xml.XMLPersonDAO;

public class SpringIn10StepsXmlContextApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsXmlContextApplication.class);
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml")) {
			LOGGER.info("Beans Loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());
		XMLPersonDAO personDAO =applicationContext.getBean(XMLPersonDAO.class);
		LOGGER.info("{}", personDAO);
		LOGGER.info("jdbc - {}",personDAO.getJdbcConnection());
	}
	}

}
