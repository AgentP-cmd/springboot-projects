package com.example.myfirstApi.repository;

import com.example.myfirstApi.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    public List<Product> products = Collections.synchronizedList(new ArrayList<>());
    public AtomicLong nextId = new AtomicLong(1);
    public ProductRepository productRepository;
    @BeforeEach
    void setUp() {
        productRepository = new ProductRepository();
        products.add(new Product(nextId.getAndIncrement(), "Laptop", 1200.00));
        products.add(new Product(nextId.getAndIncrement(), "Mouse", 25.50));
        products.add(new Product(nextId.getAndIncrement(), "Keyboard", 75.00));
    }

    @Test
    void findAll() {
        assertEquals(productRepository.findAll(),products);
    }

    @Test
    void findById() {
        assertEquals(products.getFirst().hashCode(),productRepository.findById(1L).hashCode());
    }

    @Test
    void save() {
        Product newprod = new Product(nextId.getAndIncrement(), "GPU", 2500.00);
        Product prodRepo = productRepository.save(newprod);
        assertEquals(newprod.hashCode(),prodRepo.hashCode());
    }

    @Test
    void isExistingSave(){
        Product updateProd = new Product(1L, "Laptop", 2500.00);
        Product prodRepo = productRepository.save(updateProd);
        assertEquals(updateProd.hashCode(),prodRepo.hashCode());
    }
}