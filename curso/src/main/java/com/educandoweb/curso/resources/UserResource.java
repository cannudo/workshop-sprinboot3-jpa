package com.educandoweb.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll() {
		User proletariado = new User(0L, "Primeiro Usuário da Costa", "primeiro.usuario@da.costa", "um dois e três", "ANISTIA É O CARALHO");
		// localhost:8080/users
		return ResponseEntity.ok().body(proletariado);
	}
}
