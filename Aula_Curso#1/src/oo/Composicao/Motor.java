package oo.Composicao;

public class Motor {

	boolean ligado = false;
	double fatorInjecao = 0;
	
	int giros() {
		if(!ligado) {
			return 0;
		}
		else {
		return (int) Math.round(fatorInjecao *  3000);
		}
	}
	
}
