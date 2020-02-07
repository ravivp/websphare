package spring.boot.rest.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.boot.rest.api.dao.StudentRepository;
import spring.boot.rest.api.entity.Student;
import spring.boot.rest.api.services.StudentServices;

@Service
public class StudentServiceImpl implements StudentServices {

	
	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public Student save(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student getStudent(Long studentid) {
		// TODO Auto-generated method stub
		return studentRepository.findById(studentid).get();
	}

	@Override
	public void deleteStudent(Long studentid) {
		studentRepository.deleteById(studentid);

	}

	@Override
	public Student update(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

}
