/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unifil.javaconnection.controllers;

import edu.unifil.javaconnection.models.Pessoa;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Guidetti
 */
public class PessoaDaoTest {
   
    @Ignore
    public void inserir() {
       Pessoa pessoa = new Pessoa("PNC",50,"pnc@gmail.com.br");
       PessoaDao dao = new PessoaDao();
       dao.insert(pessoa);
       System.out.println("Gravado!");
    }
    
    
    @Ignore
    public void getById() {
       PessoaDao dao = new PessoaDao();
       Pessoa p = dao.getById(1);
       System.out.println(p);
    }
     
    @Ignore
    public void getAll() {
        PessoaDao dao = new PessoaDao();
        List<Pessoa> listas = dao.getAll();
        
        for (Pessoa p : listas) {
            System.out.println(p);
        }
    }
     
    @Ignore
    public void delete() {
        PessoaDao dao = new PessoaDao();

        dao.delete(2);
        System.out.println("Gravado");
    }
    
    @Ignore
    public void update() {
        PessoaDao dao = new PessoaDao();
        Pessoa p = dao.getById(4);
        p.setIdade(23);
        System.out.println(p);
        dao.update(p);
    }
    
    
}
