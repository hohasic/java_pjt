package com.office.methodex;

import java.util.HashMap;

public class Calculator {

	public float addOperator(int n1, int n2) {
		
		int result = n1 + n2;
		// System.out.println("result: " + result);
		
		return (float) result;
		
	}
	
	/*
	public Car productCar() {
		
		Car car = new Car();
		return car;
		
	}
	*/
	
	public Object productCar() {
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		
		Car car = new Car();
		return car;
		
	}
	
}
