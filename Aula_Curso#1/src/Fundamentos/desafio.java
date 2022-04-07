package Fundamentos;

import java.util.Scanner;

public class desafio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o número 1: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Digite o número 2: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("Digite a operação[+ - / %]:  ");
		String operacao = entrada.next();
		
		
		double result = "+".equals(operacao) ? num1 + num2 : 0;
		result = "-".equals(operacao) ? num1 - num2 : result;
		result = "/".equals(operacao) ? num1 / num2 : result;
		result = "*".equals(operacao) ? num1 * num2 : result;
		result = "%".equals(operacao) ? num1 % num2 : result;
		
		System.out.println(result);
	}
}
