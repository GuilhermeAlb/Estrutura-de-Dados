package lista1;

import java.util.Scanner;

public class Teste {
	
	public static void main (String[]args) {		
		Scanner sc = new Scanner(System.in);
		
		
		
		int valor;
		
		Lista lista = new Lista ();
		
		int op;
		
		do { //Inicio da execu��o do programa
			
			System.out.println("'''''''' Menu de Intera��o ''''''''");
			System.out.println("Digite 1 para inserir dados na lista");
			System.out.println("Digite 2 para remover dados da lista");
			System.out.println("Digite 3 para Imprimir a lista (primeiro ao ultimo)");
			System.out.println("Digite 4 para Imprimir a lista (ultimo ao primeiro)");
			System.out.println("Digite 5 para Imprimir nos dois sentidos anteriores");
			System.out.println("Digite 0 para finalizar a execu��o");
			op = sc.nextInt();
			
			if ((op < 0) || (op>5)) {
				System.out.println("Op��o n�o encontrada. Finalizando execu��o.");
				break;
				
			}
			switch (op) {
			case 1: //Inserir dados na lista
				do {
					System.out.println();
					System.out.println();

					System.out.println("digite um valor inteiro para inserir: ");
					valor = sc.nextInt();
					lista.Inserir(valor); //Enviando valor para dentro da lista
					System.out.println("valor inserido com sucesso!");
					System.out.println("Digite 1 para inserir outro valor");
					System.out.println("Digite 0 para voltar ao Menu Inicial");
					op = sc.nextInt();

					if (op == 1) {
						System.out.println("Voltando � inser��o...");
					}
					else if (op ==0) {
						System.out.println("Retornando ao Menu Inicial...");
						System.out.println();
						System.out.println();

						break;
					}
					else {
						System.out.println("Op��o n�o reconhecida. Retornando ao Menu Inicial...");
						System.out.println();
						System.out.println();
						op = 0;

					}
				} while(op == 1);
				break; // Final da Inser��o
			case 2: //Remover dados da lista
				int remove;
				do {
					System.out.println();
					System.out.println();

					System.out.println("Digite um n�mero a ser removido: ");
					remove = sc.nextInt();
					lista.Remover(remove);
					System.out.println("Digite 2 para remover outro valor");
					System.out.println("Digite 0 para voltar ao Menu Inicial");
					op = sc.nextInt();
					if (op == 2) {
						System.out.println("Voltando � remo��o...");

					}
					else if (op == 0) {
						System.out.println("Retornando ao Menu Inicial...");
						System.out.println();
						System.out.println();

					}
					else {
						System.out.println("Op��o n�o reconhecida. Retornando ao Menu Inicial...");
						System.out.println();
						System.out.println();
						op = 0;

					}
					
					
				} while(op == 2);
				break; // Final da remo��o
			case 3: // Imprimir a lista (primeiro ao ultimo)
				lista.ImprimirVoltando();
				break;
				// Fim da impress�o
			
			case 4: // Imprimir a lista (ultimo ao primeiro)
				lista.ImprimirIndo();
				break;
				// Fim da impress�o
			
			case 5: // Imprimir a lista (nos dois sentidos)
				lista.Imprimir();
				break;
				// Fim da impress�o
			
			case 0:
				System.out.println("Execu��o finalizada!");
				op = 9;
				break;
			
				
			} // FIM DO SWITCH
		} while ((op >= 0) && (op<=5)); //Fim da execu��o
			
			
			
			
		/*System.out.println("digite um valor inteiro para remover: ");
		int remove = sc.nextInt();
		lista.Remover(remove);
		System.out.println("nova lista");
		lista.Imprimir();*/
	
	
	}
}