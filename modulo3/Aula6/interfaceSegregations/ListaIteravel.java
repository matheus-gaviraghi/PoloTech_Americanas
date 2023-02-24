package Aula6.interfaceSegregations;

public interface ListaIteravel<T> extends Iterable<T> {
    /**
     * Returns the number of elements in this list.  If this list contains
     * more than {@code Integer.MAX_VALUE} elements, returns
     * {@code Integer.MAX_VALUE}.
     *
     * @return the number of elements in this list
     */
    int size();

    T get(int index);

}

