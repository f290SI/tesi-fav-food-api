package br.com.fatecararas.favfoodapi.repositories;

import br.com.fatecararas.favfoodapi.domain.Receita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceitaRepository extends JpaRepository<Receita, Long> {
}
