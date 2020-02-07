package spring.boot.rest.api.services;

import java.util.List;

import spring.boot.rest.api.entity.Employee;

public interface EmployeeServices {

	
	Employee create_services(Employee employee);
	
	Employee update_services(Employee employee);
	
	List<Employee> getAllEmployee();
	
	Employee getEmployee(Long employeeid);
	
	void delete_service(Long employeeid);
}
