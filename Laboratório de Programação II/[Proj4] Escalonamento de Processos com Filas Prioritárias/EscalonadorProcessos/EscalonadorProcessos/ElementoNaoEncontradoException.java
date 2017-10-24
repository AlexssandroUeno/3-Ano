
/**
 * Write a description of class ElementoNaoEncontradoException here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ElementoNaoEncontradoException extends Exception
{
    /**
     * Constructor for objects of class ElementoNaoEncontradoException
     */
    public ElementoNaoEncontradoException(Object elem) {
        naoEncontrado = elem;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Elemento " + naoEncontrado + " não encontrado.");
        return sb.toString();
    }

    private Object naoEncontrado;
}
