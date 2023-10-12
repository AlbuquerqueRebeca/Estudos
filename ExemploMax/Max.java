package ExemploMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import Filter.Aluno;

public class Max { 

public static void main(String[] args) {
    

Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Olavo", 6.1);
		Aluno a3 = new Aluno("Rebeca", 7.3);
		Aluno a4 = new Aluno("Edith", 8.9);
		
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		//usando a interface comparator pra comparar nota entre dois alunos
		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {  //usando tb uma expressao lambda
			if(aluno1.nota > aluno2.nota) return 1;
			if(aluno1.nota < aluno2.nota) return -1;
			return 0;
		};
		//funçao max pra verificar quem tem a melhor nota 
		System.out.println(alunos.stream().max(melhorNota).get());
		
		
		





















}









































}