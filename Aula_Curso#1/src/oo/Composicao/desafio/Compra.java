package oo.Composicao.desafio;

import java.util.ArrayList;

public class Compra {

	final ArrayList<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(Produto p, int quant) {
		this.itens.add(new Item(p, quant));
	}
	
	void adicionarItem(String nome, double preco, int quant) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, quant));
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
}
