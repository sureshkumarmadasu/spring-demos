package com.samples.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("studentbean.xml");
		Student s = (Student) context.getBean("student1");

		System.out.println("Student details" + s);

	}
}
