package com.mavenProject.FirstSpring;

public class BillCollector {
	private Payment p;
	

	public Payment getP() {
		return p;
	}

	public void setP(Payment p) {
		this.p = p;
	}

	

	public void Payment() {
		String result = p.pay();
		System.out.println(result);

	}

}
