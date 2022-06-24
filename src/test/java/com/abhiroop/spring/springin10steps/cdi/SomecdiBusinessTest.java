package com.abhiroop.spring.springin10steps.cdi;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.abhiroop.spring.springin10steps.SpringIn10StepsBasicApplication;

@RunWith(MockitoJUnitRunner.class)
public class SomecdiBusinessTest {
	
	//Create mock
	@Mock
	SomeCDIDAO someCdiDao;
	
	//Inject mocks
	@InjectMocks
	SomeCDIBusiness business;
	
	@Test
	public void testBasicScenario() {
		Mockito.when(someCdiDao.getData()).thenReturn(new int[] {5, 6, 10, 30});
		// call method on business
		int result = business.findGreatest();
		//check if the value is correct
		assertEquals(30, result);
	}

	@Test
	public void testBasicScenario2() {
		Mockito.when(someCdiDao.getData()).thenReturn(new int[] {});
		// call method on business
		int result = business.findGreatest();
		//check if the value is correct
		assertEquals(Integer.MIN_VALUE, result);
	}
}
