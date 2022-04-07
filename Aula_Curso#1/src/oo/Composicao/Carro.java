package oo.Composicao;

public class Carro {

	Motor motor = new Motor();
	
	void acelerar() {
		motor.fatorInjecao += 0.4;
	}
	
	void frear() {
		motor.fatorInjecao -= 0.4;
	}
	
	void parar() {
		motor.fatorInjecao = 0;
	}
	
	void ligar() {
			motor.ligado = true;
		}
	
	void desligar() {
		motor.ligado = false;
	}
	
}
