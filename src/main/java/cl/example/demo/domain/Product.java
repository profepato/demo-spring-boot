package cl.example.demo.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int id;
    private String name;
    private int price;
}
