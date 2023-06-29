package org.ass.EmployeeService;

import org.ass.EmployeeEntity.Employee;
import org.ass.EmployeeRepository.RepositoryClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
	 @Autowired
     private RepositoryClass repositoryClass;
     
     public void SendData(Employee employee) {
    	 repositoryClass.SaveObject(employee);
     }
}
