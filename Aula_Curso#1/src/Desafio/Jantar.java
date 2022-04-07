package Desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa pe1 = new Pessoa("Roberto", 72.5);
		Comida c1 = new Comida("Bolo", 0.200);
		
		comer(pe1, c1);
	}
	

	static void comer(Pessoa p1, Comida c1) {
		System.out.printf("%s comeu %s, seu peso era: %.2f e foi para %.2f", 
				p1.nome, c1.nome, p1.peso, p1.peso + c1.peso);
	}
}
