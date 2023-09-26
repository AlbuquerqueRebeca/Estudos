package Encadeamento;

public class No { 

 //atributo 
 private String conteudo;
 private  No proximoNo;
 
 //metodo
 public No(String conteudo) {
     this.proximoNo = null;
     this.conteudo = conteudo ;
 }

  //getset
 public String getConteudo() {  ///pegando atributos da classe 
     return conteudo;
 }


 public void setConteudo(String conteudo) {  //para alterar e modificar os valores de um atributo
     this.conteudo = conteudo;                //nao tera retorno, ele sera apenas modificado 
 }                                            //ele deve receber algum argumento, para ter a alteração


 public No getProximoNo() {    //pegando atributos da classe 
     return proximoNo;     
 }


 public void setProximoNo(No proximoNo) {
     this.proximoNo = proximoNo;
 }

 //contrutor
 @Override
 public String toString() {
     return "No [conteudo=" + conteudo + "]";
 }



}
 
 
 