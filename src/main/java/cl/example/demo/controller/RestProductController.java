package cl.example.demo.controller;

import cl.example.demo.domain.Product;
import cl.example.demo.domain.ProductDto;
import cl.example.demo.domain.responses.ProductResponse;
import cl.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class RestProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<ProductResponse> getProducts(){
        return ResponseEntity.ok(productService.getProducts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getProduct(@PathVariable Integer id){
        return ResponseEntity.ok(productService.getProduct(id));
    }


}
