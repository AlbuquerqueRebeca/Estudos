package CalculandoCustos;

import java.util.Scanner;

public class CalculandoCustosAws {

    public static void main(String[] args) {
        // Definindo as taxas
        double custoPorHoraServidor = 0.15;
        double custoPorHoraBancoDados = 0.05;

        
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        int quantidadeServidores = scanner.nextInt();

        int quantidadeBancosDados = scanner.nextInt();

        

         
         double custoTotal = quantidadeServidores * 0.15 +  quantidadeBancosDados * 0.05;

        System.out.printf("Custo total de uso da AWS por hora: R$ %.2f%n", custoTotal);

       
        scanner.close();
    }
    
}
