package Aula5.SOLID.repository;


import java.util.List;

public class PessoaEmArquivoRepository extends RepositorioEmArquivoGenerico<Pessoa> {
    public PessoaEmArquivoRepository() {
        super("dados_pessoa.txt");
    }
}