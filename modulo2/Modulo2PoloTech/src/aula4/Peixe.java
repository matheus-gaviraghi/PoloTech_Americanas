package aula4;

public class Peixe extends Animal{

	private Integer quantidadeDeBarbatanas;

	public Integer getQuantidadeDeBarbatanas() {
		return quantidadeDeBarbatanas;
	}

	public void setQuantidadeDeBarbatanas(Integer quantidadeDeBarbatanas) {
		this.quantidadeDeBarbatanas = quantidadeDeBarbatanas;
	}

	@Override
	public void fazerBarulho() {
		System.out.println("Splash splash");
	}
	
}
