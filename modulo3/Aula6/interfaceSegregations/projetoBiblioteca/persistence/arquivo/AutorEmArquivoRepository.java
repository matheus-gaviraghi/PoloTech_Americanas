package Aula6.interfaceSegregations.projetoBiblioteca.persistence.arquivo;

import Aula6.interfaceSegregations.projetoBiblioteca.model.Autor;
import Aula6.interfaceSegregations.projetoBiblioteca.model.Livro;
import Aula6.interfaceSegregations.projetoBiblioteca.persistence.AutorRepository;
import Aula6.interfaceSegregations.projetoBiblioteca.persistence.Repository;

import java.util.List;

public class AutorEmArquivoRepository extends RepositorioEmArquivoGenerico<Autor> implements AutorRepository {

    private final AutorRepository cache;

    public AutorEmArquivoRepository(ManipuladorDeArquivo manipuladorDeArquivo, AutorRepository cache) {
        super(manipuladorDeArquivo, cache);
        this.cache = cache;
    }

    @Override
    public List<Autor> buscarPorNacionalidade(String nacionalidade) {
        return cache.buscarPorNacionalidade(nacionalidade);
    }
}