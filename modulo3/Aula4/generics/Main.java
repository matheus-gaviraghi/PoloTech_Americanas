package Aula4.generics;

import java.util.ArrayList;
import java.util.List;

// Criar uma classe Sorteador genérica que recebe uma lista de elementos,
// e tem um método sortear que seleciona um elemento randômico da lista,
// remove e retorna esse elemento da lista

// Add no sorteador um metodo chamado agrupar que recebe um inteiro que
// indica o numero de grupos a serem criados e vai sorteando a lista até que
// não tenham mais elementos na lista e os grupos sejam populados.
// Deve retornar a lista dos grupos
public class Main {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>(List.of("José", "Camila", "Matheus", "João", "Felipe"));

        Sorteador sorteadorLista = new Sorteador(lista);

//        System.out.println("Lista antes remoção: " + lista);
//        sorteadorLista.sortearElemento();
//        System.out.println("Lista após remoção: " + lista);

        List<Grupo<String>> grupos = sorteadorLista.agrupar(2);
        grupos.stream().forEach(System.out::println);

//        for (Grupo<String> grupo: grupos){
//            System.out.println(grupo);
//        }

    }
}
