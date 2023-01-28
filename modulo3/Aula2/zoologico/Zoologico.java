package Aula2.zoologico;

public class Zoologico {

    public static void main(String[] args) {
        Mamifero vaquinha = new Vaca();
        Peixe tilapia = new Tilapia();
        Ave pardal = new Pardal();

        vaquinha.comer();
        tilapia.comer();
        pardal.comer();

        vaquinha.amamenta();
        tilapia.nadar();
        pardal.voar();
    }
}
