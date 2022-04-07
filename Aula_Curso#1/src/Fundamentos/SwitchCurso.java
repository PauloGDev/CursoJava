package Fundamentos;

import java.util.Scanner;

public class SwitchCurso {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int seis = entrada.nextInt() % 2;
		
		switch(seis){
		case 0:
			System.out.println("Par");
			break;
		case 1:
			System.out.println("Impar");
			break;
		}
		
	}

	
}
