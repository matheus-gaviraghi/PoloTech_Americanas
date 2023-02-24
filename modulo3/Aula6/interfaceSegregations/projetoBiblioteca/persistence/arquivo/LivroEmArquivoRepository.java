package Aula6.interfaceSegregations.projetoBiblioteca.persistence.arquivo;

import Aula6.interfaceSegregations.projetoBiblioteca.model.Livro;
import Aula6.interfaceSegregations.projetoBiblioteca.persistence.Repository;

public class LivroEmArquivoRepository extends RepositorioEmArquivoGenerico<Livro> {
    public LivroEmArquivoRepository(ManipuladorDeArquivo manipuladorDeArquivo, Repository<Livro> cache) {
        super(manipuladorDeArquivo, cache);
    }
}