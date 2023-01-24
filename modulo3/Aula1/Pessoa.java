package Aula1;

public class Pessoa implements Comparable{
    private final String nome;

    public Pessoa(String nome){
        this.nome = nome;
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
}
