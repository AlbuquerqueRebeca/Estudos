package Maps;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

public static void main(String[] args) {
    
    Consumer<String> print = System.out::print;	
		
	List<String> marcas = Arrays.asList("BMW ",  " AUDI",  " HONDA\n");
	
	marcas.stream().map(m -> m.toUpperCase()).forEach(print);
	//todas as marcas       //letras grandes   // imprimir no console	
		
		                              //lambda
	UnaryOperator<String>	maiuscula = n -> n.toUpperCase(); //operação unaria
	UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";	     //outro op. unario que vai retornar um caractere
	UnaryOperator<String>  grito = n -> n + "!!!!!!!!";	
		
	System.out.println(maiuscula.andThen(primeiraLetra).andThen(grito).apply("BMW"));	
		
	System.out.println("\nUSANDO COMPOSIÇÃO....");
		marcas.stream().map(maiuscula).map(primeiraLetra).map(grito).forEach(print);
		



















































































}































































}