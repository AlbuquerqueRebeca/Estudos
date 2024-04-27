package Experiencias;

import java.util.Scanner;

public class Experiencias{


public static void main(String[] args) {
    

//entrada tem um numero inteiro e uma letra 
//quantia que representa a quantidade de cobais
//tipo indicando o tipo (sapo, coelho, rato)


// calcular a quantidade usada
//calcular o tipo usado 
//calcular a porcentagem de cada tipo que foi usado

//criar variaveis pra cada tipo 
// somar cada uma com a variavel quantidade 
// cada tipo multiplicado por 100 dividido por quantidade 
//a saida percentual tem 2 casas decimais

Scanner entrada = new Scanner(System.in);


 

 int ratos = 0;
 int sapos = 0;
 int coelhos = 0;
 
  int N = entrada.nextInt();
 // entrada.nextLine();
 for(int i = 0; i < N; i ++){
    int quantidade = entrada.nextInt();
    String tipo = entrada.next();
 
    //quantidade do tipo 
    switch (tipo) {
      case "R":
      ratos += quantidade;
      break;
      
      case "S":
       sapos += quantidade;
       break;
       case "C":
       coelhos += quantidade;
         break;
    }
   }

 int totalquantidade = sapos + coelhos + ratos;

 //calculando o tipo

 double tipoSapo = (double) sapos * 100 / totalquantidade; 
  double tipoRatos = (double) ratos * 100 / totalquantidade;
  double tipoCoelhos = (double) coelhos * 100  / totalquantidade;

  System.out.printf("Total: %d cobaias \n", totalquantidade);
  System.out.printf("Total de coelhos: %d\n", coelhos);
  System.out.printf("Total de ratos: %d\n", ratos);
  System.out.printf("Total de sapos: %d\n", sapos);
  System.out.printf("Percentual de coelhos: %.2f %%\n", tipoCoelhos);
  System.out.printf("Percentual de ratos: %.2f %%\n", tipoRatos);
  System.out.printf("Percentual de sapos: %.2f %%\n", tipoSapo);

 















entrada.close();





























}































}