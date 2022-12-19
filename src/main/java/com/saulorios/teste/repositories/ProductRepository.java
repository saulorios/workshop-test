package com.saulorios.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saulorios.teste.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
