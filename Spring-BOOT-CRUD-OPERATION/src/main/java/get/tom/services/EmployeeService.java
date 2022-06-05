package get.tom.services;
import java.util.*;

import get.tom.mvc.model.Employee;

public interface EmployeeService {
	
   List<Employee> getAllEmployees();
   
   void saveEmployee(Employee employee);
   
   Employee getEmployeeById(long id);

   void deleteEmployeeById(long id);
   
}
