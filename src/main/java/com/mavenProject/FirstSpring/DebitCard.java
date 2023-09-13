package com.mavenProject.FirstSpring;

public class DebitCard implements Payment {

	@Override
	public String pay() {

		return "Payment done through Debit Card";
	}

}
