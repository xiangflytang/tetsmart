package com.kaushik.javabrains.business;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {
	List<String> bookList=new ArrayList<>();
	List<String> musicList=new ArrayList<>();
	List<String> movieList=new ArrayList<>();
	
	public ProductServiceImpl(){
		bookList.add("inforno");
		bookList.add("joyland");
		bookList.add("the help");
		
		musicList.add("shake it off");
		musicList.add("all about that base");
		musicList.add("chandilier");
		
		movieList.add("furious");
		movieList.add("rush hour");
		movieList.add("hobbit");
		
	}
	public List<String> getProductCategories(){
		List<String>categories=new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
	
	public List<String>getProducts(String category){
		switch (category.toLowerCase()){
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		
		
		}
		return null;
	}
	public boolean addProduct(String category,String product){
		switch (category.toLowerCase()){
		case "books":
			bookList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		case "movies":
			movieList.add(product);
			break;
		default :
			return false;
		
		}
		return true;
	}
	
}
