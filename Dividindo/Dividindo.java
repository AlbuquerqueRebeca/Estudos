package Dividindo;


import java.util.Scanner;

public class Dividindo{

public static void main(String[] args) {
    

//um numero de testes inteiro 
// 2 pares de inteiros x e y
//calcular a divisao entre x e y 
//se nap for possivel "divisao impossivel

Scanner entrada = new Scanner(System.in);

double N = entrada.nextInt();



for(int i = 0; i < N; i ++){
    double x = entrada.nextInt();
    double y = entrada.nextInt();

    if(y != 0) {
   double calculo = x / y;
   System.out.println(calculo);

}else {
    System.out.println("divisao impossivel");

}
}  



































































}

}