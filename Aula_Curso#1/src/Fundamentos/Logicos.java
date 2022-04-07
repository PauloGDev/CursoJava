package Fundamentos;

public class Logicos {

	public static void main(String[] args) {
		
		boolean trab1 = true;
		boolean trab2 = true;

		boolean tv50 = trab1 && trab2;
		boolean tv32 = trab1 ^ trab2;
		boolean sorvete = trab1 || trab2;
		
		System.out.println("Comprou uma tv de 50? " + tv50);
		System.out.println("Comprou uma tv de 32? " + tv32);
	   System.out.println("Comprou sorvete? " + sorvete);

	}
}
