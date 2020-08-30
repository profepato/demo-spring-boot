package cl.example.demo.dao.impl;

import cl.example.demo.dao.ProductDao;
import cl.example.demo.domain.Product;
import cl.example.demo.domain.responses.ProductResponse;
import org.springframework.stereotype.Component;

@Component
public class ProductDaoImpl implements ProductDao {
    @Override
    public ProductResponse getProducts() {
        ProductResponse productResponse = new ProductResponse();

        /*
        Product product1 = new Product(1, "name1", 100);
        Product product2 = new Product(2, "name2", 200);
        Product product3 = new Product(3, "name3", 300);

        productResponse.addProduct(product1);
        productResponse.addProduct(product2);
        productResponse.addProduct(product3);
        */

        return productResponse;
    }
}
