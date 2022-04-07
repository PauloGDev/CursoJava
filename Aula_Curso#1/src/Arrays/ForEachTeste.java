package Arrays;

public class ForEachTeste {

	
	public static void main(String[] args) {
		double[] notas = { 9.3, 10, 6, 5 };
		
		/*
		 * for(int i = 0; i < notas.length; i++) { System.out.println(notas[i]); }
		 */
		
		for(double nota : notas) {
			System.out.println(nota);
		}
	}
	
}
