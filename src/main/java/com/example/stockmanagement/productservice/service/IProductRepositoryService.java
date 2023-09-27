package com.example.stockmanagement.productservice.service;

import com.example.stockmanagement.productservice.entity.Product;
import com.example.stockmanagement.productservice.enums.Language;
import com.example.stockmanagement.productservice.request.ProductCreateRequest;
import com.example.stockmanagement.productservice.request.ProductUpdateRequest;

import java.util.List;

public interface IProductRepositoryService {


    Product createProduct(Language language, ProductCreateRequest productCreateRequest);


    Product getProduct(Language language, Long productId);


    List<Product>  getProducts(Language language);

    Product updateProduct(Language language, Long productId, ProductUpdateRequest productUpdateRequest);

    Product deleteProduct(Language language,Long productId);

}
