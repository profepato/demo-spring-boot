package cl.example.demo.domain.responses;

import cl.example.demo.domain.Product;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProductResponse {
    private List<Product> products;

    public ProductResponse(){
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        this.products.add(product);
    }
}
