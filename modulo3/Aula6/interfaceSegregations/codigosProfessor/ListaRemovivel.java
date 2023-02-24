package Aula6.interfaceSegregations.codigosProfessor;

import java.util.List;

public interface ListaRemovivel<E> {

    boolean remove(E elemento);
    boolean removeAll(List<E> elemento);
}