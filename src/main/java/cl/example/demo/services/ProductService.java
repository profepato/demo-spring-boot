package cl.example.demo.services;

import cl.example.demo.domain.ProductDto;
import cl.example.demo.domain.responses.ProductResponse;

public interface ProductService {
    ProductResponse getProducts();

    ProductDto getProduct(Integer productId);
}
