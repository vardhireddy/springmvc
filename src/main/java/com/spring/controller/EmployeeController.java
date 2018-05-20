package com.spring.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("employees")
public class EmployeeController {
	
	@Autowired
	Employee employee;
    @RequestMapping(value = "/emp", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody Employee getEmployeeInJSON(@RequestParam String name) {
    	System.out.print("dsgsdagsgsd");
       employee.setName(name);
       employee.setEmail("employee1@genuitec.com");
    return employee; 
    }
    @RequestMapping(value = "/{name}.xml", method = RequestMethod.GET)
    public @ResponseBody Employee getEmployeeInXML(@PathVariable String name) {
       employee.setName(name);
     employee.setEmail("employee1@genuitec.com");
       return employee; 
    }
    
}