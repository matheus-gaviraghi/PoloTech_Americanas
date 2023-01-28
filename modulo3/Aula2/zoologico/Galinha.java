package Aula2.zoologico;

public class Galinha extends Ave{

    @Override
    public void voar(){
        throw new RuntimeException("Não consegue voar!");
    }
}
