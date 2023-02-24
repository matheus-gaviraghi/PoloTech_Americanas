package Aula6.interfaceSegregations.projetoBiblioteca.business;

import Aula6.interfaceSegregations.projetoBiblioteca.model.Livro;
import Aula6.interfaceSegregations.projetoBiblioteca.persistence.Repository;

public class GerenciadorDeLivros {

    private final Repository<Livro> repositoryDeLivros;

    public GerenciadorDeLivros(Repository<Livro> repositoryDeLivros) {
        this.repositoryDeLivros = repositoryDeLivros;
    }


}