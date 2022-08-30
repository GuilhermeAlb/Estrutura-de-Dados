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
		if ( ref == null) { //primeira inserção
			ref = new No (x, ref, null);
		}
		else { //proximas inserções
			ref = new No (x, ref, null);
			ref.getProx().setAnt(ref);
		}
	}
	
	public void ListaVazia (boolean vazia) {
		if (ref == null) {
			vazia = true;
		}
		else { vazia = false; }
		System.out.println("A lista está vazia? "+vazia);
	}
	
	public void Imprimir () {
		if (ref == null) {
			System.out.println("A lista está vazia");
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
			System.out.println("A lista está vazia");
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
			System.out.println("A lista está vazia");
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
			System.out.println("A lista está vazia, não há o que remover");
		}
		else {
			No i = ref;
			int teste = 1;
			while (teste == 1) { //testar se o valor pertence a lista 
				
				/* testar se o valor atual de 'i' é diferente do pedido
				 *e testar se o valor atual de 'i' não é o ultimo valor.
				 *se for diferente do valor pedido e não for o ultimo
				 *valor da lista, 'i' passará para o próximo valor.
				 */
				if ((i.getInfo() != remove) && (i.getProx() != null)) {
					i = i.getProx();
				}
				
				/*Se o ultimo valor de 'i' ainda for diferente do valor
				 * pedido, sabemos que o valor que foi pedido para ser
				 *removido não pertence a lista e nenhuma alteração será
				 *feita na lista.
				 */
				else if ((i.getProx() == null) && (i.getInfo() != remove)) {
					System.out.println("O valor não pertence à lista.");
					break;
				}
				
				/*caso as duas condições acima dêem false então encontramos
				 *o valor que foi pedido e a remoção será feita logo abaixo
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