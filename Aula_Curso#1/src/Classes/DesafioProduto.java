package Classes;

public class DesafioProduto {
	
	String produto;
	double preco;
	static double desconto = 0.25;
	
	public void mostrar(String x, double y) {
		System.out.printf("Produto: %s\nValor: R$ %.2f\nValor com desconto: R$ %.2f", x, y, y * (1 - desconto));
	}

}
