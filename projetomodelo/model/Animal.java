package main.java.br.edu.univasf.projetomodelo.model;

public abstract class Animal {
	private String nomeCientifico;
	private String[] nomesPopulares; // precisa ser um array
	private String habitoAlimentar;
	private String distribuicaoGeografica;
	private String expectativaDeVida; // natureza/cativeiro
	private String comportamento; // se vive em bando (e quantos no bando) ou solitário
	private String epocaDeReproducao;

	public Animal(String nomeCientifico, String[] nomesPopulares, String habitoAlimentar, String distribuicaoGeografica, String expectativaDeVida, String comportamento, String epocaDeReproducao) {
		this.nomeCientifico = nomeCientifico;
		this.nomesPopulares = nomesPopulares;
		this.habitoAlimentar = habitoAlimentar;
		this.distribuicaoGeografica = distribuicaoGeografica;
		this.expectativaDeVida = expectativaDeVida;
		this.comportamento = comportamento;
		this.epocaDeReproducao = epocaDeReproducao;
	}

	public String getNomeCientifico() {
		return nomeCientifico;
	}

	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}

	public String[] getNomesPopulares() {
		return nomesPopulares;
	}

	public void setNomesPopulares(String[] nomesPopulares) {
		this.nomesPopulares = nomesPopulares;
	}

	public String getHabitoAlimentar() {
		return habitoAlimentar;
	}

	public void setHabitoAlimentar(String habitoAlimentar) {
		this.habitoAlimentar = habitoAlimentar;
	}

	public String getDistribuicaoGeografica() {
		return distribuicaoGeografica;
	}

	public void setDistribuicaoGeografica(String distribuicaoGeografica) {
		this.distribuicaoGeografica = distribuicaoGeografica;
	}

	public String getExpectativaDeVida() {
		return expectativaDeVida;
	}

	public void setExpectativaDeVida(String expectativaDeVida) {
		this.expectativaDeVida = expectativaDeVida;
	}

	public String getComportamento() {
		return comportamento;
	}

	public void setComportamento(String comportamento) {
		this.comportamento = comportamento;
	}

	public String getEpocaDeReproducao() {
		return epocaDeReproducao;
	}

	public void setEpocaDeReproducao(String epocaDeReproducao) {
		this.epocaDeReproducao = epocaDeReproducao;
	}
}
