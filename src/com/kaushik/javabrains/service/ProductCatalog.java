package com.kaushik.javabrains.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.kaushik.javabrains.business.ProductServiceImpl;
import com.kaushik.javabrains.model.Product;

@WebService(endpointInterface="com.kaushik.javabrains.service.ProductCatalogInterface"
,portName="TestMartCatalogPort"
,serviceName="TestMartCatalogService")
public class ProductCatalog implements ProductCatalogInterface {
	ProductServiceImpl productService=new ProductServiceImpl();
	
	@Override
	public List<String>getProductCategories(){
		return productService.getProductCategories();
	
	}
	
	@Override
	public List<String> getProducts(String category){
		return productService.getProducts(category);
	}
	

	@Override
	public boolean addProduct(String category,String product){
		return productService.addProduct(category, product);
	}
	
	@Override
	public List<Product> getProductsV2(){
		return productService.getProductsV2();
	} 
	
}
