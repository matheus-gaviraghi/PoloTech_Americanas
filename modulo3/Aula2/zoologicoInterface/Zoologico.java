package Aula2.zoologicoInterface;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {

    public static void main(String[] args) {
        Amamentador vaquinha = new Vaca();
        Nadador tilapia = new Tilapia();
        Voador pardal = new Pardal();

        vaquinha.comer("Pasto");
        pardal.comer("Alpiste");

        vaquinha.amamentar();
        pardal.voar();

        Nadador tubarao = new Tubarao();
        Nadador golfinho = new Golfinho();
        List<Nadador> nadadores = new ArrayList<>();
        nadadores.add(tilapia);
        nadadores.add(tubarao);
        nadadores.add(golfinho);

        colocarParaNadar(nadadores);
    }

    public static void colocarParaNadar(List<Nadador> nadadores){
        System.out.println("Colocando peixes para nadar: ");
        for (Nadador nadador: nadadores){
            nadador.nadar();
        }
    }
}
