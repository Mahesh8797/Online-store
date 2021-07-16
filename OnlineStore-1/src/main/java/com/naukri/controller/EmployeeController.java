package com.naukri.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.naukri.model.EmployeeBean;
import com.naukri.service.EmployeeService;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(method=RequestMethod.POST,value="/addEmp")
	public int add(@RequestBody EmployeeBean employeeBean)
	{
		
		System.out.println("Employee name is "+employeeBean.getName());
		int result= employeeService.add(employeeBean);
		System.out.println(result+" data added");
		return result;
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/retrive")
	public List<Map<String, Object>> retrive()
	{
		List<Map<String, Object>> l=employeeService.retrive();
		List<Object> list=new ArrayList<>();
		for(Map<String,Object> m: l)
		{
			list.add(m.values());
		}		
		return employeeService.retrive();	
	}
}
