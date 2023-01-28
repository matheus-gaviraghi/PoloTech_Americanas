package Aula1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class OrdenaListas {

    public static String[] ordenarListaDePalavras(String[] lista){

        Arrays.sort(lista);

        for (String nome: lista) {
            System.out.print(nome+ ", ");
        }
        System.out.println();
        return lista;
    }

    public static void ordenarListaPalavrasProfessor(List<String> lista){
        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista);
    }

    public static void ordenarListaPessoas(List<Pessoa> lista){
        Collections.sort(lista);

        for (Pessoa pessoa: lista) {
            pessoa.printInfoPessoa();
        }
    }

    public static void ordenarListaPessoasNomeData(List<Pessoa> lista){
        Collections.sort(lista);

        for (Pessoa pessoa: lista) {
            System.out.println(pessoa);
        }
    }
}
