package oo.Composicao;

public class CursoTeste {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Joao");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("Cleito");
		
		Curso c1 = new Curso("WEB");
		Curso c2 = new Curso("JAVA COMPLETO");
		Curso c3 = new Curso("Python");
		
		c1.addAluno(a1);
		c2.addAluno(a2);
		c3.addAluno(a2);
		
		a1.addCurso(c2);
		a2.addCurso(c1);
		a3.addCurso(c1);
		
		for(Aluno aluno: c3.alunos) {
			System.out.println(aluno.nome);
		}
		
	}

}
