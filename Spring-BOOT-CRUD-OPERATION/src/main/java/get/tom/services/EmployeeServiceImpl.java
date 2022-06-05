package get.tom.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import get.tom.mvc.model.Employee;
import get.tom.repositories.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	// To show list of Employee
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	// To save Employee in DB
	@Override
	public void saveEmployee(Employee employee) {
		this.employeeRepository.save(employee);
	}

	//to update Employee
	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> optional = employeeRepository.findById(id);
		Employee employee = null;

		if (optional.isPresent()) {
			employee = optional.get();
		} else {
			throw new RuntimeException("Employee not found for id" + id);

		}
		return employee;
	}

	@Override
	public void deleteEmployeeById(long id) {
         this.employeeRepository.deleteById(id);
	}

}
