package br.com.fatecararas.favfoodapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FavFoodApiApplication implements CommandLineRunner {

	//TODO: Criar script com carga inicial de dados no arquivo data.sql, dentro do diretório resources

	public static void main(String[] args) {
		SpringApplication.run(FavFoodApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
