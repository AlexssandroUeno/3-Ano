
/**
 * A interface Pilha representa uma pilha de LIFO(Last-in-first-out) que armazena Objects.
 *
 * @author José Ricardo  e Gabriel Praxedes
 * @version 20/08/2017
 */
public interface Pilha {
    /**
     * O método empilhar recebe como argumento um Objeto para ser inserido no topo da pilha
     * 
     * @param o Object, objeto à ser inserido no topo da pilha.
     */
    void empilhar(Object o);
    
    /**
     * O método desempilhar remove o objeto do topo da pilha e retorna  o objeto removido
     * 
     * @return Object, topo da pilha à ser removido.
     */
    Object desempilhar();
    
    /**
     * O método topo retorna o objeto que está no topo da pilha sem remover-lo.
     * 
     * @return Object, o objeto do topo da pilha. 
     */
    Object topo();
}
