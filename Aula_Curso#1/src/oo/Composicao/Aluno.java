package oo.Composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final String nome;
	
	final List<Curso> cursos = new ArrayList<>();
	
	void addCurso(Curso curso){
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	Aluno(String nome){
		this.nome = nome;
	}
}
