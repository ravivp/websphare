package spring.boot.rest.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.boot.rest.api.entity.Employee;

@Repository
public interface Employeedao extends JpaRepository<Employee, Long> {

}
