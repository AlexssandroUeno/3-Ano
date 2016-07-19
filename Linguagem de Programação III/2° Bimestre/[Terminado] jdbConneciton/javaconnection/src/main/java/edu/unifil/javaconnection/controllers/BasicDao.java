/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unifil.javaconnection.controllers;

import java.util.List;

/**
 *
 * @author Guidetti
 */
public interface BasicDao<K> {
    
    public void insert(K pessoa);
    public void update(K pessoa);
    public void delete(long id);
    public K getById(long id);
    public List<K> getAll();
    
}
