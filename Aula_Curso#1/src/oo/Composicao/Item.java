package oo.Composicao;

public class Item {

	String nome;
	int quantidade;
	double preco;
	Compra compra;
	
	Item(String nome, int quant, double preco){
		this.nome = nome;
		this.quantidade = quant;
		this.preco = preco;
	}
}
