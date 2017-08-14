import java.util.Comparator;
import java.util.Optional;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Write a description of class SintetizadorRelatorios here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SintetizadorRelatorios {
    
    /**
     * Método que ordena um arranjo de colaboradores por salários, in-place. Como
     * nem todo colaborador tem salário registrado, aqueles que não tiverem devem ser
     * colocados no início da lista, como se fossem menores que quaisquer outros valores.
     * Colaboradores sem salarios devem se manter na mesma ordem entre si, tal que se
     * "João" e "André" são sem salário, e João inicialmente esteve antes de André,
     * no arranjo resultante eles podem mudar de posições desde que João permaneça antes
     * de André.
     * 
     * @param colaboradores arranjo de colaboradores a ser ordenado in-place.
     */    
    public static void ordenarPorSalario(Colaborador[] colaboradores) {

        for (int i = 0; i < colaboradores.length; i++) {
            
            int minimum = i;// Indice do maior elemento
            for (int j = i + 1; j < colaboradores.length; j++) {
                if(colaboradores[minimum].getSalario().isPresent() && colaboradores[j].getSalario().isPresent()) {
                   
                }
                
                if (colaboradores[minimum] > colaboradores[j]) {
                    minimum = j;//Indice do maior elemento
                }
            }
            trocar(colaboradores, i, minimum); //Coloca o elemento no seu devido local
        }
    }
    
    private static void getIndexToSwap(Colaborador[] colaboradores) {
        
    }
    
    public static void main (String[]args) {
        List<Colaborador> listColabs = getColaboradores();
        listColabs.forEach((c)->System.out.println(c));
    }
    
    public static List<Colaborador> getColaboradores() {
        List<Colaborador> colaboradores = new ArrayList<Colaborador>();
        colaboradores.add(new Colaborador("José", 23, 1400));
        colaboradores.add(new Colaborador("Robson", 21, 600));
        colaboradores.add(new Colaborador("Roberto", 27));
        colaboradores.add(new Colaborador("Hugo", 25, 1700));
        colaboradores.add(new Colaborador("Guilherme", 19));
        colaboradores.add(new Colaborador("Thiago", 20, 1200));
        
        return colaboradores;
    }
    
    private static void trocar(int[] ordenado, int i, int j) {
        int seguro = ordenado[i];
        ordenado[i] = ordenado[j];
        ordenado[j] = seguro;
    }
}
