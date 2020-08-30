package cl.example.demo.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product", catalog = "products_db")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int id;

    @Column(name = "product_name")
    private String name;

    @Column(name = "product_brand")
    private String brand;// en un futuro será otra entidad

    @Column(name = "product_price")
    private int price;

    @Column(name = "product_stock")
    private int stock;
}
