package com.saulorios.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saulorios.teste.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
