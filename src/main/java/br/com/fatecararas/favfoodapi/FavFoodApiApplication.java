package br.com.fatecararas.favfoodapi;

import br.com.fatecararas.favfoodapi.domain.Ingrediente;
import br.com.fatecararas.favfoodapi.domain.Receita;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class FavFoodApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FavFoodApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//TODO: Testar o relacionamento dos objetos que representem a abstração de pelo menos 01 (uma) receita.

		var receitaPudimLeiteCondensado = new Receita("Pudim de Leite Condensado","https://www.goolgphotps.com/pdlc.png","Misturar todos os ingredientes...");

		var ingrediente1 = new Ingrediente(8D,"Unidade","Gemas");
		var ingrediente2 = new Ingrediente(1D,"Litro","Leite");
		var ingrediente3 = new Ingrediente(1.5D,"Quilo","Leite Condensado");

		List<Ingrediente> ingredientes = Arrays.asList(ingrediente1, ingrediente2, ingrediente3);

		receitaPudimLeiteCondensado.setIngredientes(ingredientes);


		System.out.println(receitaPudimLeiteCondensado);


	}
}
