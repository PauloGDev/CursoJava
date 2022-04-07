package Fundamentos;

import java.util.Scanner;

public class ConversaoTemp {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos Graus? ");
		
		double graus = entrada.nextDouble();
		System.out.print("Deseja converter C -> F ou F - > C [1 ou 2]? ");
		String escolha = entrada.next();
		
		double result = "1".equals(escolha) ? graus * 1.8 + 32 : 0;
		result = "2".equals(escolha) ? (graus - 32) / 1.8 : result;
		
		System.out.println(result);
	}
}
