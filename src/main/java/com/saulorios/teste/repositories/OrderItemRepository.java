package com.saulorios.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saulorios.teste.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
