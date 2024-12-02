package com.educandoweb.curso.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.curso.entities.User;
import com.educandoweb.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User lis = new User(null, "NGeremaias", "pedreiro@viladochaves.com", "40028922", "LisComS");
		User liz = new User(null, "Liziane", "sainhadatj@provas.com", "22982004", "LizComZ");
		List<User> sacoDeFarinha = new ArrayList<>();
		sacoDeFarinha.add(lis);
		sacoDeFarinha.add(liz);
		userRepository.saveAll(sacoDeFarinha);
	}
}
