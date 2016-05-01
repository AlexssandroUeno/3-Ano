package javaappsocket.view;

/**
 * 
 * @author José Ricardo Guidetti Junior <ricardo.guidetti@hotmail.com>
 */
public class ChatView extends javax.swing.JFrame
{
    /**
     * Contrutor para criação da janela.
     */
    public ChatView()
    {
        initComponents();
        setProprietyOfFrame();
        setComponentsOnFrame();
    }
    
    private void setProprietyOfFrame() 
    {   
        /* Desabilita a mudança de resolução da janela */
        this.setResizable(false);
        
        /* Define a saída da aplicação */
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        /* Define o layout do janela */
        this.getContentPane().setLayout(new java.awt.BorderLayout());
    }
    
    private void initComponents() 
    {
        /* Inicializando o JScrollPane */
        scrollpane = new javax.swing.JScrollPane();
        
        /* Inicializando o JTextArea */
        txMsgArea = new javax.swing.JTextArea();
        
        /* Inicializando o JTextField */
        txSendMsg = new javax.swing.JTextField();
    }
    
    private void setComponentsOnFrame()
    {
        /* Sincroniza o scroll pane com a area de mensagem do chat */
        scrollpane.setViewportView(txMsgArea);
        
        /* Atribuímos a quantidade de linhas e colunas a ser mostrado */
        txMsgArea.setRows(ROWS_TEXTAREA);
        txMsgArea.setColumns(COLUMNS_TEXTAREA);
        
        /* Adiciona os components em seus respectivos lugares */
        this.add(scrollpane, SUPERIOR);
        this.add(txSendMsg, INFERIOR);
        
        /* Encaixa os components, junta todos e deixa em tamanhos relativos */
        this.pack();
        
        /* Localização da janela, para o centro */
        this.setLocationRelativeTo(null);
        
        /* Deixamos o focado no campo txSendMsg */
        txSendMsg.requestFocus();
    }
    
    /**
     * No método append, recebemos como argumento uma String, onde adicionamos-a
     * na area das mensagens do chat.
     * 
     * @param msgArea, Text a ser adicionado no chat.
     */
    public void append(String msgArea) { txMsgArea.append(msgArea); }
    
    /**
     * No método getSendMsg, retorna o valor contido no campo de envio 
     * das mensangens.
     * 
     * @return texto do campo de envio de mensagens.
     */
    public String getSendMsg() { return txSendMsg.getText(); }
    
    /**
     * No método addSendKeyListener, adicionamos uma ação ao campo 
     * de envio das mensagens.
     * 
     * @param listener, Ação para ser adicionada
     */
    public void addSendKeyListener(java.awt.event.ActionListener listener)
    {
        txSendMsg.addActionListener(listener);
    }
    
    /**
     * No método addSendTextListener, adicionamos uma ação para quando teclarmos
     * qualquer tecla no campo de envio das mensagens.
     * 
     * @param listener, Teclas acionadas
     */
    public void addSendTextListener(java.awt.event.KeyAdapter listener)
    {
        txSendMsg.addKeyListener(listener);
    }
 
    /* Atributos privados da classe ChatView */
    public javax.swing.JScrollPane scrollpane;
    public javax.swing.JTextArea   txMsgArea ;
    public javax.swing.JTextField  txSendMsg ;
    
    /* Atributos estáticos e constantes */
    private static final int ROWS_TEXTAREA = 15   ,
                             COLUMNS_TEXTAREA = 30;
    private static final String SUPERIOR = java.awt.BorderLayout.NORTH,
                                INFERIOR = java.awt.BorderLayout.SOUTH;
}
