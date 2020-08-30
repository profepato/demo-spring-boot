package cl.example.demo.domain.responses;

import cl.example.demo.domain.Product;
import cl.example.demo.domain.ProductDto;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProductResponse {
    private List<ProductDto> products;

    public ProductResponse(List<Product> productList){
        products = new ArrayList<>();

        // BeanUtils.copy
        for(Product product : productList){
            ProductDto productDto = new ProductDto();

            productDto.setId(product.getId());
            productDto.setName(product.getName());
            productDto.setBrand(product.getBrand());

            products.add(productDto);
        }
    }
}
