
/**
 * Write a description of interface Fila here.
 * 
 * @author Ricardo I. A. e Silva
 * @version 20160923
 */
public interface Fila<E>
{
    /**
     * Enfileira o elemento no final da fila.
     * 
     * @param elem O elemento a ser enfileirado.
     * @return A 'senha' recebida pelo elemento, tipicamente o número de atendimento
     *      desde que a Fila foi criada.
     */
    int enfileirar(E elem);
    
    /**
     * O elemento proximo a ser desenfileirado, mas sem removê-lo da fila.
     * 
     * @return O elemento a ser desenfileirado.
     */
    E proximo();
    
    /**
     * Remove o primeiro elemento da fila.
     * 
     * @return O elemento desenfileirado.
     */
    E desenfileirar();
}
