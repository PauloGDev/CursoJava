package Colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
				
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		lista.remove(new Usuario("Lia"));
		
		
		for(Usuario Lista: lista) {
			System.out.println(Lista.nome);
		}
				
	}
}
