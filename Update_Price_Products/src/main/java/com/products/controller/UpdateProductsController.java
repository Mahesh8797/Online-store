package com.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.products.model.UpdateProduct;
import com.products.service.UpdateProductService;

@RestController
@CrossOrigin(origins="http://localhost:3001")
public class UpdateProductsController {

	@Autowired
	UpdateProductService updateProductService;
	
	@RequestMapping("/")
	public ModelAndView goTo()
	{			
		return new ModelAndView("start");
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addProd")
	//public String add(@RequestParam("id")int id ,@RequestParam("name")String name,@RequestParam("price") float price)
	public String add(@RequestBody UpdateProduct updateProduct)
	{
		
		  int id=updateProduct.getProductId(); String
		  name=updateProduct.getProductName(); float price=updateProduct.getPrice();		 		
		/*
		 * updateProduct.setProductId(id); updateProduct.setProductName(name);
		 * updateProduct.setPrice(price);
		 */
		
		updateProductService.add(updateProduct);
		System.out.println(" the data is "+ id +" "+name +" "+price);
		
		return "data added";
	}
	
	@RequestMapping("/getProdUpdatedData")
	public String getData()
	{
		return "update_product";
	}
}
