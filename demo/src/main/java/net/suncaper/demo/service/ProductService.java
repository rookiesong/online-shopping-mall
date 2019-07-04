package net.suncaper.demo.service;

import net.suncaper.demo.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> findProduct(String name);
    public Product findProductById(String productId);
    List <Product> recommendByType(String productId,String type);
}
