package aula3_Herança_CodigosProfessor;
public class MainTeste {

    public static void main(String[] args) {

            try {
                Carro carro = new Carro("Preto", "Chervolet", "Celta", false, 0);
                carro.frear(100);
                System.out.println("QUALQUER COISA");
                return;
            } catch (Exception e) {
                System.out.println("Deu errado " + e.getMessage());
            } catch (Throwable e) {
                System.out.println("Tratando tipo mais generico " + e.getMessage());
            } finally {
                System.out.println("Estou no finaly");
            }

        System.out.println("FORA DO MEU TRY CATCH");



//        Suv carro2 = new Suv("Vermelha", "Toyota", "Etios", false, 200);
//
//        ((Suv) carro).acelerar(100, true);
//
//        System.out.println(Carro.numeroCarros);

//        System.out.println(carro);

//        ((Carro) carro).frear(100);

    }
}