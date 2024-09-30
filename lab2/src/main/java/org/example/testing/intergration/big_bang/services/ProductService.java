package org.example.testing.intergration.big_bang.services;

import org.example.testing.intergration.big_bang.model.Product;
import org.example.testing.intergration.big_bang.repository.ProductRepository;
import org.example.testing.intergration.common.BaseService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("big_bang")
public class ProductService extends BaseService<Product, Integer> {
    public ProductService(ProductRepository productRepository) {
        super(productRepository);
    }
}
