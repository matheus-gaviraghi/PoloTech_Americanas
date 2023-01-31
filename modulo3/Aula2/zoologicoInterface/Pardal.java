package Aula2.zoologicoInterface;

public class Pardal implements Comedor, Voador{

    @Override
    public void voar() {
        System.out.println("Pardal voando!");
    }
}
