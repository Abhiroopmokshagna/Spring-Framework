package com.abhiroop.spring.springin10steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDIBusiness {
	
	@Inject
	private SomeCDIDAO someCDIDAO;

	public SomeCDIDAO getSomeCDIDAO() {
		return someCDIDAO;
	}

	public void setSomeCDIDAO(SomeCDIDAO someCDIDAO) {
		this.someCDIDAO = someCDIDAO;
	}
	
	public int findGreatest() {
		int greatest = Integer.MIN_VALUE;
		for (int value : this.someCDIDAO.getData()) {
			if (value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}
	
}
