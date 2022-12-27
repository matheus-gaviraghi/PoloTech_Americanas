package aula3_Herança_CodigosProfessor;
public class Suv extends Carro {

    private boolean isQuatroPorQuatro;

    public Suv(String cor, String marca, String modelo, boolean ligado, int velocidadeAtual) {
        super(cor, marca, modelo, ligado, velocidadeAtual);
    }

    public void acelerar(int velocidadeAMais, boolean isTracionado) {
        super.acelerar(velocidadeAMais);

        if (isTracionado) {
            System.out.println("\n ACELERANDO COM MAIS TRAÇÃO");
        }
    }


    public void frear(int velocidadeAMenos) {
//        super.frear(velocidadeAMenos);
        System.out.println("FREIANDO MUITO BEM POR QUE EU TENHO UM FREIO TUNADO POIS SOU UMA SUV");
    }

//    public String toString() {
//        return super.toString();
//    }
}