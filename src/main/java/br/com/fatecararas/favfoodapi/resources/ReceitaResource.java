package br.com.fatecararas.favfoodapi.resources;

import br.com.fatecararas.favfoodapi.domain.Receita;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1")
@RestController
public class ReceitaResource {

    //TODO: Criar instancia sos Repositories

    //TODO: Criar os métodos básicos de gerenciamento de dados para as receitas utilizando os Respositories

    @GetMapping("/receitas")
    public ResponseEntity<List<Receita>> getAll() {
        return null;
    }
}
