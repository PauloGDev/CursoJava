package Fundamentos;

import java.util.Scanner;

public class DesafioWhile {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double soma = 0;
		double media = 0;
		int quant = 0;
		double nota = 0;
		
		while(true) {
			System.out.print("Digite a nota do aluno: ");
			nota = entrada.nextDouble();
			
			if(nota >=  0 &&  nota <= 10){
			quant += 1;
			soma += nota;
			}
			else {
				break;
			}
		}
		
		media = soma / quant;
		System.out.printf("Media = %f", media);
	}
}
