package br.com.senac.exercicio05.model.vo;

public class ProdutoVO {
	
	private String nome;
	private double peso;
	private int ano;
	private double valor;
	
	public ProdutoVO(String nome, float peso, int ano, double valor) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.ano = ano;
		this.valor = valor;
	}

	public ProdutoVO() {
		super();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	

}
