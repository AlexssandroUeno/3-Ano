import java.util.*;
/**
 * Exercicio2.java
 * 
 * @author José Ricardo
 * @version 21/08/2017
 */
public class Exercicio2
{
    private static Scanner in = new Scanner(System.in);
    private static int qntElem = 0;
    private static Random  rand = new Random();
    private static List<Integer> list = new ArrayList();
    public static void main(String[]args) {

        int respuser = -1;
        System.out.println(
        "Escolha de melhor algoritmo na ordenação,"
        +"\ndado uma  quantidade de elementos,"
        +"\no programa escolherá o melhor algoritmo para ordenação");
        do
        {
            switch(menuPrincipal())
            {
                case 0:
                    System.out.println("## [ Saindo... ] ##");
                    System.exit(0);
                break;
                case 1:
                    do{
                        System.out.print("QntElementos..:");
                        qntElem = in.nextInt();
                        if(qntElem <= 0) {
                            System.out.println("insira um qnt maior que 0");
                        }
                    }while(qntElem <= 0);
                break;
                case 2:
                    if(qntElem <= 0) {
                        System.out.println("Não foi especificado a qnt de elementos na lista\n"
                        +"estaremos inserindo uma qnt padrão de tamanho 10.");
                        qntElem = 10;
                        try { Thread.sleep(4000);} catch (InterruptedException ex) {}
                    }
                    execute();
                break;
                default:
                    System.out.println("###[ Comando inválido ]###");
                break;
            }
        }while(respuser != 0);
    }
    
    private static int menuPrincipal() {
        System.out.println("\n\t [ MENU PRINCIPAL ]");
        System.out.println("[ 0 ] - Sair");
        System.out.println("[ 1 ] - Inserir uma Qnt de Elementos");
        System.out.println("[ 2 ] - Aplicar melhor algoritmo");
        System.out.print("Insira um número: ");
        return in.nextInt();
    }
    
    private static void execute() {
        list = new ArrayList();
        randomElemento();
        System.out.println("\n");
        limpar();
        if(qntElem > 20)
        {
            Ordenacoes.ListmergeSort(list);
        } else {
            Ordenacoes.ListInsertionsort(list);
        }
    }
    
    private static void randomElemento() {
        for(int i = 0; i< qntElem; i++) {
            list.add(rand.nextInt(100)-1);
        }
    }
    
    private static void limpar(){
        System.out.print('\u000C');
    }
}
