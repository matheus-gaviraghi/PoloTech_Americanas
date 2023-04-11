package main.java.com.ada.aulajunit01;

public class Calculadora {

    public int somar(int n1, int n2){
        return n1+n2;
    }

    public int subtrair(int n1, int n2){
        return n1-n2;
    }

    public float dividir(int n1, int n2){
        return n1/n2;
    }

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        int resultado = c.somar(2,3);

        System.out.println(resultado);
    }
}
