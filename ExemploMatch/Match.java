package ExemploMatch;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import Filter.Aluno;

public class Match {

public static void main(String[] args) {
    

Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Olavo", 8.1);
		Aluno a3 = new Aluno("Rebeca", 6.3);
		Aluno a4 = new Aluno("Edith", 8.9);
		
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;  //expressao lambda pra aprovado
		Predicate<Aluno> reprovado = aprovado.negate(); 
		System.err.println(alunos.stream().allMatch(aprovado));
		




















































}

























































}