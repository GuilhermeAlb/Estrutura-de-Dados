package estruturaBoublesort;

public class Run {

	public static void main(String[] args) {
		int lista [] = new int [10];
		BoubleSort bouble = new BoubleSort();
		
		lista[0] = 43;
		lista[1] = 4;
		lista[2] = 50;
		lista[3] = 1;
		lista[4] = 11;
		lista[5] = 550;
		lista[6] = 78;
		lista[7] = 70;
		
		System.out.println(lista[0]);
		System.out.println(lista[1]);
		System.out.println(lista[2]);
		System.out.println(lista[3]);
		System.out.println(lista[4]);
		System.out.println(lista[5]);
		System.out.println(lista[6]);
		System.out.println(lista[7]);
		
		bouble.startBouble(lista);
		
		System.out.println("após rodar: ");
		System.out.println();
		System.out.println(lista[0]);
		System.out.println(lista[1]);
		System.out.println(lista[2]);
		System.out.println(lista[3]);
		System.out.println(lista[4]);
		System.out.println(lista[5]);
		System.out.println(lista[6]);
		System.out.println(lista[7]);
	}

}
