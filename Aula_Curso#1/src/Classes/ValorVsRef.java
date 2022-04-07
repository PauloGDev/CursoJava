package Classes;

public class ValorVsRef {

	
	public static void main(String[] args) {
		double a = 2;
		double b = a; //Atribuição por valor(Primitivo)
		
		a++;
		b--;//Valores independentes!
		
		Data d1 = new Data(1, 6, 2022);
		
		Data d2 = d1;//Atribuição por referencia!(Objeto)
	}
}
