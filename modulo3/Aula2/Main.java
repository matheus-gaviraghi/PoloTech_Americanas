package Aula2;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Pessoa2 pessoa1 = new Pessoa2("Matheus", LocalDate.of(1991, Month.DECEMBER, 25));
        Pessoa2 pessoa2 = new Pessoa2("Fernanda", LocalDate.of(2001, Month.MARCH, 1));
        Pessoa2 pessoa3 = new Pessoa2("Cláudia", LocalDate.of(2005, Month.MAY, 12));
        Pessoa2 pessoa4 = new Pessoa2("Vinicius", LocalDate.of(1995, Month.JANUARY, 2));
        Pessoa2 pessoa5 = new Pessoa2("Jose", LocalDate.of(1995, Month.JANUARY, 2));

        List<Pessoa2> listaPessoas = new ArrayList<>();
        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        listaPessoas.add(pessoa3);
        listaPessoas.add(pessoa4);
        listaPessoas.add(pessoa5);

        System.out.println("\nOrdenação de listas de pessoas pelo nome e pela data de nascimento: ");
        ordenarListaPessoasNomeData(listaPessoas);

    }

    public static void ordenarListaPessoasNomeData(List<Pessoa2> lista){
        Collections.sort(lista);

        for (Pessoa2 pessoa: lista) {
            System.out.println(pessoa);
        }
    }
}


