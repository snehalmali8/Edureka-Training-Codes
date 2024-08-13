package com.org.SpringbootEmployeeService.contoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.SpringbootEmployeeService.model.Employee;
import com.org.SpringbootEmployeeService.service.EmployeeService;
@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private EmployeeService ser;
	@GetMapping("/all")
	public List<Employee> getAllEmployees(){
			return ser.getAllEmployee();
	}
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
		Optional<Employee> employee = ser.getEmployeeById(id);
		return employee.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

	
	@PostMapping
	public ResponseEntity<Employee> createEnployee(@RequestBody Employee employee) {
		Employee e = ser.saveEmployee(employee);
		return new ResponseEntity<>(e, HttpStatus.CREATED);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails){
		Optional<Employee> optionalEmployee = ser.getEmployeeById(id);
		if(optionalEmployee.isPresent()) {
			Employee employee = optionalEmployee.get();
			employee.setName(employeeDetails.getName());
			employee.setSalary(employeeDetails.getSalary());
			employee.setSkill(employeeDetails.getSkill());
			return ResponseEntity.ok(ser.updateEmployee(employee));
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
}
