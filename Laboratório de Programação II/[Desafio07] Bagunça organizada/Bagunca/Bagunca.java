
/**
 * Bagunca here.
 *
 * @author thelokys
 * @version 10/17/2017
 */
public class Bagunca
{
    
    
    public static boolean isIntegerMinHeap(int[] arr) {

        
        for(int i = 0; i<arr.length;i++){
            int pai = i/2;
            int child = 2*i+1; 
            if(arr.length == 1)  return false;
            if(pai > arr.length) return false;
            
            return mínimo(i);
        }
        return false;
    }
    
    public static boolean mínimo(int i) {
        int level = ((int)(Math.log(i)/Math.log(2))) + 1;
        if(level % 2 == 0) {
            return false;
        }
        return true;
    }
    
    public static boolean isIntegerMaxHeap(int[] arr) {
        return false;
    }
    
    public static boolean isComparableMinHeap(int[] arr) {
        return false;
    }
    
    public static boolean isMinHeap(int[] arr) {
        return false;
    }
    
    // Bagunça é uma classe utilitária, não deve ser instanciada
    private Bagunca() {}
}
