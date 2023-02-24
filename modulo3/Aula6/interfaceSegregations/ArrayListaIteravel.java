package Aula6.interfaceSegregations;

import java.util.*;

public class ArrayListaIteravel<T> extends ArrayList<T> implements ListaIteravel<T> {
    private int size;

    public ArrayListaIteravel(Collection c) {
        super(c);
        this.size = c.toArray().length;
    }

    @Override
    public int size() {
        return size;
    }

    public T get(int index) {
        return (T) super.get(index);
    }
}
