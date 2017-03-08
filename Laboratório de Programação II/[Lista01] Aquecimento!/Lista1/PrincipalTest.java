

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
    
    /**
     * Testes para o primeiro exercício
     */
    @Test
    public void testeFibCasosBase() {
        assertEquals(0, Principal.fibonacci(0));
        assertEquals(1, Principal.fibonacci(1));
    }
    @Test
    public void testeFibUmaIteracao() {
        assertEquals(1, Principal.fibonacci(2));
    }    
    @Test
    public void testeFibDuasIteracoes() {
        assertEquals(2, Principal.fibonacci(3));
    }    
    @Test
    public void testeFibVariasIteracoes() {
        assertEquals(144, Principal.fibonacci(12));
    }
    
    
    /**
     * Testes para o segundo exercicio, letras a e b.
     */
    @Test
    public void testeSomatorioUmValor() {
        int[] vals = { 1 };
        assertEquals(1, Principal.somatorio(vals));
    }    
    @Test
    public void testeSomatorioVariosNegativo() {
        int[] vals = { 1, 3, -4, 2, -5 };
        assertEquals(-3, Principal.somatorio(vals));
    }    
    @Test
    public void testeSomatorioDoisZero() {
        int[] vals = { 2, 4, -4, 3, -5 };
        assertEquals(0, Principal.somatorio(vals));
    }    
    
    @Test
    public void testeSegundoTerceiroSomenteTrês() {
        int[] vals = { 2, 4, 1 };
        assertEquals(3, Principal.segundoTerceiro(vals));
    }    
    @Test
    public void testeSegundoTerceiroOrdenado() {
        int[] vals = { 1,2,3,4,5,6 };
        assertEquals(9, Principal.segundoTerceiro(vals));
    }    
    @Test
    public void testeSegundoTerceiroOrdenadoReversoNegativo() {
        int[] vals = { -1,-2,-3,-4,-5,-6 };
        assertEquals(-5, Principal.segundoTerceiro(vals));
    }
    
    
    /**
     * Teste para os exercicios de secção de strings
     */
    @Test
    public void testeSeccaoPrimeiroFimSemDelimitador() {
        assertEquals("abcabc", Principal.dePrimeiroDelimAoFim("abcabc",','));
    }
    @Test
    public void testeSeccaoPrimeiroFimDelimitadorInicio() {
        assertEquals("bcabc", Principal.dePrimeiroDelimAoFim("abcabc",'a'));
    }
    @Test
    public void testeSeccaoPrimeiroFimDelimitadorFim() {
        assertEquals("", Principal.dePrimeiroDelimAoFim("abcdef",'f'));
    }
    @Test
    public void testeSeccaoPrimeiroFimDelimitadorMeio() {
        assertEquals("abc", Principal.dePrimeiroDelimAoFim("abcabc",'c'));
    }
    
    @Test
    public void testeSeccaoUltimoFimSemDelimitador() {
        assertEquals("abcabc", Principal.deUltimoDelimAoFim("abcabc",','));
    }
    @Test
    public void testeSeccaoUltimoFimDelimitadorInicio() {
        assertEquals("bcdef", Principal.deUltimoDelimAoFim("abcdef",'a'));
    }
    @Test
    public void testeSeccaoUltimoFimDelimitadorFim() {
        assertEquals("", Principal.deUltimoDelimAoFim("abcabc",'c'));
    }
    @Test
    public void testeSeccaoUltimoFimDelimitadorMeio() {
        assertEquals("bc", Principal.deUltimoDelimAoFim("abcabc",'a'));
    }
    
    @Test
    public void testeSeccaoEntreSemDelimitador() {
        assertEquals("abcabc", Principal.entreDelims("abcabc",','));
    }
    @Test
    public void testeSeccaoEntreDelimitadorInicio() {
        assertEquals("bcdef", Principal.entreDelims("abcdef",'a'));
    }
    @Test
    public void testeSeccaoEntreDelimitadorFim() {
        assertEquals("", Principal.entreDelims("abcdef",'f'));
    }
    @Test
    public void testeSeccaoEntreDelimitadorMeio() {
        assertEquals("bc", Principal.entreDelims("abcabcd",'a'));
    }
    
    
    /**
     * Testes para os exercicios de palindromos
     */
    @Test
    public void testeIsPalindromoUmChar() {
        assertTrue("Um caractere é sempre palindromo.", Principal.isPalindromo("a"));
    }
    @Test
    public void testeIsPalindromoDoisChars() {
        assertTrue("Dois caracteres iguais sempre palindromo.", Principal.isPalindromo("aa"));
    }
    @Test
    public void testeIsPalindromoImparChars() {
        assertTrue(Principal.isPalindromo("omississimo"));
    }
    @Test
    public void testeIsPalindromoParCharsNegativo() {
        assertFalse(Principal.isPalindromo("omissicimo"));
    }
    @Test
    public void testeIsPalindromoImparCharsNegativo() {
        assertFalse(Principal.isPalindromo("omississima"));
    }
    @Test
    public void testeIsPalindromoEspacoEmBrancoNegativo() {
        assertFalse(Principal.isPalindromo("ROMA ME TEM AMOR"));
    }
    @Test
    public void testeIsPalindromoEspacoEmBrancoPositivo() {
        assertTrue(Principal.isPalindromo("ROMA E AMOR"));
    }
    
    @Test
    public void testeIsPalindromoSemEspacoUmChar() {
        assertTrue("Um caractere é sempre palindromo.", Principal.isPalindromoSemEspaco("a"));
    }
    @Test
    public void testeIsPalindromoSemEspacoDoisChars() {
        assertTrue("Dois caracteres iguais sempre palindromo.", Principal.isPalindromoSemEspaco("aa"));
    }
    @Test
    public void testeIsPalindromoSemEspacoImparChars() {
        assertTrue(Principal.isPalindromoSemEspaco("omississimo"));
    }
    @Test
    public void testeIsPalindromoSemEspacoParCharsNegativo() {
        assertFalse(Principal.isPalindromoSemEspaco("omissicimo"));
    }
    @Test
    public void testeIsPalindromoSemEspacoImparCharsNegativo() {
        assertFalse(Principal.isPalindromoSemEspaco("omississima"));
    }
    @Test
    public void testeIsPalindromoSemEspacoEspacoEmBrancoNegativo() {
        assertTrue(Principal.isPalindromoSemEspaco("ROMA ME TEM AMOR"));
    }
    @Test
    public void testeIsPalindromoSemEspacoEspacoEmBrancoPositivo() {
        assertTrue(Principal.isPalindromoSemEspaco("ROMA E AMOR"));
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
