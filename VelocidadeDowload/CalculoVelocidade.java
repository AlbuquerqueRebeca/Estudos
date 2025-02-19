package VelocidadeDowload;

import java.util.Scanner;

public class CalculoVelocidade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double distanciaServidores = scanner.nextDouble(); 
        double velocidadePlano = scanner.nextDouble(); 

        double velocidadeDowloadEstimada = calcularVelocidadeDowload(distanciaServidores, velocidadePlano); 

        System.out.println(String.format("%.2f", velocidadeDowloadEstimada)); 
   }
    
}
