package Aula6.interfaceSegregations.projetoBiblioteca.persistence.memoria;

import Aula6.interfaceSegregations.projetoBiblioteca.model.Autor;
import Aula6.interfaceSegregations.projetoBiblioteca.model.Livro;
import Aula6.interfaceSegregations.projetoBiblioteca.persistence.AutorRepository;

import java.util.List;

public class AutorEmMemoriaRepository extends RepositorioEmMemoriaGenerico<Autor> implements AutorRepository {
    @Override
    public List<Autor> buscarPorNacionalidade(String nacionalidade) {
        return null;
    }
}