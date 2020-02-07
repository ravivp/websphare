package spring.boot.rest.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.boot.rest.api.dao.Employeedao;
import spring.boot.rest.api.entity.Employee;
import spring.boot.rest.api.services.EmployeeServices;

@Service
public class EmployeeServiceImpl implements EmployeeServices {

	@Autowired
	Employeedao employeedao;
	
	@Override
	public Employee create_services(Employee employee) {
		// TODO Auto-generated method stub
		return employeedao.save(employee);
	}

	@Override
	public Employee update_services(Employee employee) {
		// TODO Auto-generated method stub
		return employeedao.saveAndFlush(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeedao.findAll();
	}

	@Override
	public Employee getEmployee(Long employeeid) {
		// TODO Auto-generated method stub
		return employeedao.findById(employeeid).get();
	}

	@Override
	public void delete_service(Long employeeid) {
		// TODO Auto-generated method stub
		employeedao.deleteById(employeeid);
	}

}
