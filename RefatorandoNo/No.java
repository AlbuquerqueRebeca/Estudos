package RefatorandoNo;

public class No<T> { 

//atributo 
private T conteudo;
private  No<T> proximoNo;

//metodo
public No(T conteudo) {
    this.proximoNo = null;
    this.conteudo = conteudo ;
}

 //getset
public T getConteudo() {  ///pegando atributos da classe 
    return conteudo;
}


public void setConteudo(T conteudo) {  
    this.conteudo = conteudo;                
}                                            


public No<T> getProximoNo() {    //pegando atributos da classe 
    return proximoNo;     
}


public void setProximoNo(No<T> proximoNo) {
    this.proximoNo = proximoNo;
}

//contrutor
@Override
public String toString() {
    return "No [conteudo=" + conteudo + "]";
}










































}