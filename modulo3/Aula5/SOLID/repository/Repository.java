package Aula5.SOLID.repository;

import java.util.List;

//Deixar esse repository e as suas implementações genéricas.
public interface Repository<T> {

    T salvar(T entidade);

    void atualizar(T entidade);

    boolean deletar(String id);

    T consultar(String id);

    List<T> listarTodos();
}