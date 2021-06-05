package br.com.fatecararas.favfoodapi.domain;

import java.util.Objects;

//TODO: Configurar ORM
public class Ingrediente {

    //TODO: Criar e configurar Chave Primária
    private Double quantidade;
    private String unidadeMedida;
    private String nome;

    //TODO: Criar relacionamento com a classe Receita

    public Ingrediente(Double quantidade, String unidadeMedida, String nome) {
        this.quantidade = quantidade;
        this.unidadeMedida = unidadeMedida;
        this.nome = nome;
    }

    public Ingrediente() {
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
                "quantidade=" + quantidade +
                ", unidadeMedida='" + unidadeMedida + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
