package Aula2.zoologicoInterface;

public class Tilapia implements Comedor, Nadador{

    @Override
    public void nadar() {
        System.out.println("Tilapia nadando!");
    }
}
