package Fundamentos;

import java.util.Scanner;

public class CursoNumPrimos {

	public static void main(String[] args) {
		
		String result = "Primo";
		
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		for(int c = 2; c < 10; c++) {
			if(num % c == 0 && c != num) {
				result = "Não é primo";
				break;
			}
		}
		
		System.out.println(result);
	}
}
