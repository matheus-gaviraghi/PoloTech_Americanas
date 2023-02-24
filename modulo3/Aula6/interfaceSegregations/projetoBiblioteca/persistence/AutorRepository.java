package Aula6.interfaceSegregations.projetoBiblioteca.persistence;

import Aula6.interfaceSegregations.projetoBiblioteca.model.Autor;

import java.util.List;

public interface AutorRepository extends Repository<Autor> {

    List<Autor> buscarPorNacionalidade(String nacionalidade);
}