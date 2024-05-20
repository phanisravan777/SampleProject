package com.business.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;

import com.business.entities.Product;

@DataJpaTest
public class ProductRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void whenFindByName_thenReturnProduct() {
        // given
        Product apple = new Product();
        apple.setPname("Apple");
        entityManager.persist(apple);
        entityManager.flush();

        // when
        Product found = productRepository.findByPname(apple.getPname());

        // then
        assertThat(found.getPname()).isEqualTo(apple.getPname());
    }

    @Test
    public void whenInvalidName_thenReturnNull() {
        // when
        Product notFound = productRepository.findByPname("NotARealProduct");

        // then
        assertThat(notFound).isNull();
    }

    @Test
    public void whenSaveProduct_verifyIdIsNotNull() {
        // given
        Product banana = new Product();
        banana.setPname("Banana");

        // when
        Product saved = productRepository.save(banana);

        // then
        assertThat(saved.getId()).isNotNull();
    }
}