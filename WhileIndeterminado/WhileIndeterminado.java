package WhileIndeterminado;

import java.util.Scanner;

public class WhileIndeterminado{

public static void main(String[] args) {
    
//perguntas e respostas
//ate o usuario digitar a palavra sair
//o programa para de funcionar

//usando um while indeterminado

Scanner entrada = new Scanner(System.in);


   // System.out.println("Qual seu nome? ");
   // String entrada1 = entrada.next();
   //  System.out.println("Qual sua idade?");
   //  String entrada2 = entrada.next();
   //  System.out.println("Trabalha com o que?");
   //  String entrada3 = entrada.next();

String valor = "";

while(!valor.equalsIgnoreCase("sair")){
    //enquanto sair nao for digitado
    System.out.println("Diz ai ");
    valor  = entrada.next();
     
}









entrada.close();



}























}