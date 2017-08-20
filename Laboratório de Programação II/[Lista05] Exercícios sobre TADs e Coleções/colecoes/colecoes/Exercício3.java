
/**
 * Exercício3.java
 * 
 * @author José Ricardo  e Gabriel Praxedes
 * @version 20/08/2017
 */
public class Exercício3
{
    public static void main(String[]args)
    {
        FilaContigua fila = new FilaContigua(); 
        int i = 11;
        System.out.println("[FIFO]");
        System.out.println("\n.:Enfileirar:.");
        while(i-->1)
        {
            fila.enfileirar(new Integer(i));
            System.out.print(i+"..");
        }
        System.out.println("\n\n.:Desenfileirar:.");
        i = 11;
        while(i-->1)
        {
            System.out.print(fila.desenfileirar()+"..");
        }
    }
}
