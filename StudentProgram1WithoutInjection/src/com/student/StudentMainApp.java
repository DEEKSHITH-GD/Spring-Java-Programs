package com.student;

public class StudentMainApp {

	public static void main(String[] args) {
		Student s = new Student();
		s.setId(1);
		s.setName("Deekshith");
		s.setCollege("SCE");
		s.setUsn("1SG19CS025");
		s.setAge(22);
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getCollege());
		System.out.println(s.getUsn());
		System.out.println(s.getAge());
	}

}
