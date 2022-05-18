package com.tns.client;

import com.tns.entities.Student;
import com.tns.service.StudentService;
import com.tns.service.StudentServiceImpl;

public class Client 
{
	public static void main(String[]args)
	{
		StudentService service = new StudentServiceImpl();
		Student student = new Student();
		student.setID(11);
		student.setName("Nani");
		service.addStudent(student);
		
		student=service.findStudentById(11);
		System.out.println("ID: "+student.getID());
		System.out.println("Name: "+student.getName());
		
		student=service.findStudentById(11);
		student.setName("Lokesh");
		service.updateStudent(student);
	}
}
