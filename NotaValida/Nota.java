package NotaValida;

import java.util.Scanner;

public class Nota{

public static void main(String[] args) {
  
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite uma nota: ");
    double nota = entrada.nextDouble();

     if(nota > 10 || nota < 0){
        System.out.println("Nota INVALIDA");
     }else if(nota >= 8.1){
        System.out.println("CONCEITO A");
        System.out.println("APROVADA!!!!!!!");
     }else if(nota >= 6.1){
        System.out.println("CONCEITO B");
        System.out.println("APROVADA!!!");
     }else if(nota >= 5.1){
        System.out.println("CONCEITO C");
        System.out.println("RECUPERAÇÃO!!!");
     }else if(nota >= 3.1){
        System.out.println("CONCEITO D");
        System.out.println("REPROVADO!!!");
     }
     
     entrada.close();
    
    
    
    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    









}










