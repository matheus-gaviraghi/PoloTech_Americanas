package Aula2.zoologicoInterface;

public class Morcego implements Voador, Amamentador{

    @Override
    public void voar() {
        System.out.println("Morcego voando rápido!");
    }

    @Override
    public void amamentar() {
        System.out.println("Morcego é mamífero e está amamentando!");
    }

    @Override
    public void comer(String alimento) {
        System.out.println("Morcego comendo " + alimento);
    }
}
