package main.java.br.edu.univasf.projetomodelo.model;

public class Alimentos {
	private String tipoDeAlimento;
	private boolean alimentoVivo;
	private String estadoFisico;
	private String temperatura;
	public String getTipoDeAlimento() {
		return tipoDeAlimento;
	}
	public void setTipoDeAlimento(String tipoDeAlimento) {
		this.tipoDeAlimento = tipoDeAlimento;
	}
	public boolean isAlimentoVivo() {
		return alimentoVivo;
	}
	public void setAlimentoVivo(boolean alimentoVivo) {
		this.alimentoVivo = alimentoVivo;
	}
	public String getEstadoFisico() {
		return estadoFisico;
	}
	public void setEstadoFisico(String estadoFisico) {
		this.estadoFisico = estadoFisico;
	}
	public String getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	public Alimentos(String tipoDeAlimento, boolean alimentoVivo, String estadoFisico, String temperatura) {
		super();
		this.tipoDeAlimento = tipoDeAlimento;
		this.alimentoVivo = alimentoVivo;
		this.estadoFisico = estadoFisico;
		this.temperatura = temperatura;
	}
}
