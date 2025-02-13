package RegrasEks;

import java.util.Scanner;

public class regras {

    public static void main(String[] args) {

        int podsPorNode = 10; 
        int podsPorServidor = 4; 


        Scanner scanner = new Scanner(System.in); 

        int numeroTotalPods = scanner.nextInt(); 

        int numeroMinimoNodes = (numeroTotalPods + podsPorNode - 1) / podsPorNode; 

        int numeroMinimoServidores = (numeroTotalPods + podsPorServidor - 1) / podsPorServidor;


        if(numeroMinimoNodes <= 1){
            System.out.println("1.Recomendamos usar um unico node"); 
        }else{
            System.out.println("1.Numero minimo de nodes:\" + numeroMinimoNodes"); 
        }
        
    }
    
}
