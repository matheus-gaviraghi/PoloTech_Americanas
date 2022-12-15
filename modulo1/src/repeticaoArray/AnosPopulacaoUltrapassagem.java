package repeticaoArray;

public class AnosPopulacaoUltrapassagem {

	public static void main(String[] args) {
		
		double populacaoA = 10;
		double populacaoB = 20;
		int anos = 0;
		
		do{
			anos++;
			populacaoA = populacaoA + populacaoA*(3.0/100);
			populacaoB = populacaoB + populacaoB*(1.5/100);
		}while(populacaoA < populacaoB); 
		
		System.out.println("Numero de anos necessarios para a populacao A ser maior ou igual a populacao B: " + anos);
		System.out.println("Populacao de A: " + populacaoA);
		System.out.println("Populacao de B: " + populacaoB);
	}
}
