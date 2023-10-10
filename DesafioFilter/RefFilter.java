package DesafioFilter;

import java.util.Arrays;
import java.util.List;



public class RefFilter {

public static void main(String[] args) {
    

RefAluno a1 = new RefAluno("Ana", 7.8);
		RefAluno a2 = new RefAluno("Bia", 5.8);
		RefAluno a3 = new RefAluno("Daniel", 9.8);
		RefAluno a4 = new RefAluno("Rebeca", 8.8);
		RefAluno a5 = new RefAluno("Gui", 7.1);
		RefAluno a6 = new RefAluno("Pedro", 6.8);
		
		List<RefAluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6); //lista criada pra implementar map e filter 
		//filtrando alunos reprovados 
		alunos.stream()
		     .filter(a -> a.nota <= 7) //filtrando as notas de quem foi reprovado
		     .map(a -> a.nome + "Você foi Reprovado") //mensagem 
		     .forEach(System.out::println);
		
		  //filtrando alunos aprovados 
		     alunos.stream()
		     .filter(a -> a.nota >= 7) // filtrando as notas de quem foi aprovado
		     .map(a -> " Parabéns " + a.nome + " você foi APROVADO!!!  " ) //mapeamento da lista aluno pra string 
		     .forEach(System.out::println);   //foreach pra imprimir 
		
		
		































}




























}