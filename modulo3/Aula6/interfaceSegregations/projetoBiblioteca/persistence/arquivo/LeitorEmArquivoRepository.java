package Aula6.interfaceSegregations.projetoBiblioteca.persistence.arquivo;

import Aula6.interfaceSegregations.projetoBiblioteca.model.Leitor;
import Aula6.interfaceSegregations.projetoBiblioteca.model.Livro;
import Aula6.interfaceSegregations.projetoBiblioteca.persistence.Repository;

public class LeitorEmArquivoRepository extends RepositorioEmArquivoGenerico<Leitor> {
    public LeitorEmArquivoRepository(ManipuladorDeArquivo manipuladorDeArquivo, Repository<Leitor> cache) {
        super(manipuladorDeArquivo, cache);
    }
}