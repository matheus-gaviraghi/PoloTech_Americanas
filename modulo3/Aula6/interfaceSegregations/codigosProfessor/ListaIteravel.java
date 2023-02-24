package Aula6.interfaceSegregations.codigosProfessor;

public interface ListaIteravel<E> extends Iterable<E> {

    int size();

    E get(int index);


}