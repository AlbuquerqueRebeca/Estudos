package Bazinga;

import java.util.Scanner;

public class Jogo{ 

public static void main(String[] args) {
    
// primiera linha tem um inteiro positivo 

// pedra papel teroura lagarto e spock

// uma variavel t 
//uma variavel r


//regras:
// tesoura corta papel
//papel embrulha a pedra
//pedra esmaga o largarto 
//lagarto envenena spock 
//spock destroi a tesoura
//a tesoura decapita o lagarto 
//lagarto come o papel
//o papel contesta spock 
//spock vaporiza a pedra 
//pedra quebra a tesoura 

//reaçoes
//bazinga 
//raj trapaceou
//de novo 

Scanner entrada = new Scanner(System.in);

int T = Integer.parseInt(entrada.nextLine());  //numero de testes 
//entrada.nextLine();

for(int i = 1; i <= T; i ++){
    
   String Sheldon = entrada.nextLine();
   String Raj = entrada.nextLine();



if(Sheldon.equals(Raj)){ 
   System.out.printf("Caso #%d: De novo!", i); //fazendo comparativo entre strings 
} else if((Sheldon.equals("tesoura")  &&  Raj.equals("papel")) || 
         (Sheldon.equals("papel") && Raj.equals("pedra")) ||
         
         (Sheldon.equals("pedra") && Raj.equals("lagarto")) ||
         (Sheldon.equals("lagarto") && Raj.equals("spock")) || 
         (Sheldon.equals("spock") && Raj.equals("tesoura")) || 
         (Sheldon.equals("tesoura") && Raj.equals("lagarto")) ||
         
         (Sheldon.equals("lagarto") && Raj.equals("papel")) ||
         (Sheldon.equals("papel") && Raj.equals("spock")) || 
         (Sheldon.equals("spock") && Raj.equals("pedra")) ||
         (Sheldon.equals("pedra") && Raj.equals("tesoura"))) {
          System.out.printf("Caso #%d: Bazinga!", i);
         
         } else {
            
            
            
          System.out.printf("Caso #%d: Raj trapasseou!", i );
        
         }
        }
         
        
         














}

























}