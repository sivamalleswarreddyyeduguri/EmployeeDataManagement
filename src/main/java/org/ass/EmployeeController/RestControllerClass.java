package org.ass.EmployeeController;

import java.util.List;

import org.ass.EmployeeEntity.Employee;
import org.ass.EmployeeRepository.RepositoryClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerClass {
     
	@Autowired
	RepositoryClass repositoryClass;
	
	@PostMapping(value = "/InsertDataDetails")
	public @ResponseBody void InsertData( @RequestBody Employee employee) {
		repositoryClass.SaveObject(employee);
	}
	
	@GetMapping("/GetData")
	public @ResponseBody List<Employee> GetData(@RequestBody Employee employee) {
		   return repositoryClass.getAllData();
	}
}
