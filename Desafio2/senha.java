package Desafio2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class senha{

     public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); 
       
       System.out.println("Digite a senhapara verificar a força: "); 
       String senha = scanner.nextLine(); 
       scanner.close();
       
       String resultado = verificarForcaSenha(senha); 
       System.out.println(resultado); 
      }
       
        public static String verificandoForcaSenha(String senha){ 
            int comprimentoMinimo = 8; 


            //criterios de validaçao
            boolean temLetraMaiuscula = Pattern.compile("[A-Z]").matcher(senha).find(); 
            boolean temLetraMinuscula = Pattern.compile("[a-z]").matcher(senha).find(); 

        }






























    
}