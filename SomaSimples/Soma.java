package SomaSimples;

import java.util.Scanner;

public class Soma {
    
public static void main(String[] args) {
    

Scanner entrada = new Scanner(System.in);
		
		int x = entrada.nextInt();
		int y = entrada.nextInt();
		int soma = 0;
		
		
		
             if(x > y){// pra verificar se x é maior q y 
			
			  int a = x;
			  x = y;       // trocando os valores de x e y usando uma variavel
			  y = a;  
		  }	  
			  
		  
             for(int i = x + 1; i < y; i ++) {
     			
     			if(i % 2 != 0) {   //verificando se y é impar
     		    	soma += i;
     			}
     		
     		}
			
		
	         System.out.println(soma);
		
		  
		
			entrada.close();

































}

































}
