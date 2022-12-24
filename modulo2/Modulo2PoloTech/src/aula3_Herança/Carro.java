package aula3_Herança;

public class Carro {
	// static String teste = "teste alo";
	// o static torna o atributo da classe, e não mais só do objeto.
	// Para usar Carro.teste, tem que ser static
	// Nao conseguimos usar metodos da classe sem usar o static tambem, sem o static estes serão do objeto
	
	protected String cor;
	protected String marca;
	protected String modelo;
	protected boolean ligado;
	protected int velocidade;
	
	// Construtor - Auxilia na criação de objetos
	
	public Carro(String cor, String marca, String modelo) {
		this.setCor(cor);
		this.setMarca(marca);
		this.modelo = modelo;
		this.ligado = true;
		this.velocidade = 0;
	}
	
	public void desligar() {
		this.ligado = false;
	}
	
	public void acelerar() {
		this.velocidade += 10;
		System.out.printf("Voce acelerou e sua velocidade atual eh de: %dkm/h", this.velocidade);
	}
	
	public void frear() throws Exception {
		if(this.velocidade == 0) {
			throw new CarroJaEstaParadoException("O carro já está parado");
		}
		if(this.velocidade - 10 < 0) {
			this.velocidade = 0;
		} else {
			this.velocidade -= 10;
		}
		
		System.out.printf("Voce freou e sua velocidade atual eh de: %dkm/h", this.velocidade);
	}
	
	public void mostrarEstadoAtual() {
		System.out.println("O seu " + this.modelo + " esta atualmente a " + this.velocidade + "km/h");
	}
	
	public boolean isLigado() {
		return this.ligado;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
