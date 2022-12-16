package entradasETipos;

public class salarioMedioDev {
	
	public static void main(String[] args) {
		
		double salarioDevJr = 2500d;
		double salarioDevMd = 4800d;
		double salarioDevSr = 7700d;
		
		double mediaSimples = (salarioDevJr + salarioDevMd + salarioDevSr) / 3;
		
		System.out.printf("Media simples: %.2f", mediaSimples);
		
		
		int qtdDevJr = 5;
		int qtdDevMd = 8;
		int qtdDevSr = 4;
		
		double mediaPonderada = (qtdDevJr*salarioDevJr + 
								 qtdDevMd*salarioDevMd + 
								 qtdDevSr*salarioDevSr) / 
								(qtdDevJr + qtdDevMd + qtdDevSr);
		
		System.out.printf("\nMedia ponderada: %.2f", mediaPonderada);
	}
}
