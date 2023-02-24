package Aula6.interfaceSegregations.projetoBiblioteca.model;

public class Leitor implements Entidade {

    private static final long serialVersionUID = 1L;

    private String nome;

    private String cpf;

    @Override
    public String getId() {
        return cpf;
    }
}