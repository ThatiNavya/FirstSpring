package com.mavenProject.FirstSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext  p = new ClassPathXmlApplicationContext("Spring.xml");
		BillCollector bc = p.getBean("billcollector",BillCollector.class);
		bc.Payment();

	}

}
