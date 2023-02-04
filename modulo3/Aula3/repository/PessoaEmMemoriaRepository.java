package Aula3.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PessoaEmMemoriaRepository implements Repository{

    private List<Pessoa> pessoas = new ArrayList<>();

    private List<Pessoa> dados;
    public PessoaEmMemoriaRepository(List<Pessoa> dadosIniciais) {
        this.dados = dadosIniciais;
    }

    public PessoaEmMemoriaRepository() {
        this.dados = new ArrayList<>();
    }
    @Override
    public Pessoa salvar(Pessoa pessoa) {
        if(existe(pessoa)){
            throw new IllegalArgumentException("Já existe uma pessoa com esse CPF cadastrado");
        }
        pessoas.add(pessoa);
        return pessoa;
    }

    private boolean existe(Pessoa pessoa){
        return consultar(pessoa.getCpf()) != null;
    }

    private boolean existe(String cpf){
        return consultar(cpf) != null;
    }

    @Override
    public Pessoa consultar(String cpf) {
//        for (int i=0; i<pessoas.size(); i++){
//            if (pessoas.get(i).getCpf().equals(cpf)){
//                return pessoas.get(i);
//            }
//        }
//        return null;

//        for(Pessoa pessoa: pessoas){
//            if(pessoa.getCpf().equals(cpf)){
//                return pessoa;
//            }
//        }
//        return null;

        // Usando Stream
        Optional<Pessoa> pessoaLista = pessoas.stream()
                .filter(pessoa->pessoa.getCpf().equals(cpf)) // uso de lambda
                .findFirst();

        return pessoaLista.orElse(null);
    }

    @Override
    public List<Pessoa> listaTodos() {
        return new ArrayList<>(pessoas);
    }

    @Override
    public void atualizar(Pessoa pessoa) {
        if(!existe(pessoa)){
            throw new IllegalArgumentException("Não existe uma pessoa com esse CPF cadastrado");
        }

        deletar(pessoa.getCpf());
        salvar(pessoa);
    }

    @Override
    public boolean deletar(String cpf) {
        if(existe(cpf)){
           Pessoa consultar = consultar(cpf);
           pessoas.remove(consultar);
           return true;
        }

        return false;
    }
}
