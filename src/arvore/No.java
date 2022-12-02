package arvore;

public class No {
    int info;
    No esq, dir;
   
	No(int info) {
        this.info = info;
        this.esq = null;
        this.dir = null;
    }

    public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

    public No getEsq() {
		return Esq;
	}

	public void setEsq(No esq) {
		this.esq = esq;
	}

    public No getDir() {
		return Dir;
	}

	public void setDir(No dir) {
		this.dir = dir;
	}


    
}
