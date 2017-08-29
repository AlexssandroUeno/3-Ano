import java.util.ListIterator;
import java.awt.Color;
import java.util.Arrays;

/**
 * Write a description of class AlgoritmosAnimados here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlgoritmosAnimados{
// {
//     public static Gravador buscaSequencial(int[] arranjo, int chave) {
//         Gravador anim = new Gravador(); // Instancia objeto Gravador.
//         anim.gravarArranjo(arranjo, "Inicio de busca sequencial"); // Grava o arranjo inicial (primeiro quadro).
//         
//         int i = 0; // Índice dos quadros.
//         anim.gravarIndiceDestacado(arranjo, i, "Busca sequencial", Color.YELLOW); // Grava o primeiro quadro que inicia a busca.
//         while (i < arranjo.length && arranjo[i] != chave) { // Enquanto a chave é diferente, avança e grava o próximo quadro.
//             i++;
//             anim.gravarIndiceDestacado(arranjo, i, "Busca sequencial", Color.YELLOW);
//         }
//         
//         // Se terminou o loop e o índice é menor que o tamanho do arranjo, grava o destaque do último índice encontrado.
//         if (i < arranjo.length) {
//             anim.gravarIndiceDestacado(arranjo, i, "Chave encontrada", Color.YELLOW); // Grava um quadro com o novo índice destacado.
//         } else {
//             anim.gravarArranjo(arranjo, "Chave não encontrada"); // Grava o fim dos quadros.
//         }
//         
//         return anim;
//     }
//     
//     
//     public static Gravador ordenarPorBolha(int[] arranjo) {
//         Gravador anim = new Gravador();
//         anim.gravarArranjo(arranjo, "Disposição inicial");
//         
//         boolean houveTroca;
//         do { 
//             houveTroca = false; 
//             for (int i = 1; i < arranjo.length; i++) {
//                 anim.gravarComparacaoSimples(arranjo, i-1, i);
//                 if (arranjo[i-1] > arranjo[i]) {
//                     anim.gravarPosTrocas(arranjo, i-1, i);
//                     trocar(arranjo, i-1, i);
//                     houveTroca = true;
//                 }
//             }
//         } while(houveTroca);
//         
//         anim.gravarArranjo(arranjo, "Disposição final");
//         
//         return anim;
//     }
//     
//     /**
//      * Ordena crescentemente o arranjo pelo algoritmo da seleção,
//      * in-place.
//      * 
//      * Complexidade pior caso: O(n^2)
//      * Complexidade melhor caso: O(n^2)
//      * 
//      * Classificação: Θ(n^2)
//      * 
//      * @param arranjo arranjo de inteiros a ser ordenado.
//      */
//     public static Gravador ordenarPorSelecao(int[] arranjo) {
//         Gravador anim = new Gravador();
//         anim.gravarArranjo(arranjo, "Disposição inicial");
//         
//         for (int i = 0; i < arranjo.length - 1; i++) {
//             
//             int indiceMenor = i;
//             for (int j = i+1; j < arranjo.length; j++) {
//                 anim.gravarComparacaoSimples(arranjo, indiceMenor, j);
//                 if (arranjo[indiceMenor] > arranjo[j]) {
//                     indiceMenor = j;  
//                 }
//             }
//             anim.gravarPosTrocas(arranjo, i, indiceMenor);
//             trocar(arranjo, i, indiceMenor);
//         }
//         
//         anim.gravarArranjo(arranjo, "Disposição final");
//         
//         return anim;
//     }
//     
//     /**
//      * Ordena crescentemente o arranjo pelo algoritmo da inserção,
//      * in-place.
//      * 
//      * Complexidade pior caso: O(n^2)
//      * Complexidade melhor caso: O(n)
//      * 
//      * Classificação:  O(n^2) | Ω(n)
//      * 
//      * 
//      * @param arranjo arranjo de inteiros a ser ordenado.
//      */
//     public static Gravador ordenarPorInsercao(int[] arranjo) {
//         Gravador anim = new Gravador();
//         anim.gravarArranjo(arranjo, "Disposição inicial");
//         
//         for (int i = 1; i < arranjo.length; i++) {
//             int seguro = arranjo[i];
//             int j = i-1;
//             while (j >= 0 && seguro < arranjo[j]) {
//                 anim.gravarIndiceDestacado(arranjo, j+1, "Comparar com elemento segurado.", Color.GRAY);
//                 anim.gravarPosTrocas(arranjo, j, j+1);
//                 arranjo[j+1] = arranjo[j];
//                 j--;
//             }
//             
//             anim.gravarIndiceDestacado(arranjo, j+1, "Inserir na posição.", Color.YELLOW);
//             arranjo[j+1] = seguro;
//         }
//         
//         anim.gravarArranjo(arranjo, "Disposição final");
//         
//         return anim;
//     }
//     
//     /**
//      * Ordena crescentemente o arranjo pelo algoritmo da intercalação,
//      * in-place.
//      * @param arranjo arranjo de inteiros a ser ordenado.
//      */
//     public static void ListmergeSort(int[] arranjo) {
//         mergeSort(arranjo, Arrays.copyOf(arranjo, arranjo.length), 0, arranjo.length-1, anim);
//     }
//     
//     /**
//      * Ordena crescentemente o arranjo pelo algoritmo da intercalação,
//      * in-place. Método recursivo.
//      * 
//      * @param arranjo arranjo de inteiros a ser ordenado.
//      * @param aux arranjo auxiliar.
//      * @param inicio indice inicial.
//      * @param fim indice final.
//      */
//     public static void ListmergeSort(int[] arranjo, int[] aux, int inicio, int fim, Gravador anim) {
//         if (inicio < fim){
//             int meio = (inicio+fim)/2;
//             mergeSort(arranjo, aux, inicio, meio, anim);
//             mergeSort(arranjo, aux, meio+1, fim, anim);
//             intercalar(arranjo, aux, inicio, fim, anim);
//         }
//     }
//     
//     public static void Listintercalar(int[] arranjo, int[] aux, int inicio, int fim, Gravador anim) {
//         int[] marcadores = {inicio, fim};
//         anim.gravarMarcadores(aux, marcadores);
//         
//         int meio = (inicio+fim)/2;
//         int inicioDireita = meio + 1;
//         int tamanho = fim - inicio + 1;
//         
//         // Controles de índices de cada metade do arranjo
//         int indiceEsquerda = inicio;
//         int indiceDireita = inicioDireita;
//         int indiceArray = inicio;
//         
//         // Enquanto as duas metades ainda possuem elementos, intercala.
//         while (indiceEsquerda <= meio && indiceDireita <= fim){
//             anim.gravarComparacaoSimplesComMarcadores(aux, indiceEsquerda, indiceDireita, marcadores);
//             if (arranjo[indiceEsquerda] < arranjo[indiceDireita]){
//                 anim.gravarPosTrocasComMarcadores(aux, indiceArray, indiceEsquerda, marcadores);
//                 aux[indiceArray] = arranjo[indiceEsquerda];
//                 indiceArray++;
//                 indiceEsquerda++;
//             } else {
//                 anim.gravarPosTrocasComMarcadores(aux, indiceArray, indiceDireita, marcadores);
//                 aux[indiceArray] = arranjo[indiceDireita];
//                 indiceArray++;
//                 indiceDireita++;
//             }
//         }
//         // Se o laço anterior acabou, então todos os elementos de uma das metades
//         // já foram colocados no arranjo. Os dois laços seguintes terminam de inserir
//         // os elementos restantes.
//         while(indiceEsquerda <= meio){
//             anim.gravarComparacaoSimplesComMarcadores(aux, indiceEsquerda, meio, marcadores);
//             anim.gravarPosTrocasComMarcadores(aux, indiceArray, indiceEsquerda, marcadores);
//             aux[indiceArray] = arranjo[indiceEsquerda];
//             indiceArray++;
//             indiceEsquerda++;
//         }
//         
//         while(indiceDireita <= fim){
//             anim.gravarComparacaoSimplesComMarcadores(aux, indiceDireita, fim, marcadores);
//             anim.gravarPosTrocasComMarcadores(aux, indiceArray, indiceDireita, marcadores);
//             aux[indiceArray] = arranjo[indiceDireita];
//             indiceArray++;
//             indiceDireita++;
//         }
//         
//         // Copia os elementos ordenados do arranjo auxiliar para o arranjo original.
//         for (int i = inicio; i<inicio+tamanho; i++){
//             arranjo[i] = aux[i];
//         }
//     }
//     
//         /**
//      * Ordena crescentemente o arranjo pelo algoritmo da intercalação,
//      * in-place. Método recursivo.
//      * 
//      * @param arranjo arranjo de inteiros a ser ordenado.
//      * @param aux arranjo auxiliar.
//      * @param inicio indice inicial.
//      * @param fim indice final.
//      */
//     public static void mergeSort(List<Integer> arranjo, int[] aux, int inicio, int fim, Gravador anim) {
//         if (inicio < fim){ 
//             int meio = (inicio+fim)/2;
//             mergeSort(arranjo, aux, inicio, meio, anim);
//             mergeSort(arranjo, aux, meio+1, fim, anim);
//             intercalar(arranjo, aux, inicio, fim, anim);
//         }
//     }
//     
//     public static void intercalar(int[] arranjo, int[] aux, int inicio, int fim, Gravador anim) {
//         int[] marcadores = {inicio, fim};
//         anim.gravarMarcadores(aux, marcadores);
//         
//         int meio = (inicio+fim)/2;
//         int inicioDireita = meio + 1;
//         int tamanho = fim - inicio + 1;
//         
//         // Controles de índices de cada metade do arranjo
//         int indiceEsquerda = inicio;
//         int indiceDireita = inicioDireita;
//         int indiceArray = inicio;
//         
//         // Enquanto as duas metades ainda possuem elementos, intercala.
//         while (indiceEsquerda <= meio && indiceDireita <= fim){
//             anim.gravarComparacaoSimplesComMarcadores(aux, indiceEsquerda, indiceDireita, marcadores);
//             if (arranjo[indiceEsquerda] < arranjo[indiceDireita]){
//                 anim.gravarPosTrocasComMarcadores(aux, indiceArray, indiceEsquerda, marcadores);
//                 aux[indiceArray] = arranjo[indiceEsquerda];
//                 indiceArray++;
//                 indiceEsquerda++;
//             } else {
//                 anim.gravarPosTrocasComMarcadores(aux, indiceArray, indiceDireita, marcadores);
//                 aux[indiceArray] = arranjo[indiceDireita];
//                 indiceArray++;
//                 indiceDireita++;
//             }
//         }
//         // Se o laço anterior acabou, então todos os elementos de uma das metades
//         // já foram colocados no arranjo. Os dois laços seguintes terminam de inserir
//         // os elementos restantes.
//         while(indiceEsquerda <= meio){
//             anim.gravarComparacaoSimplesComMarcadores(aux, indiceEsquerda, meio, marcadores);
//             anim.gravarPosTrocasComMarcadores(aux, indiceArray, indiceEsquerda, marcadores);
//             aux[indiceArray] = arranjo[indiceEsquerda];
//             indiceArray++;
//             indiceEsquerda++;
//         }
//         
//         while(indiceDireita <= fim){
//             anim.gravarComparacaoSimplesComMarcadores(aux, indiceDireita, fim, marcadores);
//             anim.gravarPosTrocasComMarcadores(aux, indiceArray, indiceDireita, marcadores);
//             aux[indiceArray] = arranjo[indiceDireita];
//             indiceArray++;
//             indiceDireita++;
//         }
//         
//         // Copia os elementos ordenados do arranjo auxiliar para o arranjo original.
//         for (int i = inicio; i<inicio+tamanho; i++){
//             arranjo[i] = aux[i];
//         }
//     }
//     
//     
//     /**
//      * Ordena crescentemente o arranjo pelo algoritmo de quicksort,
//      * in-place.
//      * 
//      * @param arranjo arranjo de inteiros a ser ordenado.
//      */
//     public static Gravador quicksort(int[] arranjo) {
//         Gravador anim = new Gravador();
//         anim.gravarArranjo(arranjo, "Disposição inicial");
//         
//         quicksort(arranjo, 0, arranjo.length-1, anim);
//         
//         anim.gravarArranjo(arranjo, "Disposição final");
//         
//         return anim;
//     }
//     
//     /**
//      * Ordena crescentemente o arranjo pelo algoritmo de quicksort,
//      * in-place. Método recursivo.
//      * 
//      * @param arranjo arranjo de inteiros a ser ordenado.
//      * @param indiceEsquerda índice do lado esquerdo.
//      * @param indiceDireita índice do lado direito.
//      */
//     public static void quicksort(int[] arranjo, int indiceEsquerda, int indiceDireita, Gravador anim) {
//         
//         if (indiceEsquerda < indiceDireita){
//             int principal = arranjo[(indiceEsquerda + indiceDireita)/2];
//             int indice = particionar(arranjo, indiceEsquerda, indiceDireita, principal, anim);
//             quicksort(arranjo, indiceEsquerda, indice - 1, anim);
//             quicksort(arranjo, indice, indiceDireita, anim);
//         }
//         
//     }
//     
//     /**
//      * Particiona os elementos do arranjo de acordo com um elemento
//      * principal escolhido e retorna o índice do ponto onde
//      * o arranjo foi particionado.
//      * 
//      * @param arranjo arranjo de inteiros a ser ordenado.
//      * @param indiceEsquerda índice do lado esquerdo.
//      * @param indiceDireita índice do lado direito.
//      */
//     public static int particionar(int[] arranjo, int indiceEsquerda, int indiceDireita, int principal, Gravador anim) {
//         int pivot = (indiceEsquerda + indiceDireita)/2;
//         int[] marcadores = {indiceEsquerda, indiceDireita, pivot};
//         anim.gravarMarcadores(arranjo, marcadores);
//         
//         while (indiceEsquerda <= indiceDireita){
//             while (arranjo[indiceEsquerda] < principal){
//                 anim.gravarComparacaoSimplesComMarcadores(arranjo, indiceEsquerda, pivot, marcadores);
//                 indiceEsquerda++;
//             }
//             while (arranjo[indiceDireita] > principal){
//                 anim.gravarComparacaoSimplesComMarcadores(arranjo, indiceDireita, pivot, marcadores);
//                 indiceDireita--;
//             }
//             anim.gravarComparacaoSimplesComMarcadores(arranjo, indiceEsquerda, indiceDireita, marcadores);
//             if (indiceEsquerda <= indiceDireita){
//                 anim.gravarPosTrocasComMarcadores(arranjo, indiceEsquerda, indiceDireita, marcadores);
//                 trocar(arranjo, indiceEsquerda++, indiceDireita--);
//             }
//         }
//         
//         return indiceEsquerda;
//         
//     }
//     
//     public static Gravador buscaBinaria(int[] arranjo, int chave){ 
//         Gravador anim = new Gravador();
//         anim.gravarArranjo(arranjo, "Disposição inicial");
//         
//         int indiceInf = 0;
//         int indiceSup = arranjo.length - 1;
//         
//         while(indiceInf <= indiceSup){
//             int[] marcadores = {indiceInf, indiceSup};
//             anim.gravarMarcadores(arranjo, marcadores);
//             
//             int meio = (indiceInf + indiceSup)/2;
//             anim.gravarIndiceDestacadoComMarcadores(arranjo, meio, "Tentativa.", Color.YELLOW, marcadores);
//             if (arranjo[meio] > chave){
//                 indiceSup = meio - 1;
//             } else if (arranjo[meio] < chave) {
//                 indiceInf = meio + 1;
//             } else {
//                 indiceInf = meio;
//                 break;
//             }
//         }
//         
//         // Se terminou o loop e o índice é menor que o tamanho do arranjo, grava o destaque do último índice encontrado.
//         if (arranjo[indiceInf] == chave) {
//             anim.gravarIndiceDestacado(arranjo, indiceInf, "Chave encontrada", Color.YELLOW); // Grava um quadro com o novo índice destacado.
//         } else {
//             anim.gravarArranjo(arranjo, "Chave não encontrada"); // Grava o fim dos quadros.
//         }
//         
//         return anim;
//     }
//     
//     private static void trocar(int[] arranjo, int i, int j) {
//         int seguro = arranjo[i];
//         arranjo[i] = arranjo[j];
//         arranjo[j] = seguro;
//     }
}