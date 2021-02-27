package com.example.onlineshop.service.Impl;

import com.example.onlineshop.model.Product;
import com.example.onlineshop.repository.ProductRepository;
import com.example.onlineshop.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product getById(Long id) {
        log.info("IN ProductServiceImpl getById {}", id);
        return productRepository.findById(id).orElseGet(null);
    }

    @Override
    public void save(Product product) {
        log.info("IN ProductServiceImpl save {}", product);
        productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        log.info("IN ProductServiceImpl delete {}", id);
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> getAll() {
        log.info("IN ProductServiceImpl getAll {}");
        return productRepository.findAll();
    }
}
