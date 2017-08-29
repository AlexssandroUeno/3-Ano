import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.awt.Color;

/**
 * Gravador.java
 * Classe Gravador que fornece manipulação para pintar os arranjos.
 *
 * @author José Ricardo
 * @version 21/08/2017
 */
public class Gravador
{
    //Construtor padrão para incializar uma lista.
    public Gravador() {
        this.seqGravacoes = new LinkedList<Transparencia>();
    }

        
    /**
     * O gravarArranjo, Aqui no arranjo é mostrado na tela
     * 
     * @param arranjo, arranjo de inteiros
     * @param nome, nome do arranjo que será aplicado.
     */
    public void gravarArranjo(int[] arranjo, String nome) {
        int[] copia = Arrays.copyOf(arranjo, arranjo.length);
        Color[] cores = new Color[arranjo.length];
        ArranjoGravado gravacao = new ArranjoGravado(copia, cores, nome);
        seqGravacoes.add(gravacao);
    }
  
    /**
     * O gravarIndiceDestacado, aqui nos adicionamos cor ao elemento forncido por argumento.
     * 
     * @param arranjo, Arranjo de inteiro.
     * @param i, indice do arranjo a ser pintado de amarelo.
     * @param nome, um nome dado ao arranjo a ser destacado.
     */
    public void gravarIndiceDestacado(int[] arranjo, int i, String nome) {
        int[] copia = Arrays.copyOf(arranjo, arranjo.length);
        Color[] cores = new Color[arranjo.length];
        cores[i] = Color.YELLOW;
        ArranjoGravado gravacao = new ArranjoGravado(copia, cores, nome);
        seqGravacoes.add(gravacao);
    }

    /**
     * O gravarComparaçãoSimples, aqui iremos pintar dos indice que estão no arranjo, pintado eles de cinza,
     * suas referencias são passados na assinatura desse método.
     * 
     * @param arranjo, arranjo de inteiro.
     * @param i, indice que será aplicado no arranjo para pintar de cinza
     * @param j, Indice do arranjo que será pintado de cinza.
     */
    public void gravarComparacaoSimples(int[] arranjo, int i, int j) {
        int[] copia = Arrays.copyOf(arranjo, arranjo.length);
        Color[] cores = new Color[arranjo.length];
        cores[i] = cores[j] = Color.GRAY;
        ArranjoGravado gravacao = new ArranjoGravado(copia, cores, "Comparação");
        seqGravacoes.add(gravacao);
    }

     /**
     * O gravarPosTrocas, aqui é adicionado core aos elementos do arranjo que foram comparados.
     * 
     * @param arranjo, arranjo de inteiro à ser pintado pelos indices fornecidos.
     * @param i, indice fornecidor para pintar no arranjo. 
     * @param j, indice do arranjo que será pintado.
     */
    public void gravarPosTrocas(int[] arranjo, int i, int j) {
        int[] copia = Arrays.copyOf(arranjo, arranjo.length);
        Color[] cores = new Color[arranjo.length];
        cores[i] = cores[j] = Color.YELLOW;
        ArranjoGravado gravacao = new ArranjoGravado(copia, cores, "Pós-troca");
        seqGravacoes.add(gravacao);
    }
    
     /**
     * O método gravarBuscaBinaria, pinta o arranjo do inicio e do fim
     * 
     * @param arranjo, referencia do arrnajo à ser pintado
     * @param inicio, indice do arrajo à ser pintado
     * @param fim, indice à ser pintado no arranjo 
     */
    public void gravarBuscaBinaria(int[]arranjo, int inicio, int fim){
        int[] copia = Arrays.copyOf(arranjo, arranjo.length);
        Color[] cores = new Color[arranjo.length];
        cores[inicio] = Color.RED;
        cores[fim] = Color.BLACK;  
        ArranjoGravado gravacao = new ArranjoGravado(copia, cores, "Início e fim");
        seqGravacoes.add(gravacao);
    }
  
     /**
     * O gravarComparacao, aqui é adicionado cores a 3 elementos do arranjo passado por argumento
     * 
     * @param arranjo, referencia do arranjo de inteiros.
     * @param i, índice à ser pintado.
     * @param j, índice à ser pintado.
     * @param k, índice à ser pintado.
     */
    public void gravarComparacao(int[]arranjo, int i, int j, int k){
        int[] copia = Arrays.copyOf(arranjo, arranjo.length);
        Color[] cores = new Color[arranjo.length];
        cores[i] = cores[j] = Color.GRAY; 
        cores[k] = Color.RED;
        ArranjoGravado gravacao = new ArranjoGravado(copia, cores, "Comparação");
        seqGravacoes.add(gravacao);
    }
    
    
    
    /**
     * O método getFilme cria uma lista de inteiro importada da classe Transparencia.
     * 
     * @return ListIterator, Returna uma lista de inteiros.
     */
    public ListIterator<Transparencia> getFilme() {
        return seqGravacoes.listIterator();
    }
    
    //variável que referencia a classe Transparencia
    private LinkedList<Transparencia> seqGravacoes;
}
