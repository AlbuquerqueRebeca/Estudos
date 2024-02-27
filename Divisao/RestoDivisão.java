package Divisao;

import java.util.Scanner;

public class RestoDivisão {

public static void main(String[] args) {
    
 Scanner entrada = new Scanner(System.in);

   //entradas 
  int x = entrada.nextInt();
  int y = entrada.nextInt();
    

    if(x > y){
    int temp = x;
    x = y;
    y = temp;
  }
   
  //imprimindo todos os valores entre eles 
   for(int i = x; i < y; i ++){ // a partir de 11 pra nao imprimir o 10 e menor que 18 pra nao imprimir o 18
    if(i % 5 == 2 || i % 5 == 3)  //divisao por 5 igual a 2 e a divisao por 5 igual a 3

    System.out.println(i);
   }

















}












}