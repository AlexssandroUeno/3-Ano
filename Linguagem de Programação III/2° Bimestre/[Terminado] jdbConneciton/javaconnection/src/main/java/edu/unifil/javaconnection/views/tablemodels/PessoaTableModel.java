/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unifil.javaconnection.views.tablemodels;

import edu.unifil.javaconnection.connection.ConnectionFactory;
import edu.unifil.javaconnection.models.Pessoa;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mhadaniya
 */
public class PessoaTableModel extends AbstractTableModel {
    
    private ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    private final String [] colunas = {"Nome", "Idade", "E-mail"};

    public PessoaTableModel() {
        
    }
    
    
    public void addPessoa(Pessoa _pessoa) {
        this.listaPessoas.add(_pessoa);
        fireTableDataChanged();
    }
    
    public void removePessoa(int _rowIndex) {
        this.listaPessoas.remove(_rowIndex);
        fireTableDataChanged();
    }
    
    public Pessoa getPessoa(int _rowIndex) {
        return this.listaPessoas.get(_rowIndex);
    } 
     
    @Override
    public int getRowCount() {
        return this.listaPessoas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged();
    }
    
    @Override
    public Object getValueAt(int _rowIndex, int _columnIndex) 
    {
        switch (_columnIndex) {
            case 0:
                return this.listaPessoas.get(_rowIndex).getNome();
            case 1:
                return this.listaPessoas.get(_rowIndex).getIdade();
            case 2:
                return this.listaPessoas.get(_rowIndex).getEmail();
            default:
                return  this.listaPessoas.get(_rowIndex);
        }
    }
    
    @Override
    public String getColumnName(int _column) {
         return this.colunas[_column];
    }

    
    public ArrayList<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    public void setListaPessoas(ArrayList<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }
    
    
}
