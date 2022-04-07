package oo.Composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;
	double valor;
	
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	double obterValor() {
		
		for( Item valores: itens) {
			valor += (valores.preco * valores.quantidade);
			}
		return valor;
	}
}

