package Aula5.SOLID.repository;

import java.io.Serializable;

public record Livro(String titulo, String isbn) implements Entidade, Serializable {

    @Override
    public String getId() {
        return isbn;
    }
}