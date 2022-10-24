package com.smallstone.springbootmall.dao;

import com.smallstone.springbootmall.dto.ProductQueryParams;
import com.smallstone.springbootmall.dto.ProductRequest;
import com.smallstone.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Integer countProduct(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void updateStock(Integer productId, Integer stock);

    void deleteProduct(Integer productId);
}
