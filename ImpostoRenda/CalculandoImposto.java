package ImpostoRenda;

import java.util.Scanner;

public class CalculandoImposto { 
    
public static void main(String[] args) {
  
    
   Scanner entrada = new Scanner(System.in);
   
   double valor = entrada.nextDouble();
   double ImpostoRenda;
  
    //calculo de imposto de renda
  
    if( valor <= 2000.00) {
      System.out.println("Isento");
    }else { 
        if(valor <= 3000.00){
      ImpostoRenda = (valor - 2000.00) * 0.08;
    }else if(valor <= 4500) {
      ImpostoRenda = (valor - 3000.00) * 0.18 + 1000.00 * 0.08;
    }else { 
    ImpostoRenda = (valor - 4500) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
    }
    System.out.printf("R$ %.2f\n", ImpostoRenda);
    }


















}




















}