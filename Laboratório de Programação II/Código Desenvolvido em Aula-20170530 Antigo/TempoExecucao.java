
/**
 * Write a description of class TempoExecucao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TempoExecucao
{
   public static int soma3(int a, int b, int c) {
       int res = a + b;
       res = res + c;
       return res;
   }// Tn = 3;
   
   
   public static int somaTodos(int vals[]) {
       int res = 0;
       for(int i = 0; i< vals.length; i++){
           res = res + vals[i];
       }
       return res;
   }//T(n) = 2 * n + 3
   
   /**
    * Ordena crescentemente o arranjo pelo algoritmo da inserção,
    * in-place.
    * @param arr arranjo de inteiros a ser ordenado.
    */
   public static OperacoesOrdenacao insertionsort(Integer[] arr) {
        for (int i = 1; i < arr.length; i++) {     // n
            int seguro = arr[i];                   // n - 2
            int j = i-1;                           // n - 2
            while (j >= 0 && seguro < arr[j]) {    // n - 1
                arr[j+1] = arr[j];                 // n - 2
                j--;                               // n - 2
            }                                       
            arr[j+1] = seguro;                     // n
        }
        
        return medicoes;
   }
   
   // t(n) = 3n^2 +3n + 1 
   // t(n) = 30n + 600  
}
