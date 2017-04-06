

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SequenciadorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SequenciadorTest
{
    public SequenciadorTest() {}
    
    @Before
    public void setUp() {}
    
    /**
     * Testes do método de contar elementos com estrutura de laço de repetição.
     */    
    @Test
    public void testContarElementosUm() {
        assertEquals(1, Sequenciador.contarElementosSequencia(1));
    }
    
    @Test
    public void testContarElementosDois() {
        assertEquals(2, Sequenciador.contarElementosSequencia(2));
    }
    
    @Test
    public void testContarElementosTres() {
        assertEquals(8, Sequenciador.contarElementosSequencia(3));
    }
    
    @Test
    public void testContarElementosSete() {
        assertEquals(17, Sequenciador.contarElementosSequencia(7));
    }
    
    @Test
    public void testContarElementosDez() {
        assertEquals(7, Sequenciador.contarElementosSequencia(10));
    }
    
    @Test
    public void testContarElementosVinte() {
        assertEquals(8, Sequenciador.contarElementosSequencia(20));
    }
    
    @Test
    public void testContarElementosNoventaSete() {
        assertEquals(119, Sequenciador.contarElementosSequencia(97));
    }
    
    
    /**
     * Testes do método de contar elementos somente com recursividade.
     */
    @Test
    public void testContarElementosRecursivoUm() {
        assertEquals(1, Sequenciador.contarElementosSequenciaRecursivo(1));
    }
    
    @Test
    public void testContarElementosRecursivoDois() {
        assertEquals(2, Sequenciador.contarElementosSequenciaRecursivo(2));
    }
    
    @Test
    public void testContarElementosRecursivoTres() {
        assertEquals(8, Sequenciador.contarElementosSequenciaRecursivo(3));
    }
    
    @Test
    public void testContarElementosRecursivoSete() {
        assertEquals(17, Sequenciador.contarElementosSequenciaRecursivo(7));
    }
    
    @Test
    public void testContarElementosRecursivoDez() {
        assertEquals(7, Sequenciador.contarElementosSequenciaRecursivo(10));
    }
    
    @Test
    public void testContarElementosRecursivoVinte() {
        assertEquals(8, Sequenciador.contarElementosSequenciaRecursivo(20));
    }
    
    @Test
    public void testContarElementosRecursivoNoventaSete() {
        assertEquals(119, Sequenciador.contarElementosSequenciaRecursivo(97));
    }
    
    @After
    public void tearDown() {}
}
