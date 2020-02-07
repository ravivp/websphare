package spring.boot.rest.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.boot.rest.api.entity.StudentAddress;

public interface StudentAddressRepository extends JpaRepository<StudentAddress, Long> {

}
