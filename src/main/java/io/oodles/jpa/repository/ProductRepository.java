package io.oodles.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.oodles.jpa.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
