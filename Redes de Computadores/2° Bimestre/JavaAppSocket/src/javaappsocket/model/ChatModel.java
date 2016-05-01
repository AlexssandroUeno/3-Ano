/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaappsocket.model;

/**
 * 
 * @author José Ricardo Guidetti Junior <ricardo.guidetti@hotmail.com>
 */
public class ChatModel 
{
    
    /**
     * Construtor padrão.
     */
    public ChatModel() { }
    
    /**
     * No método getTextToAppend, retornamos o texto do chat.
     * @return <tt>textToAppend</tt>, o valor da String.
     */
    public String getTextToAppend() 
    {
        return this.textToAppend;
    }

    /**
     * No método setTextToAppend, recebemos uma String e atribuímos-a na
     * nossa String, que deverá ser usada para concatenar as mensagens do chat
     * 
     * @param textToAppend, String recebida 
     */
    public void setTextToAppend(String textToAppend) {
        this.textToAppend = textToAppend;
    }
    
    /* Atributos privados da classe ChatModel */
    private String textToAppend;
}
