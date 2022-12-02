package arvore;

public class Arvore {
    No root; // raiz

    public boolean isEmpty(){
        if(root == null){
            return true;
        }
        return false;
    }

    public Arvore() { root=null; } //inicializando a arvore

    
    public void inserir(int info){
        inserir(this.root, info);
    }
    
    //inserir com recursao
    public void inserir(Node info, int info) {
        if(isEmpty()){
            this.root = new No(info);
        } else {
            if(info < root.getInfo()){
                if(root.getEsq() == null) {//se esquerda null, inserir novo No
                    root.setEsq(new No(info));
                }
                else{ // se esquerda não for null, repetir metodo inserir() no No da esquerda
                    inserir(root.getEsq(), info);
                }
            }
            else { //se o info for igual ou maior que o info do No atual, ir para a direita
                if(root.getDir() == null) {//se direita null, inserir novo No
                    root.setDir(new No(info));
                }
                else{ // se direita não for null, repetir metodo inserir() no No da direita
                    inserir(root.getDir(), info);
                }
            }
        }
    }//fim do inserir

    public Node remover(int info) throws Exception{
        return remover(this.root, info);
    }

    private Node remover(Node node, int info) throws Exception{
        if(isEmpty()){
            throw new Exception("Árvore vazia");
        } else{
            if(info < root.getInfo()){
                root.setEsq(remover(root.getEsq(), info));
            } else if(info > root.getInfo()) {
                root.setDir(remover(root.getDir(), info));
            } else if(root.getDir() != null && root.getEsq() != null) {
                System.out.println(" No removido: " + root.getInfo());
                root.getInfo(encontraMinimo(root.getDir()).getInfo());
                root.setNoDireita(removeMinimo(root.getDir()).getInfo());
            } else {
                System.out.println("  Removeu No " + root.getInfo());  
                root = (root.getEsq() != null) ? root.getEsq() : root.getDir();
            }
            return root;
        }
    }



}
