package com.saulorios.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saulorios.teste.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
