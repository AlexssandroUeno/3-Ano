/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mat;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Guidetti
 */
public class Listener implements DocumentListener
{

    private Tela main;
    private JTextField txColumn, txRow;

    public Listener(Tela main, JTextField txRow, JTextField txColumn)
    {
        this.main = main;
        this.txRow = txRow;
        this.txColumn = txColumn;
    }

    @Override
    public void insertUpdate(DocumentEvent e)
    {
        gerar();
    }

    @Override
    public void removeUpdate(DocumentEvent e)
    {
        gerar();
    }

    @Override
    public void changedUpdate(DocumentEvent e)
    {
        gerar();
    }

    private void gerar()
    {
        if (txRow.getText().trim().length() > 0 && txColumn.getText().trim().length() > 0)
        {
            main.gerarMatrizL();
            main.gerarMatrizU();
            main.gerarOResto();
        }
    }
}
