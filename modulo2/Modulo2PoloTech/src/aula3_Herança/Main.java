package aula3_Herança;

public class Main {

	public static void main(String[] args) {
		
		// Carro suv = new Suv(); // polimorfismo
		Suv suv1 = new Suv("Vermelho", "Fiat", "Uno");
		suv1.velocidade = 0;
		try {
			suv1.frear();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			suv1.mostrarEstadoAtual();
		}
	}
}
