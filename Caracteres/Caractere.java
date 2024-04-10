package Caracteres;

import java.util.Scanner;

public class Caractere{


public static void main(String[] args) {
    
//entrada uma linha de texto 

//indicar se uma linha de texto com 80 caracteres cabe ou nao no formulario . 
//função que verifica se cabe ou nao um texto de 80 caracteres 


Scanner entrada = new Scanner(System.in);

String texto = entrada.nextLine();


if(texto.length()  <= 80){
    
    System.out.println("YES");
} else 

System.out.println("NO");




























entrada.close();






















}




















}