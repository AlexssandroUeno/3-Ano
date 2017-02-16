import java.util.Arrays;
public class Principal
{

    // 1 - DONE
    public static long calc (int x) 
    {
        if(x < 2)
        {
            return x;
        } else {
            return calc(x-1) + calc(x-2);
        }
    }

    // 2 - PRAXGOD DONE
    //B
    /**
     * Ordena o vetor passado no parâmetro e depois soma o segundo e o terceiro maior do vetor
     */
    public static int somaDoisTres(int[] vetor){
        Arrays.sort(vetor);        
        return vetor[vetor.length - 2] + vetor[vetor.length - 3];
    }

    //A
    public static int somatorio(int[] vetor){
        int resultado = 0;
        for(int i = 0; i < vetor.length; i++){
            resultado += vetor[i];
        }
        return resultado;
    }
    
    // 3-DONE
    public static String getFirstAparicao(String s, char c)
    {      
        int i = s.indexOf(c)+1;
        return s.substring(i);
    }

    public static String getLastAparicao(String s, char c)
    {
        int lastAparicao = s.lastIndexOf(c)+1;
        String resp = s.substring(lastAparicao);
        return resp;
    }

    public static String getBetweenAparicao(String s, char c)
    {    
        int firstAparicao = s.indexOf(c)+1;
        int lastAparicao = s.lastIndexOf(c);

        return s.substring(firstAparicao, lastAparicao);
    }

    // 4 - DONE
    public static String findPal(String p)
    { 
        String ehPal = "Eh palindrome";
        String naoEh = "Nao Eh Palindrome";
        char word[] = p.toCharArray();
        int aux1 = 0, aux2 = word.length-1;
        while(aux2 > aux1)
        {
            if(word[aux1] == ' ')aux1++;
            if(word[aux2] == ' ')aux2--;
            if(word[aux1] != word[aux2])return naoEh;
            ++aux1;
            --aux2;
        }
        return ehPal;
    }

    public static String findPalEmptySpaces(String p)
    {
        return findPal(p);
    }

    // 5 DONE
    public static void findPalInArr(String arr[])
    {
        int len = arr.length;
        int i = 0;
        String resp = "";
        while(i < len)      
        {
            resp += arr[i]+" -> "+findPal(arr[i])+"\n";
            i++;
        }
        System.out.println(resp);
    }
    
    public static void findPalTenthousand() 
    {
        int TenThousand = 10001;
        int i = 2;
        String resp = "";
        while(i < TenThousand)
        {
            String ans = findPal(String.valueOf(i));
            int tamanhoDaRespostaDoPal = 17;
            if(ans.length() < tamanhoDaRespostaDoPal) 
            {
                System.out.println(i+" -> "+findPal(String.valueOf(i)));
            }
            i += 2;
        }
    }
    
}
