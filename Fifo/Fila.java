package Fifo;

public class Fila<T> {


    private No<T> refNoEntradaFila;

	
	public Fila() {                      //quando instanciar a fila, vai ser vazia
		this.refNoEntradaFila = null;
	}
	
	
	public boolean isEmpty() {     //testando se fila ta vazia
		return refNoEntradaFila == null? true : false; // se for igual a nulo, a fila esta vazia
	}
	
	public void enqueue(T object) {    //metodo enfilerar 
		No novoNo = new No();
		novoNo.setRefNo(refNoEntradaFila);                                   //novo no entrou na fila  // a referencia esta ligado ao antigo no da fila
		refNoEntradaFila = novoNo;  // novo no entrando na fila
	}
	
	public T first() { //vai retornar o primeiro no da fila
		if(!this.isEmpty()) {   //verificando se ela esta vazia
			No primeiroNo = refNoEntradaFila; //primeiro no esta como unico nó da fila
			while (true) {   //fazer um loop infinito com while ate ele chegar no primeiro da fila
				if(primeiroNo.getRefNo() != null) { //testando se é o primeiro da fila
					primeiroNo = primeiroNo.getRefNo();
				}else {
					break; //quando ele chegar no primeiro da fila, ele da um break
				}
			}
			return (T) primeiroNo.getObject();
		}
		return null;  //se estiver retorna nulo 
	}
	
	public boolean isEmpety() {
		return refNoEntradaFila == null? true : false;
	}


	@Override
	public String toString() {
		String stringRetorno = ""; 
		No noAuxiliar = refNoEntradaFila;
		
		if(refNoEntradaFila != null) {
		  while(true) {
			 stringRetorno += "[No{objeto" + noAuxiliar.getObject() + "}]--->";
			 noAuxiliar = noAuxiliar.getRefNo();
			 if(noAuxiliar.getRefNo() != null) {
				noAuxiliar = noAuxiliar.getRefNo(); 
			 }else {
				 break;
			 }
			 }
		}else {
			stringRetorno = "null";
		}
		
		return stringRetorno;
		
		
	}

	






















}