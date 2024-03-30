package EstruturaCondicional;

import java.util.Scanner;

public class MediaIf{

public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);

     
       System.out.println("Digite a nota: ");
       double media = entrada.nextDouble();


       if(media >= 7.0){
        System.out.println("Você foi aprovado!!!");
         System.out.println("PARABÉNS!!!!!!!");
        } else if(media >= 5  && media <= 6){
        System.out.println("Você está de RECUPERAÇÃO!!");
       
        }else if(media >= 3  && media <= 4){
        System.out.println("Você foi Reprovado!!");
        
       } else {
        System.out.println("Tente ano que vem ");
       }

       
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    entrada.close();




     
}











}