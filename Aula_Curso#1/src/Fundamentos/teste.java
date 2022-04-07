package Fundamentos;

public class teste {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if(i % 2 == 0) {
				System.out.printf("Par = %d\n", i);
				continue;
			}
			
			System.out.printf("Impar = %d\n", i);
		}
	}
	
}
