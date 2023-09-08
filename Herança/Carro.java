package Herança;

public class Carro {
    
//atributo
	
int velocidadeAtual;
	
	
	
//2 metodos
//sem parametros
void acelerar() {
    velocidadeAtual += 5;  // aumentando de 5 em 5
}

void frear() {
 if(velocidadeAtual >= 5) {
     velocidadeAtual -= 5;   // se for diminuir a velocidade em 5
     
 }else { //se nao for maior que 5 não diminui
     velocidadeAtual = 0;     // atribuindo a 0
 }
    
}

//metodo tostring
public String toString() {
return "A velocidade atual é ..." + velocidadeAtual + "KM/h";
}






















}
