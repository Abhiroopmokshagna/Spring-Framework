package com.abhiroop.spring.springin10steps.cdi;

import javax.inject.Named;

@Named
public class SomeCDIDAO {
	public int[] getData() {
		return new int[] {5, 20, 90, 30, 50};
	}
}
