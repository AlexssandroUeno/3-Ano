import java.util.ArrayList;
import java.util.List;
/**
 * Essa classe abriga os métodos relacionados a geração e contagem de elementos da sequência dadas
 * pelas seguintes regras: (1) se o valor for divisível por 2, ele é dividido e o novo valor é
 * registrado; (2) senão, o valor é multiplicado por 3 e incrementado em 1, e esse novo valor é
 * registrado; (3) A sequência termina quando valor for menor que 2.
 * 
 * Como exemplo, suponha gerarmos a sequência partindo do valor 10:
 *  - registramos 10, que é divisível por 2, logo temos 5
 *  - registramos 5, que não é divisível por 2, logo 5*3+1 -> 16
 *  - registramos 16 e vamos a 8
 *  - registramos 8 e vamos a 4
 *  - registramos 4 e vamos a 2
 *  - registramos 2 e vamos a 1
 *  - registramos 1 e terminamos
 * 
 * Logo, a sequência resultante é (10, 5, 16, 8, 4, 2, 1), eprecisou de 7 iterações para terminar.
 */
public class Sequenciador
{
    /**
     * Este método calcula os elementos da sequência e os concatena em uma string, separados por
     * ',' (vírgula), que é retornada ao final do processo de cálculo.
     * @param inicial valor inicial para geração da sequência de elementos seguindo as regras.
     * @return uma string com os elementos da sequência e   m ordem cálculo, separados por vírgulas.
     */
    public static String escreverElementosSequencia(int inicial) {
        throw new RuntimeException("Remova essa declaração e imeplemente o método");
    }
    
    /**
     * Este método calcula os elementos da sequência e retorna a quantidade de elementos existentes
     * até atingir o valor mínimo.
     * @param inicial valor inicial para geração da sequência de elementos seguindo as regras.
     * @return contagem de elementos nessa sequência.
     */
    public static int contarElementosSequencia(int inicial) {
        List l = new ArrayList();
        l.add(inicial);
        while(inicial > 1)
        {
            if(inicial % 2 == 0)
            {
                inicial = inicial / 2;
            }else{
                inicial = inicial * 3 + 1;
            }
            l.add(inicial);
        }
        return l.size();
    }
    
    /**
     * Este método calcula os elementos da sequência e os concatena em uma string, separados por
     * ',' (vírgula), que é retornada ao final do processo de cálculo.
     * @param inicial valor inicial para geração da sequência de elementos seguindo as regras.
     * @return uma string com os elementos da sequência em ordem cálculo, separados por vírgulas.
     */
    public static String escreverElementosSequenciaRecursivo(int inicial) {
        throw new RuntimeException("Remova essa declaração e imeplemente o método, sem usar" +
            "estruturas de laço.");
    }
    
    /**
     * Este método calcula os elementos da sequência e retorna a quantidade de elementos existentes
     * até atingir o valor mínimo.
     * @param inicial valor inicial para geração da sequência de elementos seguindo as regras.
     * @return contagem de elementos nessa sequência.
     */
    public static int contarElementosSequenciaRecursivo(int inicial) {
        return contarElementosSequenciaRecursivoAuxiliar(inicial, 0);
    }
    
    private static int contarElementosSequenciaRecursivoAuxiliar(int inicial, int contador) {
        if(inicial > 1)
        {
            if(inicial % 2 == 0)
            {
                inicial = inicial / 2;
                return contarElementosSequenciaRecursivoAuxiliar(inicial, contador+1);
            }else{
                inicial = inicial * 3 + 1;
                return contarElementosSequenciaRecursivoAuxiliar(inicial,contador+1);
            }
        }
        return contador+1;
    }
    
    /**
     * Essa classe não gera objetos, apenas abriga métodos globais
     */
    private Sequenciador() {}
}
