package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Manu");
		fila.offer("Gui");
		
		System.out.println(fila.peek()); //Retorna NULL quando a lista está vazia
		System.out.println(fila.element()); //EXCEPTION quando a lista está vazia

		//fila.poll(); Apaga o proximo obj da lista. Retorna NULL.
		//fila.remove(); Apaga o proximo obj da lista. EXCEPTION.


		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);	
		
	}
}
