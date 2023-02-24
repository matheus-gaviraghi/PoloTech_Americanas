package Aula5.SOLID.sorteador;

import java.util.List;

public class SorteadorDecrescente<E> extends Sorteador<E> {

    public SorteadorDecrescente(List<E> lista) {
        super(lista);
    }

    @Override
    protected int sortearIndice() {
        return size() - 1;
    }
}