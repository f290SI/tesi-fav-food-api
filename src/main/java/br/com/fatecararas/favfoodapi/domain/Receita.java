package br.com.fatecararas.favfoodapi.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Receita {
    //TODO: Criar atribtutos [titulo, urlImagem, ingredientes, preparo e receita]

    private Long id;
    private String titulo;
    private String urlImagem;
    private List<Ingrediente> ingredientes = new ArrayList<>();
    private String preparo;

    //TODO: Criar Construtores

    public Receita(String titulo, String urlImagem, String preparo) {
        this.titulo = titulo;
        this.urlImagem = urlImagem;
        this.preparo = preparo;
    }

    public Receita() {
    }

    //TODO: Criar Getters, Setters, HashCode and Equals e toString()

    public Long getId() {
        return id;
    }

    public Receita setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitulo() {
        return titulo;
    }

    public Receita setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public Receita setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
        return this;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public Receita setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
        return this;
    }

    public String getPreparo() {
        return preparo;
    }

    public Receita setPreparo(String preparo) {
        this.preparo = preparo;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receita receita = (Receita) o;
        return id.equals(receita.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Receita{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", urlImagem='" + urlImagem + '\'' +
                ", ingredientes=" + ingredientes +
                ", preparo='" + preparo + '\'' +
                '}';
    }

}
