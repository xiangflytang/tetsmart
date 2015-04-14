package com.kaushik.javabrains.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.kaushik.javabrains.model.Product;

@WebService(name="TestMartCatalog"
,targetNamespace="http://www.testmart.com")
public interface ProductCatalogInterface {


	@WebMethod(action="fetch_Categories", operationName="fetchCategories")
	public abstract List<String> getProductCategories();

	public abstract List<String> getProducts(String category);

	public abstract boolean addProduct(String category, String product);
	@WebResult(name="Product")
	public abstract List<Product> getProductsV2();

}