package Aula2.zoologicoInterface;

public class Galinha implements Comedor {

    @Override
    public void comer(String alimento) {
        System.out.println("Galinha comendo " + alimento);
    }
}
