package estruturaBoublesort;

public class BoubleSort {

	public BoubleSort() {
		// TODO Auto-generated constructor stub
	}

	public void startBouble (int lista[]) {
		int o = 7;
		
		for (int i = 0; i <o ;o--){ //passagem pelo vetor
			boolean trocou = false;
			for (int e = 0; e <o-i; e++){//passagem pelas posicoes do vetor
				if(lista[e] > lista[e+1]) {
					System.out.println("trocou");
					int prox = lista[e];
					lista[e] = lista[e+1];
					lista[e+1] = prox;
					trocou = true;
				} 
			}
			if(!trocou) {
				break;
			}
			System.out.println("sai do 2 for");
			
		}
		
	}
	
	
	

}
