import java.util.Optional;
/**
 * BuscaBinaria.java
 *
 * @author José Ricardo
 * @version 04/06/2017
 */
public class BuscaBinaria
{
    /**
     * Busca iterativa pelo valor chave no arranjo arr, se existir retorna
     * o índice da ocorrência em arr.
     * 
     * @param arr, arranjo onde a chave será buscado.
     * @param chave, elemento procurado no arranjo arr.
     * 
     * @return Índice de chave em arranjo se existir.
     */
    public static Optional<Integer> binarySearh( int chave, int arr[] )
    {
        int  inferior = 0; int superior = arr.length;
        while( inferior <= superior )
        {
            int meio = (inferior + superior)/2;
            if( arr[meio] == chave )  
            {
                return Optional.of(meio);
            } else if( arr[meio] < chave ) 
            {
                inferior = meio + 1;   
            } else {
                superior = meio - 1;
            }
        }    
        return Optional.empty();
    }

    public static Optional<Integer> recursive_binarySearch(int arr[], int chave) 
    {
        return binary(arr, chave, 0, arr.length-1);
    }
    
    private static Optional<Integer> binary(int arr[], int chave, int menor, int maior ) 
    {
        //Teste se o arranjo arr está vazio
        if( maior < menor ) return Optional.empty();
        else
        {
            // calcula o ponto do meio
            int meio = ( maior+menor )/2;
            if( arr[meio] > chave ) 
            { // a chave está no subconjunto inferior
                return binary( arr, chave, menor, meio-1 );     
            } else if( arr[meio] < chave ) 
            { // a chave está no subconjunto superior
                return binary( arr, chave, meio+1, maior ); 
            } else 
            { 
                return Optional.of( meio ); 
            }
        }
    }
} 
