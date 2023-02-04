package Aula4.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteador<T> {

    private final List<T> listaElementos;
    public Sorteador(List<T> listaElementos){
        this.listaElementos = listaElementos;
    }

    public Dupla<T, Integer> sortearElemento(){

        if(listaElementos.isEmpty()){
            throw new IllegalArgumentException("A lista está vazia!");
        }

        int indiceSorteado = ThreadLocalRandom.current().nextInt(listaElementos.size());

        T elementoSorteado = listaElementos.get(indiceSorteado);
        System.out.println("Elemento sorteado: " + elementoSorteado);
        listaElementos.remove(indiceSorteado);

        return new Dupla<>(elementoSorteado, indiceSorteado);
    }

    public List<Grupo<T>> inicializarGrupos(int numeroGrupos){
        List<Grupo<T>> grupos = new ArrayList<>();

        for (int i=0; i<numeroGrupos; i++){
            grupos.add(new Grupo<>());
        }

        return grupos;
    }

    public List<Grupo<T>> agrupar(int numeroGrupos){
        List<Grupo<T>> grupos = inicializarGrupos(numeroGrupos);

        int indiceGrupoAtual = 0;
        while(hasNext()){
            Dupla<T, Integer> elementoEIndiceSorteado = sortearElemento();
            T elementoSorteado = elementoEIndiceSorteado.getPrimeiro();
            int indiceSorteado = elementoEIndiceSorteado.getSegundo();
            System.out.println("Elemento sorteado %s para o indice %s".formatted(elementoSorteado, indiceSorteado));
            grupos.get(indiceGrupoAtual).adicionarNoGrupo(elementoSorteado);
            indiceGrupoAtual++;
            if (indiceGrupoAtual == numeroGrupos){
                indiceGrupoAtual = 0;
            }
        }

        return grupos;
    }

    private boolean hasNext(){
        return !listaElementos.isEmpty();
    }

}
