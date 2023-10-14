package Exceçao;

public class ExemploExceçao { 


public static void main(String[] args) {

   //metodo 
		try {
            geraErro01();
            }catch(RuntimeException e) {
                System.out.println(e.getMessage()); //mensagem associada ao erro 
            }
            try {
            geraErro02();
            } catch (Exception e) {  //tratando de forma generica
                System.out.println(e.getMessage());
            }
            System.out.println("Fim");
            
        
        }
          //Nao checada ou NAO verificada
        static void geraErro01() { //posso declarar ou nao declarar no metodo 
            throw new RuntimeException("Ocorreu um erro bem legal #01!!"); //throw estou lançando a exceçao
            
        }
        //checada / VERIFICADA
        static void geraErro02() throws Exception { //estou deixando claro a ação de uma exceçao checada ou Verificada
          throw new Exception("Ocorreu um erro bem legal #02!!"); //em exception significa que é uma sessao checada 
        
                 



































































}































































}