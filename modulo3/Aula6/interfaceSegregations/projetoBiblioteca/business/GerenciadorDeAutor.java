package Aula6.interfaceSegregations.projetoBiblioteca.business;

import Aula6.interfaceSegregations.projetoBiblioteca.model.Autor;
import Aula6.interfaceSegregations.projetoBiblioteca.persistence.AutorRepository;
import Aula6.interfaceSegregations.projetoBiblioteca.persistence.Repository;

public class GerenciadorDeAutor {

    private final AutorRepository repository;

    public GerenciadorDeAutor(AutorRepository repository) {
        this.repository = repository;
    }

    public Autor adicionarAutor(String nome, String nacionalidade) {
        Autor novoAutor = new Autor(nome, nacionalidade);
        Autor autorSalvo = repository.salvar(novoAutor);
        return autorSalvo;
    }
}