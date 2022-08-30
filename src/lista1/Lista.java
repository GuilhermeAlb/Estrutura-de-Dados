package lista1;

public class Lista {
	private No ref = null;
	
	public Lista() {
		this.ref = null;
	}

	public No getRef() {
		return ref;
	}

	public void setRef(No ref) {
		this.ref = ref;
	}

	
	public void Inserir (int x) {
		if ( ref == null) { //primeira inser��o
			ref = new No (x, ref, null);
		}
		else { //proximas inser��es
			ref = new No (x, ref, null);
			ref.getProx().setAnt(ref);
		}
	}
	
	public void ListaVazia (boolean vazia) {
		if (ref == null) {
			vazia = true;
		}
		else { vazia = false; }
		System.out.println("A lista est� vazia? "+vazia);
	}
	
	public void Imprimir () {
		if (ref == null) {
			System.out.println("A lista est� vazia");
		}
		else {
			No i = ref;
			System.out.println("Do ultimo ao primeiro");
			for (; ; i = i.getProx()) {
				System.out.println(i.getInfo());
				if (i.getProx() == null) {
					
					break;
				}
				
			}
			System.out.println("Do primeiro ao ultimo");
			for (; ; i = i.getAnt()) {
				System.out.println(i.getInfo());
				if (i.getAnt() == null) {
					
					break;
				}
			}
		}		
	}
	
	public void ImprimirIndo () {
		if (ref == null) {
			System.out.println("A lista est� vazia");
		}
		else {
			System.out.println("imprimindo do ultimo inserido ao primeiro inserido: ");
			No i = ref;
			for (; ; i = i.getProx()) {
				System.out.println(i.getInfo());
				if (i.getProx() == null) {
					
					break;
				}	
			}
		}	
	}
	
	
	public void ImprimirVoltando () {
		if (ref == null) {
			System.out.println("A lista est� vazia");
		}
		else {
			System.out.println("imprimindo do primeiro inserido ao ultimo inserido: ");
			No i = ref;
			for (; ; i = i.getProx()) {
				if (i.getProx() == null) {
					
					break;
				}
				
			}
			for (; ; i = i.getAnt()) {
				System.out.println(i.getInfo());
				if (i.getAnt() == null) {
					
					break;
				}
			}
		}
				
	}
	
	
	public void Remover (int remove) {
		if (ref == null) {
			System.out.println("A lista est� vazia, n�o h� o que remover");
		}
		else {
			No i = ref;
			int teste = 1;
			while (teste == 1) { //testar se o valor pertence a lista 
				
				/* testar se o valor atual de 'i' � diferente do pedido
				 *e testar se o valor atual de 'i' n�o � o ultimo valor.
				 *se for diferente do valor pedido e n�o for o ultimo
				 *valor da lista, 'i' passar� para o pr�ximo valor.
				 */
				if ((i.getInfo() != remove) && (i.getProx() != null)) {
					i = i.getProx();
				}
				
				/*Se o ultimo valor de 'i' ainda for diferente do valor
				 * pedido, sabemos que o valor que foi pedido para ser
				 *removido n�o pertence a lista e nenhuma altera��o ser�
				 *feita na lista.
				 */
				else if ((i.getProx() == null) && (i.getInfo() != remove)) {
					System.out.println("O valor n�o pertence � lista.");
					break;
				}
				
				/*caso as duas condi��es acima d�em false ent�o encontramos
				 *o valor que foi pedido e a remo��o ser� feita logo abaixo
				 */
				else if (remove == i.getInfo()) {
					if(i.getAnt() == null) { //quando for remover o primeiro da lista (NOT OK)
						i = i.getProx();
						i.setAnt(null);
						ref = i;
						System.out.println("removido do final");
						break;
					}
					else if (i.getProx() == null) { //quando for remover o ultimo (OK)
						i = i.getAnt();
						i.setProx(null);
						System.out.println("removido do inicio");
						break;
					}
					else { //quando for remover um valor no meio da lista (OK)
						i = i.getProx();
						i.setAnt(i.getAnt().getAnt());
						i = i.getAnt();
						i.setProx(i.getProx().getProx());
						System.out.println("removido do meio");
						break;
					}
					
				}
			}
		}/*
			for (; ; i = i.getProx()) {
				if(remove == i.getInfo()) {
					if(i.getAnt() == null) { //quando for remover o primeiro da lista (NOT OK)
						i = i.getProx();
						i.setAnt(null);
						ref = i;
						System.out.println("removido do final");
					}
					else if (i.getProx() == null) { //quando for remover o ultimo (OK)
						i = i.getAnt();
						i.setProx(null);
						System.out.println("removido do inicio");
					}
					else { //quando for remover um valor no meio da lista (OK)
						i = i.getProx();
						i.setAnt(i.getAnt().getAnt());
						i = i.getAnt();
						i.setProx(i.getProx().getProx());
						System.out.println("removido do meio");
					}
					
				}
				
				if (i.getProx() == null) {
					
					break;
				}	
			}*/
		
		
	}
}