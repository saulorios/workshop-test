package com.saulorios.teste.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saulorios.teste.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User usr = new User(1L, "Caco", "caco@gmail.com", "98982023224", "123456");
		return ResponseEntity.ok().body(usr);
	}
}
