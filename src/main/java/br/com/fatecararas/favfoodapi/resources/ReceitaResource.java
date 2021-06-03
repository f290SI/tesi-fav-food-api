package br.com.fatecararas.favfoodapi.resources;

import br.com.fatecararas.favfoodapi.domain.Ingrediente;
import br.com.fatecararas.favfoodapi.domain.Receita;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/api/v1")
@RestController
public class ReceitaResource {

    @GetMapping("/receitas")
    public ResponseEntity<List<Receita>> getAll() {
        var receitaPudimLeiteCondensado = new Receita("Pudim de Leite Condensado","https://www.goolgphotps.com/pdlc.png","Misturar todos os ingredientes...");

        var ingrediente1 = new Ingrediente(8D,"Unidade","Gemas");
        var ingrediente2 = new Ingrediente(1D,"Litro","Leite");
        var ingrediente3 = new Ingrediente(1.5D,"Quilo","Leite Condensado");

        List<Ingrediente> ingredientes = Arrays.asList(ingrediente1, ingrediente2, ingrediente3);

        receitaPudimLeiteCondensado.setIngredientes(ingredientes);

        List<Receita> receitas = Arrays.asList(receitaPudimLeiteCondensado, receitaPudimLeiteCondensado, receitaPudimLeiteCondensado);

        return ResponseEntity.ok().body(receitas);
    }
}
