package Aula1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] listaNomes = {"Matheus", "Raul", "Evelyn", "Camila", "José", "Fernando"};

        System.out.println("Ordenação de listas de nomes: ");
        OrdenaListas.ordenarListaDePalavras(listaNomes);

        // List<String> lista = List.of("Matheus", "Camila", "José", "Fernando");
        // Listof são imutáveis!

        List<String> lista = new ArrayList<>(List.of("Matheus", "Camila", "José", "Fernando"));
        OrdenaListas.ordenarListaPalavrasProfessor(lista);

        Pessoa pessoa1 = new Pessoa("Matheus");
        Pessoa pessoa2 = new Pessoa("Fernanda");
        Pessoa pessoa3 = new Pessoa("Cláudia");
        Pessoa pessoa4 = new Pessoa("Vinicius");

        List<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        listaPessoas.add(pessoa3);
        listaPessoas.add(pessoa4);

        System.out.println("\nOrdenação de listas de pessoas pelo nome: ");
        OrdenaListas.ordenarListaPessoas(listaPessoas);

    }
}
