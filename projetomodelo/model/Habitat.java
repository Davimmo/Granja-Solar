package main.java.br.edu.univasf.projetomodelo.model;

public abstract class Habitat {
	private String temperatura;
	private String umidade;
	private String tipoDeProtecao;
	private String espaco; // pequeno, médio ou grande
	public String getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	public String getUmidade() {
		return umidade;
	}
	public void setUmidade(String umidade) {
		this.umidade = umidade;
	}
	public String getTipoDeProtecao() {
		return tipoDeProtecao;
	}
	public void setTipoDeProtecao(String tipoDeProtecao) {
		this.tipoDeProtecao = tipoDeProtecao;
	}
	public String getEspaco() {
		return espaco;
	}
	public void setEspaco(String espaco) {
		this.espaco = espaco;
	}
	public Habitat(String temperatura, String umidade, String tipoDeProtecao, String espaco) {
		super();
		this.temperatura = temperatura;
		this.umidade = umidade;
		this.tipoDeProtecao = tipoDeProtecao;
		this.espaco = espaco;
	}
	
}
