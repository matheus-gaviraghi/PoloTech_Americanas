package Aula5.SOLID.repository;


import java.util.List;

public class PessoaEmMemoriaRepository extends RepositorioEmMemoriaGenerico<Pessoa> {

    public PessoaEmMemoriaRepository(List<Pessoa> dadosIniciais) {
        super(dadosIniciais);
    }

    public PessoaEmMemoriaRepository() {
        super();
    }

}