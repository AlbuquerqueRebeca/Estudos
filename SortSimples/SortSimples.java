package SortSimples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortSimples {

	
	public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);

     int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		
		int[] numero1 = {a, b, c};
		Arrays.sort(numero1);
		//criando uma funçao que percorre todos os elementos armazenados no array 
		
		for(Integer numeros : numero1) {
		
		 System.out.println(numeros);
		
		}
		
		
		System.out.println();
		
		int[] numero2 = {a, b, c };
		Integer[] numero21 = Arrays.stream(numero2).boxed().toArray(Integer[]::new);
		Arrays.sort(numero21, Collections.reverseOrder());
		
		for(Integer valores : numero2) {
			System.out.println(valores );
		}
		

       entrada.close();
     
	}

}
		
		
		
		
		
		
		
		
	
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	