package com.kaushik.javabrains.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.kaushik.javabrains.business.ProductServiceImpl;

@WebService(name="TestMartCatalog",portName="TestMartCatalogPort"
				,serviceName="TestMartCatalogService"
				,targetNamespace="http://www.testmart.com")
public class ProductCatalog {
	ProductServiceImpl productService=new ProductServiceImpl();
	
	@WebMethod(action="fetch_Categories", operationName="fetchCategories")
	public List<String>getProductCategories(){
		return productService.getProductCategories();
	
	}
	
	@WebMethod(exclude=true)
	public List<String> getProducts(String category){
		return productService.getProducts(category);
	}
	
	@WebMethod(exclude=true)
	public boolean addProduct(String category,String product){
		return productService.addProduct(category, product);
	}
	
}
