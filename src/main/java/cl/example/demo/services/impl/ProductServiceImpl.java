package cl.example.demo.services.impl;

import cl.example.demo.dao.ProductDao;
import cl.example.demo.domain.responses.ProductResponse;
import cl.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productServiceImpl")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public ProductResponse getProducts() {
        return productDao.getProducts();
    }
}
