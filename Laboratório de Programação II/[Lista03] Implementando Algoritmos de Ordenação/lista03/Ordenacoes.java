/**
 * Created by guidetti on 08/05/17.
 */
public class Ordenacoes {

    /**
     * Método ordenadorPorSelecao, recebe por parâmetro um arranjo desordenado
     * onde será aplicado nele o método o SelectionSort.
     *
     * Ex: Selection Sort https://www.youtube.com/watch?v=Yfj8Gp5gkPg
     *
     * @param arranjo Arranjo desordenado para aplicar o ordenador.
     */
    public void ordenadorPorSelecao(int[] arranjo) {
        for (int i = 0; i < arranjo.length; i++) {
            int minimum = i;// Indice do maior elemento
            for (int j = i + 1; j < arranjo.length; j++) {
                if (arranjo[minimum] > arranjo[j]) {
                    minimum = j;//Indice do maior elemento
                }
            }
            trocar(arranjo, i, minimum);//Coloca o elemento no seu devido local
        }
    }

    /**
     * Método ordenadorPorBolha, recebe como parâmetro um arranjo desordenado
     * que será aplciado nele o algoritmo de ordenação Bubble.
     *
     * Ex: Bubble Sort https://www.youtube.com/watch?v=lyZQPjUT5B4
     *
     * @param arranjo, Arranjo desordenado para aplicar o ordenador.
     */
    public void ordenadorPorBolha(int[] arranjo) {
        boolean trocou;
        do{
            trocou = false;
            for(int i = 1; i < arranjo.length; i++) {
                if(arranjo[i-1] > arranjo[i]) {
                    trocar(arranjo,i-1,i);
                    trocou = true;// sinaliza que houve a troca
                }
            }
        }while(trocou);// enquanto houver pelo menos uma troca repete o loop.
    }

    public void ordenadorPorBolha(int[] arranjo) {
        for (int i = 1; i < arranjo.length; i++) {
            int anterior = i - 1;
            int atual = i;
            while (anterior >= 0 && arranjo[anterior] > arranjo[atual]) {
                trocar(arranjo, anterior, atual);
                anterior--;
                atual--;
            }
        }
    }

    private static void trocar(int[] ordenado, int i, int j) {
        int seguro = ordenado[i];
        ordenado[i] = ordenado[j];
        ordenado[j] = seguro;
    }

}
