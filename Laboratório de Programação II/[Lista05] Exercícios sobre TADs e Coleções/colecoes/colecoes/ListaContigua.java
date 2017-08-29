
/**
 * Write a description of class Lista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaContigua implements Lista {
    public ListaContigua(int capacidade) {
        arranjo = new Object[capacidade];
        numElementos = 0;
    }
    public ListaContigua() {
        this(8);
    }
    
    
    public int inserir(Object o, int pos) {
        numElementos++;
        if (numElementos == arranjo.length) {
            expandir();
        }
        
        // Deslocar elementos
        for (int i = numElementos; i > pos; i--) {
            arranjo[i] = arranjo[i-1];
        }
        
        arranjo[pos] = o;
        
        return pos;
    }
    
    
    public Object remover(int pos) {
        Object removido = arranjo[pos];
        
        for (int i = pos; i < numElementos; i++) {
            arranjo[i] = arranjo[i+1];
        }
        numElementos--;
        arranjo[numElementos] = null;
        
        return removido;
    }
    
    
    public int buscar(Object o) {
        throw new UnsupportedOperationException("Ainda não implementado pelo aluno");
    }
    
    
    public Object itemEm(int pos) {
        return arranjo[pos];
    }
    
    
    private void expandir() {
        Object[] expandido = new Object[arranjo.length * 2];
        for (int i = 0; i < arranjo.length; i++) {
            expandido[i] = arranjo[i];
        }
        arranjo = expandido;
    }
    
    
    private Object[] arranjo;
    private int numElementos;
}
