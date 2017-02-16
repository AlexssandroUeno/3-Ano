

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PrincipalTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PrincipalTest
{
    /**
     * Default constructor for test class PrincipalTest
     */
    public PrincipalTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    @Test
    public void fiboDeZero()
    {
        assertEquals(0, Principal.calc(0));
    }
    
    @Test
    public void fiboDeOne()
    {
        assertEquals(1, Principal.calc(1));    
    }
    
    @Test
    public void fiboDeDois()
    {
        assertEquals(1, Principal.calc(2));
    }
    
    @Test
    public void fiboDeTres()
    {
        assertEquals(2, Principal.calc(3));
    }
    
    @Test
    public void fiboDeOito()
    {
        assertEquals(21, Principal.calc(8));
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
