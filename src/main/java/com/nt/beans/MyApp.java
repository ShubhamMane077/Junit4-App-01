package com.nt.beans;

public class MyApp {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		
		Integer result = calc.add(10, 40);
		System.out.println(result);
	}

}
