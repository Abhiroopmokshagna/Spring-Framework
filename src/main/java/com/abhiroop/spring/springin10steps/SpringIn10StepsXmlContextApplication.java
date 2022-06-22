package com.abhiroop.spring.springin10steps;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.abhiroop.spring.springin10steps.xml.XMLPersonDAO;

public class SpringIn10StepsXmlContextApplication {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml")) {
		XMLPersonDAO personDAO =applicationContext.getBean(XMLPersonDAO.class);
		System.out.println(personDAO);
		System.out.println(personDAO.getJdbcConnection());
	}
	}

}
