
/**
 * Write a description of class TabelaDispersão here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TabelaDispersao
{
    public TabelaDispersao(int capacidade) {
        tabela = new Object[capacidade];
        qtdeElementos = 0;
    }
    public TabelaDispersao() {
        this(10);
    }
    
    
    /**
     * Insere o objeto na tabela em tempo médio de O(1).
     * 
     * @param o Objeto a ser inserido na tabela.
     */
    public void inserir(Object o) {
        int i = hash(o);
        tabela[i] = o;
        
        qtdeElementos++;
    }
    
    
    /**
     * Remove o objeto da tabela.
     * 
     * @param o Objeto a ser removido.
     * @return Objeto removido ou null, caso não haja objeto a ser removido.
     */
    public Object remover(Object o) {
        int i = hash(o);
        if (o.equals(tabela[i])) {
            o = tabela[i];
            tabela[i] = null;
            qtdeElementos--;
        }
        else {
            o = null;
        }
        
        return o;
    }
    
    
    /**
     * Verifica se o objeto já consta na tabela.
     * 
     * @param o Objeto a ter a presença na tabela verificada.
     * @return Verdadeiro caso esteja na tabela.
     */
    public boolean haElemento(Object o) {
        int i = hash(o);
        return o.equals(tabela[i]);
    }
    
    
    /**
     * Indica quantos elementos estão armazenados na coleção.
     */
    public int quantidadeElementos() {
        return qtdeElementos;
    }
    
    
    /**
     * Método que calcula a dispersão do objeto a ser inserido na tabela
     * 
     * @param o Objeto a ser inserido.
     * @return Valor de dispersão, índice onde será posicionado na tabela. Deve ser sempre >= 0.
     */
    private int hash(Object o) {
        // Máscara binária que garante números inteiros >= 0
        return (o.hashCode() & 0x7fffffff) % tabela.length;
    }
    
    private int qtdeElementos;
    private Object[] tabela;
}
