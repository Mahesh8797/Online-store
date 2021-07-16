package com.naukri.Dao;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.naukri.model.EmployeeBean;

@Repository
public class EmployeeDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	public DataSource getDataSource() {
		return dataSource;
	}
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate  = new JdbcTemplate(dataSource);
	}
	
	public int add(EmployeeBean employeeBean)
	{
		String sql="insert into emp values(?,?,?)";
		return jdbcTemplate.update(sql, new Object[] {employeeBean.getName(),employeeBean.getSkills(),employeeBean.getSummary()});
	}
	
	public List<Map<String, Object>> retrive()
	{
		String sql="select * from emp";
		return jdbcTemplate.queryForList(sql);
	}
}
