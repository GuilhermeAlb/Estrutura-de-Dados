package fila;

public class Fila {
    No cabeca;
    No inicio;
    int tamanho;

    Fila(){
        inicio = null;
        cabeca = null;
        tamanho = 0;
    }

    int verificaCabeca(){
        if (cabeca == null) {
            return 0;
        }
        return cabeca.info;
    }

 
    boolean vazia(){
        return tamanho == 0;
    }


    void inserir (int info){
        No no = new No ();
        no.info = info;
        no.proximo = inicio;
        inicio = no;
        if (tamanho == 0) {
            cabeca = no;
        }
        tamanho++;
    }

    public void retirar () {
        if(vazia()){
            System.out.println("nao tem oq retirar");
        }
        if (tamanho == 1 ){ //se tiver apenas um No na lista, ela sera zerada
             inicio = null;
             cabeca = null;
        } else{
            No local = inicio;
            while (local.proximo != cabeca){
                local = local.proximo;
            }
            cabeca = local;
            cabeca.proximo = null;
        } 
        tamanho--;
        
    }

    public void imprimir(){
        No i = inicio;
		System.out.println("Do ultimo ao primeiro");
		for (; ; i = i.proximo) {
			System.out.println(i.info);
			if (i.proximo == null) {
					
				break;
			}
				
		}
    }



}
