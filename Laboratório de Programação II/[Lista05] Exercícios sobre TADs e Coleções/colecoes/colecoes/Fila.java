
/**
 * A Inteface Fila representa um FIFO (First-in-first-out), com métodos que 
 * aplicam e ajudam na sua manipulação.
 *
 * @author José Ricardo  e Gabriel Praxedes
 * @version 20/08/2017
 */
public interface Fila {
    /**
     * No método enfileirar recebe como argumentoum objeto para inserir no final da fila.
     */
    void enfileirar(Object objeto);
    
    /**
     * O método densenfileirar remove o objeto da frente da fila e retorna ele.
     * 
     * @return Object, objeto da cabeça da fila.
     */
    Object desenfileirar();
    
    /**
     * O método primeiro retorna o primeiro(head) elemento da fila, mas não remove.
     * @return Objecto, elemento head da fila.
     */
    Object primeiro();
}
