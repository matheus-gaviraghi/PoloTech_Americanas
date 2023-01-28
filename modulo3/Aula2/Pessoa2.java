package Aula2;

import java.time.LocalDate;

public class Pessoa2 implements Comparable{
    private final String nome;
    private final LocalDate dataNascimento;

    public Pessoa2(String nome, LocalDate dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public int compareTo(Object o) {
        if(!(o instanceof Pessoa2)){
            throw new IllegalArgumentException("Somente é possível comparar pessoas com pessoas!");
        }
        Pessoa2 pessoaComparar = (Pessoa2) o;
        // return pessoaComparar.dataNascimento.compareTo(this.dataNascimento);
        // comparação invertida por causa do sinal negativo que o compareTo traria (mais novo pro mais velho)
        // do mais velho pro mais novo seria: this.dataNascimento.compareTo(pessoaComparar.dataNascimento);
        // outra opção para reverter: this.dataNascimento.compareTo(pessoaComparar.dataNascimento) *-1


        // ordenação por pessoa mais velha e pelo nome:
        if(this.dataNascimento.compareTo(pessoaComparar.dataNascimento) == 0){
            return this.nome.compareTo(pessoaComparar.nome);
        }
        return pessoaComparar.dataNascimento.compareTo(this.dataNascimento);
    }

    @Override
    public String toString(){
          return "Nome: " + this.nome + "| Data de nascimento: " + this.dataNascimento;
    }
}
