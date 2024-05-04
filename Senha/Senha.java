package Senha;

import java.util.Scanner;

public class Senha{

//uma entrada de numero inteiro 

public static void main(String[] args) {
    
 Scanner entrada = new Scanner(System.in);

   while (true) {
    
   if(entrada.hasNextInt()){
  int N = entrada.nextInt();
  
  if(N == 2002){
    System.out.println("Acesso Permitida");
    break;
   
   }else{
    System.out.println("Senha Invalida");
   }

   }
  }
 
 
 































}


}


























