package cl.example.demo.services.impl;

import cl.example.demo.domain.Product;
import cl.example.demo.domain.ProductDto;
import cl.example.demo.repository.ProductRepository;
import cl.example.demo.domain.responses.ProductResponse;
import cl.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productServiceImpl")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductResponse getProducts() {
        return new ProductResponse(productRepository.findAll());
    }

    @Override
    public ProductDto getProduct(Integer productId) {
        Product product = productRepository.findById(productId).orElse(new Product());

        return new ProductDto(product);
    }
}
