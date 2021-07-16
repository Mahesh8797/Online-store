package com.products.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.Dao.UpdateProductsDao;
import com.products.model.UpdateProduct;

@Service
public class UpdateProductService {

	@Autowired
	UpdateProductsDao updateProductsDao;
	
	public void add(UpdateProduct updateProduct)
	{
		int res=updateProductsDao.add(updateProduct);
		System.out.println(res +  " data added");
	}
	
	public List<Object> getProd()
	{
		List<Map<String,Object>> list= updateProductsDao.get();
		List<Object> li=new ArrayList<>();
		
		for(Map<String,Object> m: list)
		{
			li.add(m);
		}
		
		System.out.println(li);
		return li;
	}
}
