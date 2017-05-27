
/**
 * TicTacToe.java
 * http://www3.ntu.edu.sg/home/ehchua/programming/java/J4b_CustomGraphics.html
 * @author 5.3 Example
 * @version 04/17/2017
 */
public class TicTacToe extends javax.swing.JFrame
{
    // Define constants for the various dimensions
    public static final int ROWS = 3;
    public static final int COLS = 3;
    public static final int IMAGE_SIZE = 50;
    public static final int PADDING = 20; // padding from the border
    public static final int CELL_SIZE = IMAGE_SIZE + 2 * PADDING;
    public static final int CANVAS_SIZE = CELL_SIZE * ROWS;

    private DrawCanvas canvas;  // The drawing canvas (an inner class extends JPanel)
    private Random random = new Random(); // for picking images in random

    // Images
    private String imgCrossFilnename = "images/cross.gif";
    private String imgNoughtFileName = "images/nought.gif";

    private Image imgCross;
    private Image imgNought;

    // Constructor to set up the GUI components and event handle
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()) {
            public void run() {
                createAndShowGui();
            }
        }
    }
}
