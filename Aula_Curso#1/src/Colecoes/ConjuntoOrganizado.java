package Colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoOrganizado {

	public static void main(String[] args) {
		
		//Set<String> lista = new HashSet<>();
		Set<String> lista = new TreeSet<>();
		lista.add("angelo");
		lista.add("ana");
		lista.add("aaa");
		lista.add("anao");
		
		for(String aprovados: lista) {
			System.out.println(aprovados);
		}
		
	}
}
