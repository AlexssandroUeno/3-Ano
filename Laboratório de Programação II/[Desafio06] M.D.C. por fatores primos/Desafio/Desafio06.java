
import java.util.*;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
/**
 * Desafio06.java
 * 
 * @author José Ricardo
 * @version 30/08/2017
 */
public class Desafio06 // declaração da classe
{
    /**
     * No metodo isPrime recebe um inteiro como argumento e é verificado se o número 
     * é primo ou não, a regra de número primo implica nas seguintes regras:

     * O número deve ser um inteiro positivo maior que 1 ou
     * Caso o número for maior que 2, 3, 5 ou 7 e NÃO forem divisível por eles o 
     * número é considerado primo, caso contrário do número ser divisível o número é 
     * considerado não primo.
     * 
     * @param int n, número inteiro positivo
     * 
     * @return boolean, boolean de verificação do numero sendo primo (true) ou não(false).
     */
    private static boolean isPrime(int n)
    {   
        if(n<= 1                || // Se o número for Negativo ou 1, o número não é primo
        (n > 2 && n % 2 == 0)   || // Se Número > que 2 e for divisível por 2, o número não é primo
        (n > 3 && n % 3 == 0)   || // Se Número > que 3 e for divisível por 3, o número não é primo
        (n > 5 && n % 5 == 0)   || // Se Número > que 5 e for divisível por 5, o número não é primo
        (n > 7 && n % 7 == 0)      // Se Número > que 7 e for divisível por 7, o número não é primo
        ) return false; 
        return true; // se chegar até aqui é primo
    }
    
    /**
     * [20 pontos] Um método que recebe um número inteiro n como parâmetro e retorna o
     * primeiro número primo p tal que p > n. Por exemplo, se n = 3 então p será 5, e se n = 14
     * então p será 17.
     * 
     * @param int n, número inteiro
     * @return int, retorna o próximo número inteiro
     */
    public static int metodoA(int n) {
        if(isPrime(++n)) {
            return n;
        }else{
            return metodoA(n);
        }
    }
    
    /**
     * [20 pontos] Um método que recebe um número inteiro como parâmetro e retorna uma
     * lista de inteiros com seus fatores primos decompostos. Como exemplo, se a entrada for o
     * número 36, o método retorna uma lista contendo [2, 2, 3, 3].
     * 
     */
    public static List<Integer> metodoB(int n) {
        List<Integer> fatoracao = new ArrayList();
        int div = 2;
        while(n != 1) {
            if(n % div == 0) {
                n = n / div;
                fatoracao.add(div);
            } else {
              div = metodoA(div);  
            }
        }
        return fatoracao;
    }
    
    /**
     * [20 pontos] Um método que recebe duas listas de valores inteiros como parâmetro e re-
     * torna uma nova lista contendo apenas os elementos comuns às duas listas entradas. Para
     * exemplificar, em uma chamada de método em que a primeira lista contém [1, 2, 2, 3]
     * e a segunda lista contém [0, 2, 2, 3, 3, 4], a lista retornada conterá [2, 2, 3].
     *  [1, 2, 2, 3]
     *  [0, 2, 2, 3, 3, 4]
     *  [2, 2, 3]
     *  Big-O, 
     *  Ω, 
     *  Θ,
     */
    public static List<Integer> metodoC(List<Integer> A, List<Integer> B) {
        return A.stream().filter(B::contains).collect(toList());
                                        // retorna uma coleção, 
                                        // passando o filtragem da lista B dentro da lista A
    }
}
