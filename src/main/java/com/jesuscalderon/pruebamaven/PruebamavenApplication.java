package com.jesuscalderon.pruebamaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PruebamavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebamavenApplication.class, args);
	}

}
