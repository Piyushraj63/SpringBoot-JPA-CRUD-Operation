package get.tom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import get.tom.mvc.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
   
	
}
