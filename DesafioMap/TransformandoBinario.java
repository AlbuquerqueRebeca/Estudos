package DesafioMap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class TransformandoBinario {

public static void main(String[] args) {
    
List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);	

UnaryOperator<String> inverter = S -> new StringBuilder(S).reverse().toString();      //classe da API
	Function<String, Integer> binarioParaInt = S -> Integer.parseInt(S, 2);

      

    nums.stream()
		.map(Integer::toBinaryString)   //funçao que transforma numero inteiro em string binaria
		.map(inverter)             //invertendo a string
		.map(binarioParaInt)           //do binario para o inteiro                         
		.forEach(System.out::println);   //fazendo referencia pra print //imprimindo todos os numeros da lista
		

































































}




























































}