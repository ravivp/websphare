package spring.boot.rest.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.boot.rest.api.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
