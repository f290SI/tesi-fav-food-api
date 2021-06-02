package br.com.fatecararas.favfoodapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FavFoodApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FavFoodApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//TODO: Testar o relacionamnto dos objetos que representem a abstração de pelo menos 01 (uma) receita.
	}
}
