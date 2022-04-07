package Metodos;

public class Produto {

	double preco;
	String nome;
	double desconto;
	
	//double PrecoDesc(double x, double y){
		//double result = x * (1 - y);
		//return result;
	//}
	
	double PrecoDesc(double x, double y){
		return preco * (1 - desconto);
	}
}
