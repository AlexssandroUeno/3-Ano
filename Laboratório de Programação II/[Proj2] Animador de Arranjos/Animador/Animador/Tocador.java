import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.util.ListIterator;

/**
 * Write a description of class Tocador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tocador extends JPanel
{
    public Tocador(ListIterator<Transparencia> quadrosFilme) {
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        carregarFilme(quadrosFilme);
    }
    public Tocador() {
        this(null);
    }
    
    public void carregarFilme(ListIterator<Transparencia> quadrosFilme) {
        this.quadrosFilme = quadrosFilme;
        this.quadro = null;
        numQuadro = 0;
    }
    
    public void avancarFilme() {
        if (quadrosFilme.hasNext()) {
            quadro = quadrosFilme.next();
            numQuadro++;
        }
    }
    
    public void voltarFilme() {
        if (quadrosFilme.hasPrevious()) {
            quadro = quadrosFilme.previous();
            numQuadro--;
        }
    }
    
    public void rebobinarFilme() {
        while (quadrosFilme.hasPrevious()) {
            quadro = quadrosFilme.previous();
            numQuadro--;
        }
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D pincel = (Graphics2D) g;
        String stringFilme = "O Filme ainda não iniciou";
        int spacingLeftWidth = 60,
            spacebottonLeft = 4;
        
        if (quadro != null) {
            quadro.pintar(pincel, this);
        } else {
            pincel.drawString(stringFilme, getWidth()/2-spacingLeftWidth,getHeight()/2);
            // ESCREVER NO MEIO DA TELA "O Filme ainda não iniciou."
            //throw new UnsupportedOperationException("O aluno ainda não implementou essa funcionalidade.");
        }

        // ESCREVER NO CANTO INFERIOR DIREITO DA TELA "Quadro 'numQuadro'"
        pincel.drawString("Quadro "+numQuadro, getWidth()/2 - (spacingLeftWidth*spacebottonLeft), getHeight()-spacebottonLeft);
        //throw new UnsupportedOperationException("O aluno ainda não implementou essa funcionalidade.");
    }
    
    private int numQuadro = 0;
    private Transparencia quadro = null;
    private ListIterator<Transparencia> quadrosFilme = null;
}
