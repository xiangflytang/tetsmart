package com.kaushik.javabrains.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.kaushik.javabrains.business.ProductServiceImpl;

@WebService
public class ProductCatalog {
	ProductServiceImpl productService=new ProductServiceImpl();
	
	@WebMethod
	public List<String>getProductCategories(){
		return productService.getProductCategories();
	
	}
	
	public List<String> getProducts(String category){
		return productService.getProducts(category);
	}
	
	public boolean addProduct(String category,String product){
		return productService.addProduct(category, product);
	}
	
}
