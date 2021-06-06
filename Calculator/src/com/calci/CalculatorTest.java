package com.calci;

public class CalculatorTest {
	public static void main(String[] args) {
		
		Calculator cc = new Calculator();
		
		int addition = cc.addition(5, 89);
		System.out.println(addition);
		
		int substraction = cc.substraction(5, 89);
		System.out.println(substraction);
		
		int multiplication = cc.multiplication(5, 89);
		System.out.println(multiplication);
		
		int division = cc.division(5, 89);
		System.out.println(division);
		
	}

}
