package oo.Composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		
		c1.cliente = "Roberto";
		c1.adicionarItem(new Item("Caneta", 2 , 2));
		c1.adicionarItem(new Item("Borracha", 10, 2.5));
		c1.adicionarItem(new Item("Caderno", 10, 18));
		
		System.out.println(c1.obterValor());
	}
}
