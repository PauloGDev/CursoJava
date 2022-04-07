package Classes;

public class ProdutosTeste {

	public static void main(String[] args) {
		DesafioProduto p1 = new DesafioProduto();
		p1.produto = "TV 50\"";
		p1.preco = 2500;
		
		p1.mostrar(p1.produto, p1.preco);
	}
}
