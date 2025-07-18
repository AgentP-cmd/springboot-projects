package com.example.myfirstApi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product product;

    @BeforeEach
    void setUp() {
        product = new Product(10L, "ProductSample1", 300);
    }

    @Test
    void getId() {
        assertEquals(10,product.getId());
    }

    @Test
    void getName() {
        assertEquals("ProductSample1", product.getName());
    }

    @Test
    void getPrice() {
        assertEquals(300, product.getPrice());
    }

    @Test
    void setId() {
        product.setId(20L);
        assertEquals(20L, product.getId());
    }

    @Test
    void setName() {
        product.setName("ProductSample2");
        assertEquals("ProductSample2", product.getName());
    }

    @Test
    void setPrice() {
        product.setPrice(400);
        assertEquals(400, product.getPrice());
    }

    @Test
    void testToString() {
        assertEquals("Product{id=10, name='ProductSample1', price=300.0}", product.toString());
    }

    @Test
    void testEquals() {
        assertEquals(product, product);
    }

    @Test
    void testHashCode() {
        Product product2 = new Product(10L, "ProductSample1",300);
        assertEquals(product2.hashCode(), product.hashCode());
    }
}