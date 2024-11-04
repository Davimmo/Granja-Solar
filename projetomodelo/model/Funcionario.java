package main.java.br.edu.univasf.projetomodelo.model;

public abstract class Funcionario {
	private String nome;
	private String funcao;
	private float salario;
	private boolean acessaJaula;
	
	public Funcionario(String nome, String funcao, float salario, boolean acessaJaula) {
		super();
		this.nome = nome;
		this.funcao = funcao;
		this.salario = salario;
		this.acessaJaula = acessaJaula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public boolean isAcessaJaula() {
		return acessaJaula;
	}
	public void setAcessaJaula(boolean acessaJaula) {
		this.acessaJaula = acessaJaula;
	}
	
}
