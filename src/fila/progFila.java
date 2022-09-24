package fila;


public class progFila {
    public static void main(String[]aStrings) {
        Fila f = new Fila();
        f.inserir(1);
        f.inserir(2);
        f.inserir(3);
        f.inserir(4);

        f.imprimir();

        while (!f.vazia()){
            f.retirar();
            System.out.println(f.cabeca.info);
        }

    }
}
