package Aula2.zoologicoInterface;

public class Tubarao implements Comedor, Nadador{

    @Override
    public void nadar() {
        System.out.println("Tubarao nadando com raiva!");
    }
}
