package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto");//Adiciona e substitui caso ja exista
		usuarios.put(2, "Jorge");
		usuarios.put(3, "Rebeca");
		
		//System.out.println(usuarios.keySet()); Mostra as chaves
		//System.out.println(usuarios.values()); Mostra os valores 
		//System.out.println(usuarios.entrySet()); Mostra chaves e valores
		
		//System.out.println(usuarios.containsKey(3)); // Mostra se contem a chave informada
		//System.out.println(usuarios.containsValue("Roberto"));// Se contem o valor informado
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for (String valores: usuarios.values()) {
			System.out.println(valores);
		}
		
		for(Entry<Integer, String> reg: usuarios.entrySet()) {
			System.out.println(reg);
		}
		
		
	}

}
