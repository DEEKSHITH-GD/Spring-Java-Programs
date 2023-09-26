package com.studentInject;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class StudentMainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s = (Student)context.getBean("stud");
		
		System.out.println(s);
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getCollege());
		System.out.println(s.getUsn());
		System.out.println(s.getAge());

	}

}

