//package com.pavan.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import javax.print.attribute.standard.MediaSize.Other;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.pavan.model.Product;
//import com.pavan.repository.ProductRepository;
//
//@Service
//public class ProductService {
//
//	@Autowired
//	private  ProductRepository dao;
//
//	
//	
//	// Add Product 
//	public Product addProduct(Product product) {
//		return dao.save(product);
//		
//	}
//	
//    // add all products 
//	public List<Product> addAllProducts(List<Product> products){
//		return dao.saveAll(products);
//	}
//	
//	//get Product
//	public  Product getProductbyId(int id) {
//		return dao.findById(id).orElse(other:null);
//	}
//	
//}
