package Fundamentos;

public class DesafioOperacao {

	public static void main(String[] args) {
		
		int conta2 = (((1 - 5) * (2 - 7)) /  2);
		conta2 = (int) Math.pow(conta2, 2);
		
		int conta1 = (6 * (3 + 2));
		conta1 = (((int) Math.pow(conta1, 2)) / (3 * 2));
		
		int result = (conta1 - conta2);
		result = (int) Math.pow(result, 3);
		result = result / (int) Math.pow(10, 3);
		
		System.out.println(result);
	}
}
