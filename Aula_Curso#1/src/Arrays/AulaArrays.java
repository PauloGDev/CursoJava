package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AulaArrays {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas notas você deseja?");
		int quant = entrada.nextInt();
		
		double notas[] = new double[quant];
		
		
		for(int i = 0; i< notas.length; i++) {
			System.out.printf("Digite a nota %d: ", i+1);
			notas[i] = entrada.nextDouble();
			
		}
		double soma = 0;
		
		for(double nota: notas) {
			soma += nota;
		}
		
		System.out.printf("As notas foram: %s\nMedia das notas: %.2f"
				,Arrays.toString(notas), soma/notas.length);
		entrada.close();
		
	}
}
