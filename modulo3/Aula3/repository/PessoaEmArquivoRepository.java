package Aula3.repository;

import java.util.List;

public class PessoaEmArquivoRepository implements Repository{

    private PessoaEmMemoriaRepository pessoaEmMemoriaRepository = new PessoaEmMemoriaRepository();
    @Override
    public Pessoa salvar(Pessoa pessoa) {
        return pessoaEmMemoriaRepository.salvar(pessoa);
    }

    @Override
    public void atualizar(Pessoa pessoa) {
        pessoaEmMemoriaRepository.atualizar(pessoa);
    }

    @Override
    public boolean deletar(String cpf) {
        return pessoaEmMemoriaRepository.deletar(cpf);
    }

    @Override
    public Pessoa consultar(String cpf) {
        return pessoaEmMemoriaRepository.consultar(cpf);
    }

    @Override
    public List<Pessoa> listaTodos() {
        return pessoaEmMemoriaRepository.listaTodos();
    }
}
