package Colecoes;

import java.util.HashSet;

public class Hash {

	
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Roberto"));
		usuarios.add(new Usuario("Gui"));
		
		boolean result = usuarios.contains(new Usuario("Gui"));
		System.out.println(result);
	}
}
