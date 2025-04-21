package com.qa.automationtesting.testcases;

import org.apache.commons.lang3.RandomStringUtils;

class Parent{
	void car(){
		System.out.println("it is a parent car ");
		
	}
	
	void bmw() {
		System.out.println("it is parent bmw");
		car();
	}
}


class Child extends Parent{
	void car() {
		System.out.println("it is child car");
		super.car();
	}
	void bmw() {
		super.bmw();
		System.out.println("it is child bmw");
	}
}





public class Class {

	public static void main(String[] args) {
		
		Child c = new Child();
		//c.car();
		c.bmw();
		String email = RandomStringUtils.randomAlphanumeric(5) + "@gmail.com";
		System.out.println(email);

	}

}
