/**
 * Principal.java, classe com as respostas da "lista1.pdf"
 * 
 * @author Gabriel Praxedes, José Ricardo
 * @version 07032017
 */
public class Principal
{
    /**
     * Calcula o n-esimo valor da sequencia de fibonacci.
     * 
     * @param n     numero do elemento da sequencia. Obrigatoriamente
     *              deve ser maior que 0. (n > 0)
     * 
     * @return      valor do n-esimo elemento.
     */
    public static int fibonacci(int n) {
        if(n < 2)return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
    
    /**
     * Metodo somatorio.
     * 
     * @param 
     * 
     * @return
     */
    public static int somatorio(int[] vals) {
        int ans = 0, i, len = vals.length;
        for(i = 0;i < len; i +=1) ans += vals[i];
        return ans;
    }
    
    /**
     * Metodo segundoTerceiro.
     * 
     * @param
     * 
     * @return
     */
    public static int segundoTerceiro(int[] vals) {
        java.util.Arrays.sort(vals);
        return vals[vals.length - 2] + vals[vals.length - 3];
    }
    
    /**
     * Metodo dePrimeiroDelimAoFim.
     * 
     * @param
     * 
     * @return
     */
    public static String dePrimeiroDelimAoFim(String str, char delim) {
        int firstdelim = str.indexOf(delim) + 1;
        return str.substring(firstdelim);
    }
    
    /**
     * Metodo deUltimoDelimAoFim.
     * 
     * @param
     * 
     * @return
     */
    public static String deUltimoDelimAoFim(String str, char delim) {
        int lastdelim = str.lastIndexOf(delim) + 1;
        return str.substring(lastdelim);
    }
    
    /**
     * Metodo entreDelims.
     * 
     * @param
     * 
     * @return
     */
    public static String entreDelims(String str, char delim) {
        int firstdelim  = str.indexOf(delim) + 1;
        int lastdelim = str.lastIndexOf(delim);
        
        if(lastdelim<0)return str;
        if(lastdelim==0)lastdelim = str.length();
        if(lastdelim < firstdelim) return new String("");
        return str.substring(firstdelim, lastdelim) ;
    }
    
    /**
     * Metodo isPalindromo.
     * 
     * @param
     * 
     * @return
     */
    public static boolean isPalindromo(String str) {
        int n = str.length();
        for(int i = 0; i < n/2; i++) {
            if(str.codePointAt(i) != str.codePointAt(n-i-1))return false;
        }
        return true;
    }
    
    /**
     * Metodo isPalindromoSemEspaco.
     * 
     * @param
     * 
     * @return
     */
    public static boolean isPalindromoSemEspaco(String str) {
        str = str.replaceAll("\\s+", "");// "\\s+" -> espacos em brancos
        return isPalindromo(str);
    }
    
    
}
