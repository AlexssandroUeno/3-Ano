
/**
 * Write a description of class Teste here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Teste
{
    public static double mediana(int[]amostra) {
        if(amostra.length % 2 == 0) return amostra.length/2;
        else return amostra.length+1/2;
    }
}
