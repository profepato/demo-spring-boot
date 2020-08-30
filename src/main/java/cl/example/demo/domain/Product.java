package cl.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product", catalog = "products_db")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer id;

    @Column(name = "product_name")
    private String name;

    @Column(name = "product_brand")
    private String brand;// en un futuro será otra entidad

    @Column(name = "product_price")
    private Integer price;

    @Column(name = "product_stock")
    private Integer stock;
}
