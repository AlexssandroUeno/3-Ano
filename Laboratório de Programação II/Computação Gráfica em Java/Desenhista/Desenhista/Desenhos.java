import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Color;
/**
 * Write a description of class Desenhos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Desenhos
{
    public static void desenhoLivre(Graphics2D pincel, Dimension dim) {
        pincel.drawRect(200, 200,300, 300);
        
        //x1, y1, x2, y2
        pincel.drawLine(500, 500, 200, 200);
        pincel.drawLine(200, 500, 500, 200);
        pincel.setStroke(new java.awt.BasicStroke(5));
        pincel.drawString("JOSE RICARDO", 200, 200 );
        pincel.setColor(Color.BLUE);
        pincel.drawOval(350,2,100,100);
    }
    
    public static void desenharAsterisco(Graphics2D g2d) {
        throw new UnsupportedOperationException("O aluno ainda não implementou este método.");
    }
    
    
    
}
