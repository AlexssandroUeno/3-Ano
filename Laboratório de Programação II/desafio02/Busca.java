import java.util.Optional;
/**
 * Algoritmos de busca escrito em sala de aula
 */
public class Busca
{
    /**
     * Busca pelo valor chave no arranjo arr, se existir 
     * retorna o índice da ocorrência de chave em arr.
     * 
     * @param arr arranjo onde chave será buscado.
     * @param chave
     * @return índice de chave em arr se existir.
     */
    public static Optional<Integer> buscas(int[] arr, int chave)
    {
        for(int i = 0; i < arr.length; i+=1)
        {
            if(arr[i] == chave) 
            {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
    
     /**
     * Busca pelo valor chave no arranjo arr, se existir 
     * retorna o índice da ocorrência de chave em arr.
     * 
     * @param arr arranjo onde chave será buscado. PRECOND: estar ordenado
     * @param chave
     * @return índice de chave em arr se existir.
     */
    public static Optional<Integer> buscaBinario(int[] arr, int chave)
    {
       int l = 0; int r = arr.length;
       while(r - l > 1)
       {
           int meio = (r-l)/2;
           if(arr[meio] == chave) 
           {
               return meio;
           } else if(arr[meio] < chave)  {
               r = meio;
           } else {
               l = meio + 1;
           }
           
           
       }
       return Optional.empty();
    }
}
