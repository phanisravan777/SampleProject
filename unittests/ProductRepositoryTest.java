package com.business.repositories.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.business.entities.Product;
import com.business.repositories.ProductRepository;

@DataJpaTest
public class ProductRepositoryTest {

@Autowired
private TestEntityManager entityManager;

@Autowired
private ProductRepository productRepository;

@BeforeEach
public void setUp() {
Product product = new Product();
product.setPname("Test Product");
entityManager.persist(product);
entityManager.flush();
}

@Test
public void whenFindByName_thenReturnProduct() {
// given
String name = "Test Product";

// when
Product found = productRepository.findByPname(name);

// then
assertEquals(found.getPname(), name);
}

@Test
public void whenInvalidName_thenReturnNull() {
// given
String name = "Invalid";

// when
Product found = productRepository.findByPname(name);

// then
assertNull(found);
}

@Test
public void whenFindAll_thenReturnAllProducts() {
// given
Iterable<Product> products = productRepository.findAll();

// when
int size = 0;
for(Product product : products) {
size++;
}

// then
assertTrue(size > 0);
}

@Test
public void whenDeleteById_thenDeletingShouldBeSuccessful() {
// given
Product product = entityManager.persist(new Product());
entityManager.flush();

// when
productRepository.deleteById(product.getId());

// then
assertFalse(productRepository.findById(product.getId()).isPresent());
}
}