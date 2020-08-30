package cl.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
public class ProductDto {
    private Integer id;
    private String name;
    private String brand;

    public ProductDto(Product product){
        this.id     = product.getId();
        this.name   = product.getName();
        this.brand  = product.getBrand();
    }
}
