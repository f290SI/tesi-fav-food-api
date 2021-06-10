package br.com.fatecararas.favfoodapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ingredientes")
public class Ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double quantidade;
    private String unidadeMedida;
    private String nome;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_receita")
    private Receita receita;

    public Ingrediente(Double quantidade, String unidadeMedida, String nome) {
        this.quantidade = quantidade;
        this.unidadeMedida = unidadeMedida;
        this.nome = nome;
    }

    public Ingrediente() {
    }

    public Long getId() {
        return id;
    }

    public Ingrediente setId(Long id) {
        this.id = id;
        return this;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public Ingrediente setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public Ingrediente setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Ingrediente setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Receita getReceita() {
        return receita;
    }

    public Ingrediente setReceita(Receita receita) {
        this.receita = receita;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingrediente that = (Ingrediente) o;
        return Objects.equals(quantidade, that.quantidade) && Objects.equals(unidadeMedida, that.unidadeMedida) && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantidade, unidadeMedida, nome);
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "id=" + id +
                ", quantidade=" + quantidade +
                ", unidadeMedida='" + unidadeMedida + '\'' +
                ", nome='" + nome + '\'' +
                ", receita=" + receita +
                '}';
    }
}
