package Fundamentos;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String resp = "";
		do {
			System.out.print("sair? ");
			resp = entrada.next();
		}while(!"sair".equalsIgnoreCase(resp));
		
	}
}
