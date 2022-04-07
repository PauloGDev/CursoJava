package Metodos;

public class TesteProdutos {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		
		p1.nome = "Tv 50'";
		p1.preco = 2500;
		p1.desconto = 0.1;
		
		System.out.printf("Valor da tv: %.2f.\nCom desconto: %.2f", p1.preco, p1.PrecoDesc(p1.preco, p1.desconto));
	}
}
