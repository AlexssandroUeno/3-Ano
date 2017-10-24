
/**
 * Write a description of interface FilaPrioritaria here.
 * 
 * @author Ricardo I. A. e Silva
 * @version 20160923
 */
public interface FilaPrioritaria<E> extends Fila<E>
{
    /**
     * Enfileira um elemento e atribui a ele uma certa prioridade.
     * 
     * @param elem O elemento a ser inserido.
     * @param k A prioridade numérica do elemento. Quanto menor, mais prioritário.
     * @return A prioridade numérica do elemento inserido.
     */
    int enfileirar(E elem, int k);
    
    /**
     * Altera a prioridade do elemento e reestrutura a fila para considerar essa mudança.
     * 
     * @param elem Elemento cuja prioridade será modificada.
     * @param k Valor numérico da nova prioridade. Pode ser menor ou maior que a anterior.
     */
    void alterarPrioridade(E elem, int k) throws ElementoNaoEncontradoException;
}
