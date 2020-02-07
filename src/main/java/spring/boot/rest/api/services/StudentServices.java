package spring.boot.rest.api.services;

import java.util.List;

import spring.boot.rest.api.entity.Student;

public interface StudentServices {

	
	public Student save(Student student);
	
	public List<Student> getAllStudent();
	
	public Student getStudent(Long studentid);
	
	public Student update(Student student);
	
	public void deleteStudent(Long studentid);
}
