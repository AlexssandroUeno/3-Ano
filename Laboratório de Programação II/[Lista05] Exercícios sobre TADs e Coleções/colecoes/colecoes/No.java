/**
 * No.java
 * 
 * @author Jose Ricardo e Gabriel Praxedes
 * @version 20/08/2017
 */
public class No
{
    private Object valor;
    private No proximo;
    
    public No(){}
    
    public No(Object valor)
    {this.valor = valor;    
    }
    
    public Object getValor()
    {return valor;
    }
    
    public void setValor(Object valor)
    {this.valor = valor;
    }
    
    public No getProximo()
    {return proximo;
    }
    
    public void setProximo(No proximo)
    {this.proximo = proximo;
    }
    
}