/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import entity.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.cardapio;
/**
 *
 * @author Leonardo
 */
public class cardapioController {
    private Connection con = conexao.getConnection();
    
    private Connection connection;
    public cardapioController() {
        this.connection = new conexao().getConnection();
    }

    public void cadastrar(cardapio cardapio) {
        try {
            String sql = "INSERT INTO cardapio(nome, detalhes, status) VALUES(?,?,?)";
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, cardapio.getNome());
                stmt.setString(2, cardapio.getDetalhes());
                stmt.setBoolean(3, cardapio.getStatus());
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Inserido com sucesso");
        } 
        catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir "+u);
        }
    }
    public void alterar(cardapio cardapio) {
        try {
            int id = cardapio.getId();
            String sql = "update cardapio set nome=?, detalhes=?, status=? where id="+id;
                PreparedStatement stmt = connection.prepareStatement(sql);
                
                stmt.setString(1, cardapio.getNome());
                stmt.setString(2, cardapio.getDetalhes());
                stmt.setBoolean(3, cardapio.getStatus());
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } 
        catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar "+u);
        }
    }
    
    public void excluir(cardapio cardapio) {
        try {
            int id = cardapio.getId();
                String sql = "update cardapio set nome=?, detalhes=?, status=? where id="+id;
                PreparedStatement stmt = connection.prepareStatement(sql);
                
                stmt.setString(1, cardapio.getNome());
                stmt.setString(2, cardapio.getDetalhes());
                stmt.setBoolean(3, cardapio.getStatus());
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "deletado com sucesso");
        } 
        catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar "+u);
        }
    }
    
    
    public ArrayList<cardapio> listarTodos() {
        try {

            String sql = "SELECT * FROM cardapio where status = 1";

            ArrayList dado = new ArrayList();

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                cardapio p = new cardapio();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setDetalhes(rs.getString("detalhes"));
                p.setStatus(rs.getBoolean("status"));
                dado.add(p);

            }
            ps.close();
            rs.close();
            connection.close();

            return dado;
            
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro preencher o ArrayList: "+e);
            return null;
        }

    }
    
       public ArrayList<cardapio> buscar(cardapio cardapio) {
        try {
             
            
            String sql = "SELECT * FROM cardapio WHERE status = "+cardapio.getStatus()+" and nome LIKE '%" + cardapio.getNome() + "%'";

            ArrayList dado = new ArrayList();
            
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                cardapio ret = new cardapio();
                ret.setId(rs.getInt("id"));
                ret.setNome(rs.getString("nome"));
                ret.setDetalhes(rs.getString("detalhes"));
                ret.setStatus(rs.getBoolean("status"));
                dado.add(ret);
            }
            ps.close();
            rs.close();
            connection.close();
            return dado;
            
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro preencher o ArrayList");
            return null;
        }

    }
    

}
