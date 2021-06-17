package br.com.fatecararas.favfoodapi.resources;

import br.com.fatecararas.favfoodapi.domain.Receita;
import br.com.fatecararas.favfoodapi.repositories.IngredienteRepository;
import br.com.fatecararas.favfoodapi.repositories.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api/v1")
@RestController
public class ReceitaResource {

    @Autowired
    private ReceitaRepository receitaRepository;
    @Autowired
    private IngredienteRepository ingredienteRepository;

    @GetMapping("/receitas")
    public ResponseEntity<List<Receita>> getAll() {
        List<Receita> all = receitaRepository.findAll();
        return ResponseEntity.ok(all);
    }

    @PostMapping("/receita")
    public ResponseEntity<Void> insert(@RequestBody Receita receita) {
        receita = receitaRepository.save(receita);
        var finalReceita = receita;
        receita.getIngredientes().forEach(ingrediente -> ingrediente.setReceita(finalReceita));
        ingredienteRepository.saveAll(receita.getIngredientes());
        var uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(receita.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/receita/{id}")
    public ResponseEntity<Receita> findById(@PathVariable Long id) {

        Optional<Receita> receita = receitaRepository.findById(id);

        return receita.map(value -> ResponseEntity.ok().body(value)).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/receita/{id}")
    public ResponseEntity<Void> update(@RequestBody Receita receita, @PathVariable Long id) {
        Optional<Receita> optionalReceita = receitaRepository.findById(id);

        if (optionalReceita.isPresent()) {
            var objectReceita = optionalReceita.get();
            objectReceita.setTitulo(receita.getTitulo())
                    .setUrlImagem(receita.getUrlImagem())
                    .setPreparo(receita.getPreparo());


            var finalObjectReceita = objectReceita;
            receita.getIngredientes().forEach(ingrediente -> ingrediente.setReceita(finalObjectReceita));
            objectReceita.setIngredientes(receita.getIngredientes());

            objectReceita = receitaRepository.save(objectReceita);

            ingredienteRepository.saveAll(objectReceita.getIngredientes());

            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/receita/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        Optional<Receita> optionalReceita = receitaRepository.findById(id);

        if (optionalReceita.isPresent()) {
            var receita = optionalReceita.get();
            receitaRepository.delete(receita);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
