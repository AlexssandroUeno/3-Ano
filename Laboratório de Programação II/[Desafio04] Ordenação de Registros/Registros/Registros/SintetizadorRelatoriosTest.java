import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * The test class SintetizadorRelatoriosTest.
 *
 * @author  Ricardo I. A. e Silva
 * @version 201706061743
 */
public class SintetizadorRelatoriosTest
{
    private static final Colaborador c1 = new Colaborador("Roberto", 27);
    private static final Colaborador c2 = new Colaborador("Guilherme", 19);
    private static final Colaborador c3 = new Colaborador("Robson", 21, 600);
    private static final Colaborador c4 = new Colaborador("Hugo", 25, 1700);
    private static final Colaborador c5 = new Colaborador("Thiago", 20, 1200);
    private static final Colaborador c6 = new Colaborador("José", 23, 1400);
    
    private static final Colaborador[] t1 = { c6 };
    private static final Colaborador[] r1 = { c6 };
    
    private static final Colaborador[] t2 = { c1 };
    private static final Colaborador[] r2 = { c1 };
    
    private static final Colaborador[] t3 =  { c6, c4 };
    private static final Colaborador[] t4 =  { c4, c6 };
    private static final Colaborador[] r34 = { c6, c4 };
    
    private static final Colaborador[] t5 =  { c3, c2 };
    private static final Colaborador[] t6 =  { c2, c3 };
    private static final Colaborador[] r56 = { c2, c3 };
    
    private static final Colaborador[] t7 =  { c1,c2,c3,c4,c5,c6 };
    private static final Colaborador[] t8 =  { c6,c5,c4,c3,c1,c2 };
    private static final Colaborador[] r78 = { c1,c2,c3,c5,c6,c4 };
    
    private Colaborador[] copia;
    
    @Test
    public void testeOrdenarPorSalarioUmColaborador() {
        copia = Arrays.copyOf(t1, t1.length);
        SintetizadorRelatorios.ordenarPorSalario(copia);
        assertArrayEquals(r1, copia);
    }
    
    @Test
    public void testeOrdenarPorSalarioUmColaboradorSemSalario() {
        copia = Arrays.copyOf(t2, t2.length);
        SintetizadorRelatorios.ordenarPorSalario(copia);
        assertArrayEquals(r2, copia);
    }
    
    @Test
    public void testeOrdenarPorSalarioDoisColaboradores() {
        copia = Arrays.copyOf(t3, t3.length);
        SintetizadorRelatorios.ordenarPorSalario(copia);
        assertArrayEquals(r34, copia);
    }
    
    @Test
    public void testeOrdenarPorSalarioDoisColaboradoresInvertidos() {
        copia = Arrays.copyOf(t4, t4.length);
        SintetizadorRelatorios.ordenarPorSalario(copia);
        assertArrayEquals(r34, copia);
    }
    
    @Test
    public void testeOrdenarPorSalarioDoisColaboradoresUmVoluntario() {
        copia = Arrays.copyOf(t5, t5.length);
        SintetizadorRelatorios.ordenarPorSalario(copia);
        assertArrayEquals(r56, copia);
    }
    
    @Test
    public void testeOrdenarPorSalarioDoisColaboradoresUmVoluntarioInvertidos() {
        copia = Arrays.copyOf(t6, t6.length);
        SintetizadorRelatorios.ordenarPorSalario(copia);
        assertArrayEquals(r56, copia);
    }
    
    @Test
    public void testeOrdenarPorSalarioVariosColaboradores() {
        copia = Arrays.copyOf(t7, t7.length);
        SintetizadorRelatorios.ordenarPorSalario(copia);
        assertArrayEquals(r78, copia);
    }
    
    @Test
    public void testeOrdenarPorSalarioVariosColaboradoresInvertidos() {
        copia = Arrays.copyOf(t8, t8.length);
        SintetizadorRelatorios.ordenarPorSalario(copia);
        assertArrayEquals(r78, copia);
    }
    
    /**
     * Default constructor for test class SintetizadorRelatoriosTest
     */
    public SintetizadorRelatoriosTest() { }
}
