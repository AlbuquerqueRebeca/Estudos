package Filter;

import java.util.Arrays;
import java.util.List;

public class Filters { 

public static void main(String[] args) {
    
Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 5.8);
		Aluno a3 = new Aluno("Daniel", 9.8);
		Aluno a4 = new Aluno("Rebeca", 8.8);
		Aluno a5 = new Aluno("Gui", 7.1);
		Aluno a6 = new Aluno("Pedro", 6.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6); //lista criada pra implementar map e filter 
		
		alunos.stream()
		     .filter(a -> a.nota >= 7) // filtrando as notas de quem foi aprovado
		     .map(a -> " Parabéns " + a.nome + " você foi APROVADO!!!  " ) //mapeamento da lista aluno pra string 
		     .forEach(System.out::println);   //foreach pra imprimir 
		
		
		































}




















































































}