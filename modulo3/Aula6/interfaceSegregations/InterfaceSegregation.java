package Aula6.interfaceSegregations;

import java.util.List;

public class InterfaceSegregation {

    // ListaIteravel: size(), get();
    public static void main(String[] args) {
        ListaIteravel<String> listaIteravel = new ArrayListaIteravel(List.of("primeiro", "segundo", "terceiro"));

        for (int i=0; i<listaIteravel.size(); i++){
            System.out.println(listaIteravel.get(i));
        }

        System.out.println("Impressora de lista:");
        ImpressoraDeLista impressoraDeLista = new ImpressoraDeLista<>(listaIteravel);
        impressoraDeLista.imprimirLista();
    }
}
