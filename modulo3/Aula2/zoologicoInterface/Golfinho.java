package Aula2.zoologicoInterface;

public class Golfinho implements Amamentador, Nadador{

    @Override
    public void amamentar() {
        System.out.println("Amamentando filhotes de golfinho!");
    }

    @Override
    public void nadar() {
        System.out.println("Golfinho nadando!");
    }
}
