package Desafio2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class senha{

     public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); 
       
       System.out.println("Digite a senhapara verificar a força: "); 
       String senha = scanner.nextLine(); 
       scanner.close();
       
       String resultado = verificarForcaSenha(senha); 
       System.out.println(resultado); 
      }
       
        public static String verificandoForcaSenha(String senha){ 
            int comprimentoMinimo = 8; 


            //criterios de validaçao
            boolean temLetraMaiuscula = Pattern.compile("[A-Z]").matcher(senha).find(); 
            boolean temLetraMinuscula = Pattern.compile("[a-z]").matcher(senha).find();
            boolean temNumero = Pattern.compile("\\d").matcher(senha).find();  
            boolean temCaractereEspecial = Pattern.compile("\\w").matcher(senha).find();
            boolean temSequenciaComun = senha.matches(".*(?i)123456.*|.*(?i)abcdef.*"); 
            boolean temPalavraComun = senha.equalsIgnoreCase("password") || senha.equalsIgnoreCase("123456") || senha.equalsIgnoreCase("qwerty");
          


              //verifica comprimento minimo e criterios de validaçao
              if(senha.length()< comprimentoMinimo){ 
                return "Sua senha e muito curta. Recomenda-se no minimo 8 caracteres.";
              }else if(!temLetraMaiuscula || !temLetraMinuscula || !temNumero || ! temCaractereEspecial){ 
                return "Sua senha não atende aos requisitos de segurança."; 
              }else if(temSequenciaComum || temPalavraComum){ 
                    return "Sua senha nao atende aos requsitos de seguranca. Evite sequencia comum e palavras comuns"; 
              }
              

              }


        }






























    
}