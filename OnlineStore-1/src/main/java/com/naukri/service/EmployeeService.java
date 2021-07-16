package com.naukri.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naukri.Dao.EmployeeDao;
import com.naukri.model.EmployeeBean;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public int add(EmployeeBean employeeBean)
	{
		return employeeDao.add(employeeBean);
	}
	
	public List<Map<String, Object>> retrive()
	{
		return employeeDao.retrive();
	}
}
