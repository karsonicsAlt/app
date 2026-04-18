package com.karso.receptionsystem;

import com.karso.receptionsystem.model.Citizen;
import com.karso.receptionsystem.repo.CitizenRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ReceptionSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReceptionSystemApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}


}
