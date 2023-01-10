package aula4;

public abstract class Animal {

	private String nome;
	private Double peso;
	
	public Animal() {
		
	}
	
	public Animal(String nome, Double peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}

	
	public abstract void fazerBarulho();
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	
}
