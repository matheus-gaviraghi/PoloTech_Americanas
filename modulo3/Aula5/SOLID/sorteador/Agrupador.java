package Aula5.SOLID.sorteador;

import java.util.ArrayList;
import java.util.List;

public class Agrupador<E> {

    private final Sorteador<E> sorteador;

    public Agrupador(List<E> lista) {
        sorteador = new SorteadorMediano<>(lista);
    }

    public List<Grupo<E>> agrupar(int quantidadeDeGrupos) {
        List<Grupo<E>> grupos = inicializarGrupos(quantidadeDeGrupos);

        dividirEmGrupos(quantidadeDeGrupos, grupos);

        return grupos;
    }

    private List<Grupo<E>> inicializarGrupos(int quantidadeDeGrupos) {
        List<Grupo<E>> grupos = new ArrayList<>();
        for (int i = 0; i < quantidadeDeGrupos; i++) {
            grupos.add(new Grupo<>());
        }
        return grupos;
    }

    private void dividirEmGrupos(int quantidadeDeGrupos, List<Grupo<E>> grupos) {
        int indiceGrupoAtual = 0;
        while (sorteador.hasNext()) {
            Dupla<E, Integer> elementoEIndiceSorteado = sorteador.sortear();
            E elementoSorteado = elementoEIndiceSorteado.primeiro();
            int indiceSorteado = elementoEIndiceSorteado.segundo();
            System.out.println("elemento sorteado %s para o indice %s".formatted(elementoSorteado, indiceSorteado));
            grupos.get(indiceGrupoAtual).adicionarNoGrupo(elementoSorteado);
            indiceGrupoAtual++;
            if (indiceGrupoAtual == quantidadeDeGrupos) {
                indiceGrupoAtual = 0;
            }
        }
    }
}