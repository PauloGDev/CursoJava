package oo.Composicao.desafio;

public class Sistema {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Maria");
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();

		compra1.adicionarItem("Caneta", 2.4, 5);
		compra1.adicionarItem("Notebook",3412.99, 1);
		
		compra2.adicionarItem(new Produto("Impressora", 999), 1);
		
		cliente1.compras.add(compra2);
		cliente1.compras.add(compra1);
		
		System.out.println(cliente1.obterValorTotal());
	}
}
