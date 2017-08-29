import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Color;
import java.util.Arrays;
import java.awt.*;

/**
 * Write a description of class ArranjoGravado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArranjoGravado implements Transparencia
{
    
        // Constantes importantes
    final int TAMANHO_MARGEM_TXT = 10;
    final int TAMANHO_LINHA_TXT = 15;
    
    //Constantes dos Retangulos
    final int RECT_HEIGHT   = 300;
    final int RECT_WIDTH    = 72 ;
    final int RECT_BORDER   = 20 ;
    final int RECT_AWAY     = 50 ;
    final int STRING_POS_Y  = 420;
    
    private int[] arranjo;
    private Color[] corIdxs;
    private String nome;

    /**
     * Constructor for objects of class ArranjoGravado
     */
    public ArranjoGravado(int[] arranjo, Color[] corIdxs, String nome) {
        this.arranjo = arranjo;
        this.nome = nome;
        this.corIdxs = corIdxs;
    }
    
    
    public void pintar(Graphics2D pincel, JPanel contexto) {
        Dimension dim = contexto.getSize();

        int length = arranjo.length;
        int maiorEle = maiorElem(arranjo);

        for(int posI = 0; posI < length; posI += 1)
        {
            
            Rectangle rect_graph = getRect(posI, arranjo, maiorEle);

            if(corIdxs[posI] == null){
                 pincel.setColor(Color.CYAN);
            }else{
                 pincel.setColor(corIdxs[posI]);
            }   
             pincel.fill(rect_graph);
             pincel.setColor(Color.BLACK);
             pincel.draw(rect_graph);

             String valueElem = ""+arranjo[posI];
             pincel.drawString(valueElem, RECT_AWAY+(RECT_WIDTH*posI)+(RECT_AWAY*posI), STRING_POS_Y);
        }

    }

     /**
      * 
      *
      *   final int RECT_HEIGHT   = 300;
      *   final int RECT_WIDTH    = 72 ;
      *   final int RECT_BORDER   = 20 ;
      *   final int RECT_AWAY     = 50 ;
      */
     public Rectangle getRect(int i, int[] arr, int maiorElem)
     {
        int altura  = ( RECT_HEIGHT * arr[i] ) / maiorElem; 
        int largura = RECT_WIDTH;
        int x       = RECT_BORDER + ( RECT_WIDTH*i ) + ( RECT_AWAY*i );
        int y       = RECT_HEIGHT - altura + ( RECT_AWAY * 2 );

         return new Rectangle(x,y,largura,altura);
     }
    

        
    /**
     * Este método encontra o maior elemento de um arranjo de entrada.
     * 
     * @param arranjo Arranjo a ser procurado pelo seu maior elemento.
     * @return Valor do maior elemento.
     */
    private static int maiorElem(int[] arranjo) {
        int arr[] = arranjo.clone();
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

}
