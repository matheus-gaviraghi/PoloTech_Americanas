package americanasApp;

import java.math.BigDecimal;
import java.util.List;

public class Frete {
	private String tipoDeFrete;
	private BigDecimal valorDoFrete;
	private Boolean isFreteGratis;
	
	
	public Frete(String tipoDeFrete, Boolean isFreteGratis) {
		this.tipoDeFrete = tipoDeFrete;
		this.isFreteGratis = isFreteGratis;
	}


	public BigDecimal calcularFrete(List<Produto> produtos) {
		if(this.isFreteGratis) {
			return BigDecimal.valueOf(0);
		}
		
		this.valorDoFrete = BigDecimal.valueOf(produtos.size()*10);
		
		return valorDoFrete;
		
	}


	public String getTipoDeFrete() {
		return tipoDeFrete;
	}


	public void setTipoDeFrete(String tipoDeFrete) {
		this.tipoDeFrete = tipoDeFrete;
	}


	public BigDecimal getValorDoFrete() {
		return valorDoFrete;
	}


	public Boolean getIsFreteGratis() {
		return isFreteGratis;
	}


	public void setIsFreteGratis(Boolean isFreteGratis) {
		this.isFreteGratis = isFreteGratis;
	}
	
	
}
