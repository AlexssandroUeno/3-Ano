package javaappsocket.controler;

import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javaappsocket.model.ChatModel;
import javaappsocket.view.ChatView;
import javax.swing.AbstractAction;

/**
 *
 * @author José Ricardo Guidetti Junior <ricardo.guidetti@hotmail.com>
 */
public class ChatController 
{    
    /**
     * Construtor completo, que recebe como argumento duas classes para 
     * inicializarmos e que possamos controla-las, aqui também é onde 
     * adicionamos as ações da tela e onde controlamos o texto do chat.
     * 
     * @param view, Tela do chat
     * @param model, Classe de manipulação da tela do chat
     */
    public ChatController(ChatView view, ChatModel model) 
    {   /* Inicializando atributos */
        this.view = view; 
        this.model = model;
        
        /* Adicionado ações da tela */
        this.view.addSendKeyListener(new sendAction());
        this.view.addSendTextListener(new SendTextListener());
    }   
    
    /* Aciona quando teclarmos a tecla Enter */
    public class sendAction extends AbstractAction
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            String text = model.getTextToAppend().concat(NEXT_LINE);
            view.append(text);
        }   
    }
    
    /* Aciona enquanto estiver teclando */
    public class SendTextListener extends KeyAdapter
    {
        @Override
        public void keyPressed(KeyEvent e) 
        { 
            model.setTextToAppend(view.getSendMsg()); 
        }
       
    }
    
    /* Atributo privado da classe ChatController */
    private final ChatView view;
    private final ChatModel model;
    private static final String NEXT_LINE = "\n";
}


