package base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Employee;

@Repository
public interface EmployeeBase extends JpaRepository<Employee, Long> {

}