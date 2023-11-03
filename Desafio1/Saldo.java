package Desafio1;

import java.util.Scanner;

public class Saldo {

public static void main(String[] args) {
    
Scanner entrada = new Scanner(System.in);

double saldoAtual = entrada.nextDouble();
		double valorDeposito = entrada.nextDouble();
		double valorRetirada = entrada.nextDouble();

		// Calcular o saldo das duas transações
		if(valorDeposito > 0)  {
		    saldoAtual += valorDeposito; //positivo
		   
		}
		    
		    if(valorRetirada > 0) {
		    if(saldoAtual > Math.abs(valorRetirada)) {
		        saldoAtual -= Math.abs(valorRetirada); // negativo
		        System.out.println("Saldo atualizado na conta: " + saldoAtual);
		    } else {
		        System.out.println("Saldo insuficiente para retirada.\n");
		    }
		}

		































}








































}