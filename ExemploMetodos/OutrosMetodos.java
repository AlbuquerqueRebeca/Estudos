package ExemploMetodos;

import java.util.Arrays;
import java.util.List;

import Filter.Aluno;

public class OutrosMetodos {

public static void main(String[] args) {
    
    Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Olavo", 6.1);
		Aluno a3 = new Aluno("Rebeca", 7.3);
		Aluno a4 = new Aluno("Edith", 8.9);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Pedro", 6.1);
		Aluno a7 = new Aluno("Rebeca", 7.3);
		Aluno a8 = new Aluno("Maria", 8.9);
		
		
		
		
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println(" distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\ntakewhile");  //pegue elementos ate acontecer tal condiçao
		alunos.stream()
		      .distinct()
		      .skip(2)    //pulando dois elementos
		      .takeWhile(a -> a.nota >= 7)  //enquanto forem maior que 7
		      .forEach(System.out::println);
		
		  
		 System.out.println("\nskip/Limit");
		 alunos.stream()                       
		       .distinct()                 //funçoes intermediarias
		       .skip(2)
		       .limit(2)   //pegar so dois elementos//limitei a 2
		       .forEach(System.out::println);
		
		
		
		


















































    
}


































}