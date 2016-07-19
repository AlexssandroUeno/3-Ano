/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unifil.javaconnection.controllers;

import edu.unifil.javaconnection.connection.ConnectionFactory;
import edu.unifil.javaconnection.models.Pessoa;
import edu.unifil.javaconnection.views.ConfigView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Guidetti
 */
public class PessoaDao implements BasicDao<Pessoa> {

    private Connection connection;

    public PessoaDao() {
        start();
    }

    public void start() {
        try {
            this.connection = ConnectionFactory.getInstance().getConnection();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "A conexão não pode ser estabelecidade");
            ConfigView cfg = ConfigView.getInstance();
            cfg.setVisible(true);
        }
    }

    public void stop() throws SQLException {
        if (!connection.isClosed()) {
            this.connection.close();
        }
    }

    @Override
    public void insert(Pessoa pessoa) {
        System.out.println(pessoa);
        String sql = "insert into pessoa "
                + "(nome,idade, email)"
                + " values(?,?,?)";
        try {
            // Prepared Statement para insercao
            PreparedStatement stmt = this.connection.prepareStatement(sql);

            // Seta os valores das interrogracoes na ordem;
            stmt.setString(1, pessoa.getNome());
            stmt.setInt(2, pessoa.getIdade());
            stmt.setString(3, pessoa.getEmail());

            //executa
            stmt.execute();

            // fecha
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public void update(Pessoa pessoa) {
        String sql = "update pessoa set nome=?, idade=?, email=? where id=?";
        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);

            stmt.setString(1, pessoa.getNome());
            stmt.setInt(2, pessoa.getIdade());
            stmt.setString(3, pessoa.getEmail());
            stmt.setLong(4, pessoa.getId());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(long id) {
        String sql = "delete"
                + " from pessoa where id=?";
        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);

            stmt.setLong(1, id);
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Pessoa getById(long id) {
        String sql = "select * from pessoa where id=" + id;
        Pessoa pessoa = new Pessoa();
        try {
            //Prepara o comando sql
            PreparedStatement stmt = this.connection.prepareStatement(sql);

            // Executa e pega o resultado do comando sql
            ResultSet rs = stmt.executeQuery();
            rs.first();
            //Cria uma pessoa e preenche com os resultados    
            pessoa.setId(rs.getInt("id"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setIdade(rs.getInt("idade"));
            pessoa.setEmail(rs.getString("email"));

            rs.close();
            stmt.close();
            return pessoa;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Pessoa> getFilterAll() {
        List<Pessoa> pessoas = new ArrayList<>();

        String sql = "select * from pessoa where ";
        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Pessoa p = new Pessoa(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getInt("idade"),
                        rs.getString("email"));
                pessoas.add(p);
            }
            rs.close();
            stmt.close();
            return pessoas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Pessoa> getAll() {
        try {
            List<Pessoa> pessoas = new ArrayList<>();
            String sql = "select * from pessoa";
            
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Pessoa p = new Pessoa(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getInt("idade"),
                        rs.getString("email"));
                pessoas.add(p);
            }
            rs.close();
            stmt.close();
            return pessoas;
        } catch (SQLException ex) {
        }
        return null;
    }

    public Pessoa getByEmail(String email) {
        String sql = "select * from pessoa where email=" + email;
        Pessoa pessoa = new Pessoa();
        try {
            //Prepara o comando sql
            PreparedStatement stmt = this.connection.prepareStatement(sql);

            // Executa e pega o resultado do comando sql
            ResultSet rs = stmt.executeQuery();
            rs.next();
            //Cria uma pessoa e preenche com os resultados    
            pessoa.setId(rs.getInt("id"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setIdade(rs.getInt("idade"));
            pessoa.setEmail(rs.getString("email"));
            rs.close();
            stmt.close();
            return pessoa;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
