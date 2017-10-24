
/**
 * Bagunca here.
 *
 * @author thelokys
 * @version 10/17/2017
 */
public class Bagunca
{
    
    
    public static boolean isIntegerMinHeap(int[] arr) {  
        int len = arr.length; // len  = 3 {0, -3, 3};
        for(int i = 1; i<len; i++){
            int right = 2*i+1;//right = 3
            int left = 2*i;//   left  = 2
            if(right <= len && arr[i] > arr[right]) return true;
            if(left <= len && arr[i] > arr[left]) return true;
        }
        return false;
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
