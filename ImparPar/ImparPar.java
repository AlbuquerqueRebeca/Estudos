package ImparPar;

import java.util.Scanner;

public class ImparPar {

    public static void main(String[] args) {
        
    

Scanner entrada = new Scanner(System.in);

int N = entrada.nextInt();
String resultado = "";
//negativo/positivo/nulo




// Verifica se o número é par ou ímpar
if (N != 0) {
    if (N % 2 == 0) {
        resultado += " EVEN " + resultado;
    } else {
        resultado += " ODD " + resultado;
    }
}

System.out.print(resultado);
 // Verifica se o número é nulo, positivo ou negativo
if (N == 0) {
    resultado = " NULL ";
} else if (N > 0) {
    resultado = " POSITIVE";
} else {
    resultado = " NEGATIVE ";
}


System.out.print(resultado);



     
    

    
     

    }


}













