package com.saulorios.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saulorios.teste.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
