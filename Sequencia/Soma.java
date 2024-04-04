package Sequencia;

import java.util.Scanner;

public class Soma{

public static void main(String[] args) {
 
    //o arquivo contem um numero inteiro 
    //sao 3 entradas 


    //ler pares de valores 
    //parar quando algum dos valores for menor ou igual a zero 

    //para cada par lido, mostrar a sequencia do menor pro maior

    //soma dos inteiros consecotivos entre eles (incluindo M e N)



    // Saida, imprimir do menor pro maior e a soma entre eles 


       Scanner entrada = new Scanner(System.in);

     
   

    
     while ( true){
      int M = entrada.nextInt();  //primeiro: programa parar quando um dos valores
                                  // for menor ou igual a zero.
      int N = entrada.nextInt();
     if(M <= 0 || N <= 0){
     
     break;
     }
     
     
      

     //segundo: mostrando a sequencia de numero: do menor pro maior
     if(M > N){     //garantindo que m seja sempre menor ou igual a N
      int C = M;
      M = N;
      N = C;
     }
   
      // terceiro: A soma dos inteiros consecutivos 
      int soma = 0;
    StringBuilder sequencia = new StringBuilder(); 
     for(int i = M; i <= N; i ++){  // calculo
     sequencia.append(i).append(" ");
     
    
     soma += i;
     }
      
    
   
      System.out.print(sequencia.toString().trim() +  " Sum=" + soma);
      System.out.println();
     
      
    
    }
  entrada.close();


  }
 }
      
    


    












