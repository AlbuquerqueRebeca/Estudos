package MaiorPosiçao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class MaiorPosiçao{

public static void main(String[] args) {
    
//maior valor lido
//e a posiçao de entrada

Scanner entrada = new Scanner(System.in);
 
ArrayList<Integer> numeros = new ArrayList<>();
Random rand = new Random();


for(int i = 0; i < 7; i ++){   // armazenamento de dados 
  int testes = entrada.nextInt();  
  numeros.add(testes);
}
//verificando maior valor lido

int maiorNumero = Collections.max(numeros);
int posiçao = numeros.indexOf(maiorNumero) + 1;
System.out.printf("%d\n", maiorNumero) ;
System.out.printf("%d" , posiçao);



    
    
  //verificando a posição de entrada











entrada.close();





}


}





