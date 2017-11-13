import java.util.*;
public class xor
{
    
    public static void main(String args[]){
       Scanner s = new Scanner(System.in);
       System.out.println("Digite n de bits e a distância desejada(ou chame o metodo, xoxo):");
       int n = s.nextInt();
       int d = s.nextInt();
       xor x = new xor();
       x.exerc(n,d);
    }
    
    public void exerc(int n, int d){
        int[] values = {0,1,3,7,15,31,63};
        int maxvalue = values[n];
        for(int i = 0; i <= maxvalue; i++){
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            for(int j = 0; j <= maxvalue; j++){
                //tonbinarystring ( Integer)
                if(count(dist(i,j))==d)
                    numbers.add(j);
            }
            //System.out.println(numbers.toString());
            System.out.print(Integer.toBinaryString(i)+" : ");
            show(numbers);
        }
        
    }
    
    public int dist(int n, int m){
        return n^m;
    } 
    
    public int count(int n){
        String rep = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0; i < rep.length();i++){
            if(rep.charAt(i) == '1')count++;
        }
        return count;
    }
    public void show(ArrayList<Integer> x){
        for(Integer n : x){
            System.out.print(Integer.toBinaryString(n)+" , ");
        }
        System.out.println();
    }
}
