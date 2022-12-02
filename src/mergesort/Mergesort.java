package mergesort;

public class Mergesort {

    public merge (int [] vector, int left, int middle, int right) {
        int [] aux = new int[vector.length]; //vetor auxiliar para receber os dados do vetor

        for(i = left, i <= right, i++) { // alimentar o vetor auxiliar
            aux[i] = vector[i];
        }

        int i = left;
        int j = middle + 1;
        int k = left;

        while(i <= middle && j <= right) {

            if (aux [i] <= aux[j]) {
                vector[k] = aux[i];
                i++;
            } else {
                vector[k] = aux[j];
                j++;
            }
            k++;
        }
    }
    
}
