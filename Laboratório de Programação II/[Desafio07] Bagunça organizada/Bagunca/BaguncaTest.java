

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BaguncaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BaguncaTest
{
    /**
     * Default constructor for test class BaguncaTest
     */
    public BaguncaTest()
    {
    }

    @Test
    public void testeIntegerMinHeapIndiceZero() {
        int[] arr = new int[1];
        
        assertFalse(Bagunca.isIntegerMinHeap(arr));
    }
    
    @Test
    public void testeIntegerMinHeapComUmElem() {
        int[] arr = new int[2];
        
        assertTrue(Bagunca.isIntegerMinHeap(arr));
    }
    
    @Test
    public void testeIntegerMinHeapComDoisElems() {
        int[] arr = {0, -3, 3};
        
        assertTrue(Bagunca.isIntegerMinHeap(arr));
    }
    
    @Test
    public void testeIntegerMinHeapComDoisElemsInvertido() {
        int[] arr = {0, 3, -3};
        
        assertFalse(Bagunca.isIntegerMinHeap(arr));
    }
    
    @Test
    public void testeIntegerMinHeapComTresElems() {
        int[] arr = {0, 0, 2, 1};
        int[] arr2 = {0, 0, 1, 2};
        
        assertTrue(Bagunca.isIntegerMinHeap(arr));
        assertTrue(Bagunca.isIntegerMinHeap(arr2));
    }
    
    @Test
    public void testeIntegerMinHeapComTresElemsInvertido() {
        int[] arr = {0, 1, 2, 0};
        int[] arr2 = {0, 2, 1, 0};
        
        assertFalse(Bagunca.isIntegerMinHeap(arr));
        assertFalse(Bagunca.isIntegerMinHeap(arr2));
    }
    
    @Test
    public void testeIntegerMinHeapComVariosElems() {
        int[] arr = {0, 0, 2, 1, 7, 5, 3, 9, 8, 11, 6};
        int[] arr2 = {0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        assertTrue(Bagunca.isIntegerMinHeap(arr));
        assertTrue(Bagunca.isIntegerMinHeap(arr2));
    }
    
    @Test
    public void testeIntegerMinHeapComVariosElemsEUmErro() {
        int[] arr = {0, 0, 2, 1, 7, 5, 3, 9, 6, 11, 7};
        int[] arr2 = {0, 0, 1, 2, 3, 4, 1, 6, 7, 8, 9};
        
        assertFalse(Bagunca.isIntegerMinHeap(arr));
        assertFalse(Bagunca.isIntegerMinHeap(arr2));
    }
}
