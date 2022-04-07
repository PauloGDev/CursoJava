package Fundamentos;

import java.util.Scanner;

public class ExerciciosBonus {

	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int data = entrada.nextInt();
		
		if(data % 4 == 0) {
			System.out.println("Ano bissexto!");
		}
		else {
			System.out.println("Não é Bissexto!");
		}
	}
}
