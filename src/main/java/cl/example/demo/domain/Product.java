package cl.example.demo.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int id;
    private String name;
    private String brand;// en un futuro será otra entidad
    private int price;
    private int stock;
}
