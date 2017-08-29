
/**
 * Na Inteface Lista aplicamos uma coleção ordenada (que tem uma sequência). O usuáro dessa
 * Inteface poderá manipular com os métodos de manipulação dela.
 *
 * @author José Ricardo  e Gabriel Praxedes
 * @version 20/08/2017
 */
public interface Lista {
    /**
     * No método inserir, inserimos um objeto em uma especifica posição da lista.
     * 
     * @param o Object, objeto que queremos inserir na lista.
     * @param pos int, posição do objeto que iremos inserir.
     */
    int inserir(Object o, int pos);
    
    /**
     * No método remover removemos um objeto em uma determinada posição e o retornamos.
     * 
     * @param pos int, posição do elemento à ser removido.
     * @return Object, objeto à ser removido.
     */
    Object remover(int pos);
    
    /**
     * No méotodo buscar, recebe como argumento um objeto e retorna sua posição.
     * 
     * @param o Object, objecto a ser buscado.
     * @return int, posição do objeto encontrado.
     */
    int buscar(Object o);
    
    /**
     * No método itemEm, recebe como argumento a posição do elemento e retorna
     * o objeto encontrado.
     * 
     * @param pos int, posição do objeto procurado.
     * @return Object, objeto encontrado.
     */
    Object itemEm(int pos);
}
