package spring.boot.rest.api.services;

import java.util.List;

import spring.boot.rest.api.entity.StudentAddress;

public interface StudentAddressServices {

	public StudentAddress save(StudentAddress studentAddress);
	
	public List<StudentAddress> getAllStudentAddress();
	
	public StudentAddress getStudentAddress(Long studentid);
	public StudentAddress updateStudentAddress(StudentAddress studentAddress);
	
    public void deletStudentAddress(Long studentid);
}
