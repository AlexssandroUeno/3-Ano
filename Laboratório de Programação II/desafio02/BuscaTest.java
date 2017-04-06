

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Optional;
/**
 * The test class BuscaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BuscaTest
{
    static final int[] arrUnitario = { 0 };
    static final int[] arrDuploOrdenado = { 0, 1};
    static final int[] arrDuploReverso  = { 1, 0 };
    static final int[] arrOrdenado = {0,1,2,3,4,5,6,7,8,9};
    static final int[] arrDesordenado = {3,7,9,1,5,4,2,7,0,6};

    @Test
    public void testBuscaArrUnitarioChaveExistente()
    {   
        Optional<Integer> talvezInt = Busca.buscas(arrUnitario, 0);
        assertFalse(talvezInt.isPresent());
    }
    
    @Test
    public void testBuscaArrDuploOrdenadoChaveExistente()
    {   
        assertEquals();
    }
    
    @Test
    public void testBuscaArrDuploReversoChaveExistente()
    {   
        assertEquals();
    }
    
    @Test
    public void testBuscaArrOrdenadoChaveExistente()
    {   
        assertEquals();
    }
    
    @Test
    public void testBuscaArrReversoChaveExistente()
    {   
        assertEquals();
    }
    
    
    
}
