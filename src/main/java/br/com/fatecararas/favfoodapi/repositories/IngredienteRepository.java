package br.com.fatecararas.favfoodapi.repositories;


import br.com.fatecararas.favfoodapi.domain.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredienteRepository extends JpaRepository<Ingrediente, Long> {
}