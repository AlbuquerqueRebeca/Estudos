package MediaPonderada;

import java.util.Scanner;

public class MediaPonderada{

    public static void main(String[] args) {
    
        //tres testes 
        //tres valores com uma casa decimal 


    Scanner entrada = new Scanner(System.in);
     
    int N = entrada.nextInt();
     entrada.nextLine();

    for(int i = 0; i < N;  i++){
        Double teste1 = entrada.nextDouble(); 
        double teste2 = entrada.nextDouble();
        double teste3 = entrada.nextDouble(); 



        double media = ((teste1 * 2) + (teste2 * 3) + (teste3 * 5)) /  10;
        //dividio por 10, porque é o valor total dos pesos 

        System.out.printf("%.1f\n", media);
      



    }
    
    
          entrada.close();


























    }




























}