package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		
		
		//livros.push(Object e); Retorna EXCEPTION caso o limite seja excedido.
		//livros.add(String e);  Retorna NULL caso o limite seja excedido.
		//add n?o funciona como pilha 
		
		livros.push("O pequeno principe");
		livros.push("Hobbit");
		livros.add("aaa");		

		System.out.println(livros.peek());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.pop());

		
	}
}
