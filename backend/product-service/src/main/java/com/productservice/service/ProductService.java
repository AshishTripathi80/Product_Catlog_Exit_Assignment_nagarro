package com.productservice.service;

import com.productservice.model.MultipleProduct;
import com.productservice.model.Product;
import org.springframework.validation.BindingResult;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface ProductService {

    List<Product> getAllProducts();

    Product createProduct(Product product, BindingResult bindingResult);

    void validationError(BindingResult bindingResult);

    Product getProductById(Long id);

    List<Product> getProductByName(String name);

    List<Product> getProductByCode(UUID code);

    List<Product> getProductByBrand(String brand);

    Product updateProduct(Long id, Product productData, BindingResult bindingResult);

    void deleteProduct(Long id);

    List<Product> createMultipleProducts(MultipleProduct multipleProduct);

    List<Product> searchProducts(String name, UUID code, String brand, Long price);

    Map<String, Object> checkServiceabilityAndDeliveryTime(Long productId, String pincode);


}
