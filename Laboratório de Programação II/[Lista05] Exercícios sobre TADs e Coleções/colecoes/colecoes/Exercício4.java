
/**
 * Exercício4.java
 * 
 * @author José Ricardo  e Gabriel Praxedes
 * @version 20/08/2017
 */
public class Exercício4
{
    public static void main(String[]args)
    {
        ListaContigua lista = new ListaContigua(); 
        int i = 0;
        System.out.println("[LISTA]");
        System.out.println("[Inserção de 20 de itens]");
        while(i++<20)
        {
            lista.inserir(new Integer(i),i);
            System.out.print(i+"..");
        }
    }
}
