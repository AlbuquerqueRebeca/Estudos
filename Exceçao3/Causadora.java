package Exceçao3;

public class Causadora { 

public static void main(String[] args) {
    

  
		
		try {
		metodoA(null);
		}catch (IllegalArgumentException e) {
			if(e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}
	
    }




    static void metodoA(aluno aluno) {
		try {
	  
			metodoB(aluno);
		}catch (Exception causa) {
			throw new IllegalArgumentException(causa);
		}
	}
		
	static void metodoB(aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("Aluno esta NULO");
		}
		System.out.println(aluno.nome);
	}
		
	


















































}


























