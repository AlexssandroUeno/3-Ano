package javaappsocket;

import javaappsocket.controler.ChatController;
import javaappsocket.model.ChatModel;
import javaappsocket.view.ChatView;

/**
 *
 * @author José Ricardo Guidetti Junior <ricardo.guidetti@hotmail.com>
 */
public class Main 
{

    public static void main(String[] args) 
    {
        ChatView view = new ChatView();
        ChatModel model = new ChatModel();
        
        ChatController controller = new ChatController(view, model);
        view.setVisible(true);
    }
}
