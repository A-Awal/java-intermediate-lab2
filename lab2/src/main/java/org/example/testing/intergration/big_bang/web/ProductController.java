package org.example.testing.intergration.big_bang.web;

import org.example.testing.intergration.big_bang.services.ProductService;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/big-bang/products")
@Profile("big_bang")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
}
