package Encadeamento;

public class Main {
  
     public static void main(String[] args) {
        
     
   
    //instanciando pra fazer o encadeamento 
	
	No no1 = new No("conteudo no1");
		
	
	
	No no2 = new No("conteudo no2");
	no1.setProximoNo(no2);  //referencia apontada pro no2
	
	No no3 = new No ("conteudo no3");
	no2.setProximoNo(no3);   //referencia apontada pro no3
	  
	No no4 = new No("conteudo no4");
	no3.setProximoNo(no4);	 //referencia apontada pro no4 
		
		
	System.out.println(no1.getProximoNo().getProximoNo());	
	System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());	
		
		
		 













































     }

}
