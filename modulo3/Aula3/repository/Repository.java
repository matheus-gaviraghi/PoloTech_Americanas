package Aula3.repository;

import java.util.List;

public interface Repository {

    Pessoa salvar(Pessoa pessoa);

    void atualizar(Pessoa pessoa);

    boolean deletar(String cpf);

    Pessoa consultar(String cpf);

    List<Pessoa> listaTodos();
}
