package Reduce1;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ExemploReduce {


public static void main(String[] args) {
    
List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9); //lista com os valores
	
	BinaryOperator<Integer> soma = (ac, n) -> ac + n;       //usando o operador binario pra fa\er a aplicaçao reduce
	
		int total1 = nums.stream().reduce(soma).get();
		
		System.out.println(total1);
		
		Integer total2 =  nums.stream().reduce(100, soma); //reduce com valor inicial
		System.out.println(total2);
		
		//com o stream ele segue uma sequencia mais exata
		
		//segundo exemplo optional<Integer>
		
		nums.stream()
		    .filter(n -> n > 4)
		    .reduce(soma)
		    .ifPresent(System.out::println);  //se tiver presente essa funçao ele chama, caso contrario ele nao chama
		
		    














































































}






























}