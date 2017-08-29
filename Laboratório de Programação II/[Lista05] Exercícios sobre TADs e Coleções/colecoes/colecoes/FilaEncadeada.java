
/**
 * FilaEncadeada.java
 * 
 * @author José Ricardo e Gabriel Praxedes
 * @version 20/08/2017
 */
public class FilaEncadeada implements Fila
{
   public FilaEncadeada(){
        this.primeiro = null;
   }
    public void enfileirar(Object valor) {
        No no = new No(valor);
        if(isEmpty()){
            primeiro = no;
            ultimo = no;
        }else{
            no.setProximo(ultimo);
            ultimo = no;
        }
   }
   
   public Object desenfileirar(){       
       No noRemovido = primeiro;
       if( primeiro == ultimo )
       {
           primeiro = null;
           ultimo = null;
       }
       else{
           primeiro = getAnterior(noRemovido);
           primeiro.setProximo(null);
       }
       return noRemovido.getValor();
   }
   
   public Object primeiro(){
       return primeiro.getValor();
   }
   
   private Object ultimo(){
       return ultimo.getValor();
   }
   
   private boolean isEmpty() {
        if (primeiro == null) {
            return true;
        } else {
            return false;
        }
    }    
   private No getAnterior(No _node) {
        No aux = ultimo;
        while (aux.getProximo() != _node) {
            aux = aux.getProximo();
        }
        return aux;
    }
    private No primeiro;
    private No ultimo;
}