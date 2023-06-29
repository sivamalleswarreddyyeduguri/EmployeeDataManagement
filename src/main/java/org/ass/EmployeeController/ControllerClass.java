package org.ass.EmployeeController;

import org.ass.EmployeeEntity.Employee;
import org.ass.EmployeeService.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerClass {
	@Autowired
	  private ServiceClass serviceClass;
	
  @GetMapping("/saveDetails")
	public ModelAndView saveDetails(Employee employee) {
            
		System.out.println(employee);
		serviceClass.SendData(employee);
		return new ModelAndView("index.jsp");
	}
}
