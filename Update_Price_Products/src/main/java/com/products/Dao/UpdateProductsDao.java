package com.products.Dao;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.products.model.UpdateProduct;

@Repository
public class UpdateProductsDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public DataSource getDataSource() {
		return dataSource;
	}
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate( dataSource);
	}
	
	public int add(UpdateProduct updateProduct)
	{
		String sql="insert into update_product values(?,?,?)";
		int res=jdbcTemplate.update(sql, new Object[] {updateProduct.getProductId(), updateProduct.getProductName()
				,updateProduct.getPrice()
		});
		return res;
	}
	
	public List<Map<String, Object>> get()
	{
		String sql="select * from update_product";
		return jdbcTemplate.queryForList(sql);	
	}
}
