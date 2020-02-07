package spring.boot.rest.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.boot.rest.api.dao.StudentAddressRepository;
import spring.boot.rest.api.entity.StudentAddress;
import spring.boot.rest.api.services.StudentAddressServices;

@Service
public class StudentAddressImpl implements StudentAddressServices {

	@Autowired
	public StudentAddressRepository address;
	
	@Override
	public StudentAddress save(StudentAddress studentAddress) {
		// TODO Auto-generated method stub
		return address.save(studentAddress);
	}

	@Override
	public List<StudentAddress> getAllStudentAddress() {
		// TODO Auto-generated method stub
		return address.findAll();
	}

	@Override
	public StudentAddress getStudentAddress(Long studentid) {
		// TODO Auto-generated method stub
		return address.findById(studentid).get();
	}

	@Override
	public void deletStudentAddress(Long studentid) {
	
              address.deleteById(studentid);

	}

	
	public StudentAddress updateStudentAddress(StudentAddress studentAddress) {
		
		return address.saveAndFlush(studentAddress);
		
	}
}
