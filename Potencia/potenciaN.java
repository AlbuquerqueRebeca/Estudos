package Potencia;

import java.util.Scanner;

public enum potenciaN{

      public static void main(String[] args){

     Scanner scanner = new Scanner(System.in);

     int N = scanner.nextInt(); 

     int potencia = 0; 

     while(N % 2 == 0){ 
      potencia ++ ; 
      N /= 2; 
     }
      System.out.println(potencia); 




      }
    
}
