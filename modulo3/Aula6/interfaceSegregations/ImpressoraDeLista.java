package Aula6.interfaceSegregations;

public class ImpressoraDeLista<T> {

    private final ListaIteravel<T> listaIteravel;

    public ImpressoraDeLista(ListaIteravel<T> listaIteravel) {
        this.listaIteravel = listaIteravel;
    }

    public void imprimirLista(){
        listaIteravel.forEach(System.out::println);
    }
}
