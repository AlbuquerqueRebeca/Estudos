package Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;



public class ImprimindoObjetos {

   public static void main(String[] args) {
    
  System.out.println("USANDO FOR EACH");	
		
	List<String> aprovados = Arrays.asList("REBECA", "OLAVO", "BIA", "ANA");
		
	for(String nome: aprovados) {     //for each percorrendo toda o array list
		System.out.println(nome);
	}
		System.out.println("\nUSANDO ITERAÇÃO...");
		
	Iterator<String> iterator = aprovados.iterator();	//vai percorrer a lista que eu criei
	while(iterator.hasNext()) {                
	System.out.println(iterator.next());	                          
	}
		
	
	System.out.println("\\n USANDO STREAM");
	Stream<String> stream = aprovados.stream();
	stream.forEach(System.out::println);	//LAÇO INTERNO
		





















































   } 







































}