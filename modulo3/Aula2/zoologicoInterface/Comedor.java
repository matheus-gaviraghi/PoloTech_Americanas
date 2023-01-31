package Aula2.zoologicoInterface;

public interface Comedor {
    // campos são public static final
    // public abstract void comer(String alimento);

    // precisa colocar a palava default p/ implementar
    default void comer(String alimento){
        System.out.println("Comendo o alimento: " + alimento);
    }


}
