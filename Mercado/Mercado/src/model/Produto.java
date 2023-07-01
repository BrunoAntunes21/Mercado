package model;

import helper.Utils;

public class Produto {
	//onfigurando o id do contador para iniciar no na casa 1
	private static int contador=1;
	//codigo do produto
	private int codigo;
	//nome do produto
	private String nome;
	//preço do produto
	private Double preco;
	
	
	
	
	public Produto(String nome, Double preco) {
		this.codigo=Produto.contador;
		this.nome = nome;
		this.preco = preco;
		Produto.contador+=1;
	}
	public int getCodigo() {
		return this.codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String toString() {
		return "Codigo"+this.getCodigo()+"\n Nome: "+this.getNome()+"\nPreço:"+Utils.doubleToString(this.getPreco());
	}
	
	
	
	

}
