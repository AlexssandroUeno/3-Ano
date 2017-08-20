
/**
 * Exercício2.java
 * 
 * @author José Ricardo  e Gabriel Praxedes
 * @version 20/08/2017
 */
public class Exercício2
{
    public static void main(String[]args)
    {
        PilhaContigua pilha = new PilhaContigua(); 
        int i = 11;
        System.out.println("[LIFO]");
        System.out.println("\n.:Empilhar:.");
        while(i-->1)
        {
            pilha.empilhar(new Integer(i));
            System.out.print(i +"..");
        }
        System.out.println("\n\n.:Desempilhar:.");
        i = 11;
        while(i-->1)
        {
            System.out.print(pilha.desempilhar()+"..");
        }
    }
}
