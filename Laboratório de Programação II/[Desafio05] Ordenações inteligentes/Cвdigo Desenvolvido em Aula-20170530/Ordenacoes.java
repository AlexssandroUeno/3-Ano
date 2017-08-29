
import java.util.*;
/**
 * Write a description of class Ordenacoes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ordenacoes {
    
        /**
         * Ordena crescentemente o arranjo pelo algoritmo da bolha,
         * in-place.
         * @param arr arranjo de inteiros a ser ordenado.
         */
    public static List<Integer> bubblesort() {
        List<Integer> arr = Arrays.asList(9,8,7,6,5,4,3,2,1);
        System.out.println("Aplicando o Algoritmo BubbleSort\nTamanho: "+arr.size()+"\nantes-:>"+arr.toString());
        boolean houveTroca;
        do {
            houveTroca = false;
            for (int i = 1; i < arr.size(); i++) {
                if (arr.get(i-1) > arr.get(i)) {
                    Listtrocar(arr, i-1, i);
                    houveTroca = true;
                }
            }
        } while(houveTroca);
        System.out.println("Arranjo depois-:>"+arr.toString());
        return arr;
    }
        
        /**
         * Ordena crescentemente o arranjo pelo algoritmo da seleção,
         * in-place.
         * @param arr arranjo de inteiros a ser ordenado.
         */
    public static List<Integer> Listselectionsort() {
    List<Integer> arr = Arrays.asList(9,8,7,6,5,4,3,2,1);
    System.out.println("Aplicando o Algoritmo SelectionSort\nTamanho: "+arr.size()+"\nantes-:>"+arr.toString());
        // Para cada posição, encontrar o elemento correto
        for (int i = 0; i < arr.size() - 1; i++) {
            // Encontrar o menor elemento após o "i"
            int indiceMenor = i;
            for (int j = i+1; j < arr.size(); j++) {
                if(arr.get(indiceMenor) > arr.get(j)){
                    indiceMenor = j;
                }
            }   
            // Coloca o elemento correto na posicao
            Listtrocar(arr, i, indiceMenor);
        }
        System.out.println("Arranjo Depois-:>"+arr.toString());        
        return arr;
    }

    
     public static List<Integer> ListInsertionsort(List<Integer> arr) {
//         List<Integer> arr = Arrays.asList(9,8,7,6,5,4,3,2,1);
        System.out.println("Aplicando o Algoritmo InsertionSort\nTamanho: "+arr.size()+"\nantes-:>"+arr.toString());
        // Comprar cada carta
        for (int i = 1; i < arr.size(); i++) { // n
            // Carta comprada
            int seguro = arr.get(i); // n
            
            // Deslocar cartas para a direita, para abrir o espaço
            // correto da carta comprada.
            int j = i-1; // n
            while (j >= 0 && seguro < arr.get(j)) { // n * n
                arr.set(j+1,arr.get(j)); //n * n
                j--;// n * n
            }
            
            // Colocar a carta no lugar
            arr.set(j+1,seguro ); // n
        }
        System.out.println("Arranjo Depois-:>"+arr.toString());        
        return arr;
    }
    
    private static void trocar(Integer[] arr, int i, int j) {
        int seguro = arr[i];
        arr[i] = arr[j];
        arr[j] = seguro;
    }
    
    /**
     * Ordena crescentemente o arranjo pelo algoritmo de quicksort,
     * in-place.
     * 
     * @param arranjo arranjo de inteiros a ser ordenado.
     */
    public static void Listquicksort() {
        List<Integer> arranjo = Arrays.asList(9,8,7,6,5,4,3,2,1);
        System.out.println("Aplicando o Algoritmo QuickSort\nTamanho: "+arranjo.size()+"\nAntes->"+ arranjo.toString());
        Listquicksort(arranjo, 0, arranjo.size()-1);
        System.out.println("Depois->:"+ arranjo.toString());
    }
    
    /**
     * Ordena crescentemente o arranjo pelo algoritmo de quicksort,
     * in-place. Método recursivo.
     * 
     * @param arranjo arranjo de inteiros a ser ordenado.
     * @param indiceEsquerda índice do lado esquerdo.
     * @param indiceDireita índice do lado direito.
     */
    private static void Listquicksort(List<Integer> arranjo, int indiceEsquerda, int indiceDireita) {
        
        if (indiceEsquerda < indiceDireita){
            int principal = arranjo.get((indiceEsquerda + indiceDireita)/2);
            int indice = Listparticionar(arranjo, indiceEsquerda, indiceDireita, principal);
            Listquicksort(arranjo, indiceEsquerda, indice - 1);
            Listquicksort(arranjo, indice, indiceDireita);
        }
        
    }
    
    /**
     * Particiona os elementos do arranjo de acordo com um elemento
     * principal escolhido e retorna o índice do ponto onde
     * o arranjo foi particionado.
     * 
     * @param arranjo arranjo de inteiros a ser ordenado.
     * @param indiceEsquerda índice do lado esquerdo.
     * @param indiceDireita índice do lado direito.
     */
    private static int Listparticionar(List<Integer> arranjo, int indiceEsquerda, int indiceDireita, int principal) {
        int pivot = (indiceEsquerda + indiceDireita)/2;
        List<Integer> marcadores =  Arrays.asList(indiceEsquerda, indiceDireita, pivot);
       
        
        while (indiceEsquerda <= indiceDireita){
            while (arranjo.get(indiceEsquerda) < principal){
                indiceEsquerda++;
            }
            while (arranjo.get(indiceDireita) > principal){
                indiceDireita--;
            }
           
            if (indiceEsquerda <= indiceDireita){
                Listtrocar(arranjo, indiceEsquerda++, indiceDireita--);
            }
        }
  
        return indiceEsquerda;
    }
    
    private static void Listtrocar(List<Integer> arr, int i, int j) {
        int seguro = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, seguro);
    }
    
     /**
     * Ordena crescentemente o arranjo pelo algoritmo da intercalação,
     * in-place.
     * @param arranjo arranjo de inteiros a ser ordenado.
     */
    public static void ListmergeSort(List<Integer> arranjo) {
//         List<Integer> arranjo = Arrays.asList(9,8,7,6,5,4,3,2,1); 
        
        System.out.println("Aplicando o Algoritmo MergeSort\nTamanho: "+arranjo.size()+"\nAntes->"+arranjo);
        
        List<Integer> copiaArrajo = new ArrayList(arranjo);//copaiaaadadasdadas
        
        ListmergeSort(arranjo, copiaArrajo, 0, arranjo.size()-1);
        System.out.println("Depois->"+arranjo);
    }
    
        /**
     * Ordena crescentemente o arranjo pelo algoritmo da intercalação,
     * in-place. Método recursivo.
     * 
     * @param arranjo arranjo de inteiros a ser ordenado.
     * @param aux arranjo auxiliar.
     * @param inicio indice inicial.
     * @param fim indice final.
     */
    private static void ListmergeSort(List<Integer> arranjo, List<Integer> aux, int inicio, int fim) {
        if (inicio < fim){
            int meio = (inicio+fim)/2;
            ListmergeSort(arranjo, aux, inicio, meio);
            ListmergeSort(arranjo, aux, meio+1, fim);
            Listintercalar(arranjo, aux, inicio, fim);
        }
    }
    
    private static void Listintercalar(List<Integer> arranjo, List<Integer> aux, int inicio, int fim) {
        int[] marcadores = {inicio, fim};
   
        int meio = (inicio+fim)/2;
        int inicioDireita = meio + 1;
        int tamanho = fim - inicio + 1;
        
        // Controles de índices de cada metade do arranjo
        int indiceEsquerda = inicio;
        int indiceDireita = inicioDireita;
        int indiceArray = inicio;
        
        // Enquanto as duas metades ainda possuem elementos, intercala.
        while (indiceEsquerda <= meio && indiceDireita <= fim){
            
            if (arranjo.get(indiceEsquerda) < arranjo.get(indiceDireita)){
               
                aux.set(indiceArray, arranjo.get(indiceEsquerda));
                indiceArray++;
                indiceEsquerda++;
            } else {
                aux.set(indiceArray, arranjo.get(indiceDireita));
                indiceArray++;
                indiceDireita++;
            }
        }
        // Se o laço anterior acabou, então todos os elementos de uma das metades
        // já foram colocados no arranjo. Os dois laços seguintes terminam de inserir
        // os elementos restantes.
        while(indiceEsquerda <= meio){
            aux.set(indiceArray, arranjo.get(indiceEsquerda) );
            indiceArray++;
            indiceEsquerda++;
        }
        
        while(indiceDireita <= fim){
            aux.set(indiceArray, arranjo.get(indiceDireita));
            indiceArray++;
            indiceDireita++;
        }
        
        // Copia os elementos ordenados do arranjo auxiliar para o arranjo original.
        for (int i = inicio; i<inicio+tamanho; i++){
            arranjo.set(i, aux.get(i));
        }
    }
    
    
    /**
     * Essa classe não deve ser instanciada.
     */
    private Ordenacoes() {}
}
