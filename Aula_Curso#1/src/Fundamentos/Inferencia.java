package Fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Inferencia {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o 1? Sal?rio!");
		String salario1 = entrada.next().replace(",", ".");
		System.out.print("\nDigite o 2? Sal?rio!");
		String salario2 = entrada.next().replace(",", ".");
		System.out.print("\nDigite o 3? Sal?rio!");
		String salario3 = entrada.next().replace(",", ".");
		
		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3);

		double soma = s1 + s2 + s3;
		double media = soma/3;
		
		media = Math.round(media);
		
		System.out.println("Soma = " + soma);
		System.out.println("Media = " + media);
				
	}
}
