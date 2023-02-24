package Aula5.SOLID.sorteador;

import java.util.List;

public class SorteadorCrescente<E> extends Sorteador<E> {
    public SorteadorCrescente(List<E> lista) {
        super(lista);
    }

    @Override
    protected int sortearIndice() {
        return 0;
    }
}