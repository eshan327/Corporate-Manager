package net.javaguides.springboot.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Employee;

@Repository
public interface EmployeeBase extends JpaRepository<Employee, Long> {

}