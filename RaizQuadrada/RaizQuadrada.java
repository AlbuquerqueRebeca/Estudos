package RaizQuadrada;

import java.util.Scanner;

public class RaizQuadrada{


public static void main(String[] args) {
    
Scanner entrada = new Scanner(System.in);


double R = entrada.nextDouble();
double numero = 10;
double estimativa = numero;

for(int i = 0; i < R; i ++){
 estimativa = ( estimativa + numero / estimativa) / 2;
}

System.out.printf(" %.10f" ,   estimativa, numero );


























entrada.close();



















}




















}