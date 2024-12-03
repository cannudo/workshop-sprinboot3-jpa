package com.educandoweb.curso.config;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.curso.entities.Order;
import com.educandoweb.curso.entities.User;
import com.educandoweb.curso.repositories.OrderRepository;
import com.educandoweb.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User lis = new User(null, "NGeremaias", "pedreiro@viladochaves.com", "40028922", "LisComS");
		User liz = new User(null, "Liziane", "sainhadatj@provas.com", "22982004", "LizComZ");
		List<User> sacoDeFarinha = new ArrayList<>();
		sacoDeFarinha.add(lis);
		sacoDeFarinha.add(liz);
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), lis);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), liz);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), lis);
		
		userRepository.saveAll(sacoDeFarinha);
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
}
