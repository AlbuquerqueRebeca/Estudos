package Problema4;

public class Letras{

        public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); 
  
         int A = scanner.nextInt(); 
         int B = scanner.nextInt(); 


         if(A > B){
            System.out.println("aabbaabb");
         }else if(A < B){
            System.out.println("bbabb");
         }else{
            System.out.println("ababab");
         }
         
          scanner.close(); 



        }








}