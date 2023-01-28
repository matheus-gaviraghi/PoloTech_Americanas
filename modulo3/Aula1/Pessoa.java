package Aula1;

import java.time.LocalDate;

public class Pessoa implements Comparable{
    private final String nome;
    private final LocalDate dataNascimento;

//    public Pessoa(String nome){
//        this.nome = nome;
//    }

    public Pessoa(String nome, LocalDate dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public int compareTo(Object o) {
        if(!(o instanceof Pessoa)){
            throw new IllegalArgumentException("Somente é possível comparar pessoas com pessoas!");
        }
        Pessoa pessoaComparar = (Pessoa) o;
        return this.nome.compareTo(pessoaComparar.nome);
    }

    public void printInfoPessoa(){
        System.out.print(this.nome + ", ");
    }

    @Override
    public String toString(){
          return "Nome: " + this.nome + " Data de nascimento: " + this.dataNascimento;
    }
}
