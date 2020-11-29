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
import model.evento;
/**
 *
 * @author Leonardo
 */
public class eventoController {
    private Connection con = conexao.getConnection();
    
    private Connection connection;
    public eventoController() {
        this.connection = new conexao().getConnection();
    }

    public void cadastrar(evento evento) {
        try {
            String sql = "INSERT INTO eventofestividade(nomeEvento, idCardapio, status) VALUES(?,?,?)";
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, evento.getNomeEvento());
                stmt.setInt(2, evento.getIdCardapio());
                stmt.setBoolean(3, evento.isStatus());
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Inserido com sucesso");
        } 
        catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir "+u);
        }
    }
    public void alterar(evento evento) {
        try {
            int id = evento.getId();
            String sql = "update eventofestividade set nomeEvento=?, idCardapio=?, status=? where id="+id;
                PreparedStatement stmt = connection.prepareStatement(sql);
                
                stmt.setString(1, evento.getNomeEvento());
                stmt.setInt(2, evento.getIdCardapio());
                stmt.setBoolean(3, evento.isStatus());
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } 
        catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar "+u);
        }
    }
    
    public void excluir(evento evento) {
        try {
            int id = evento.getId();
                String sql = "update eventofestividade set nomeEvento=?, idCardapio=?, status=? where id="+id;
                PreparedStatement stmt = connection.prepareStatement(sql);
                
                stmt.setString(1, evento.getNomeEvento());
                stmt.setInt(2, evento.getIdCardapio());
                stmt.setBoolean(3, evento.isStatus());
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "deletado com sucesso");
        } 
        catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar "+u);
        }
    }
    
    
    public ArrayList<evento> listarTodos() {
        try {

            String sql = "SELECT * FROM eventofestividade where status = 1";

            ArrayList dado = new ArrayList();

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                evento p = new evento();
                p.setId(rs.getInt("id"));
                p.setNomeEvento(rs.getString("nomeEvento"));
                p.setIdCardapio(rs.getInt("idCardapio"));
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
    
       public ArrayList<evento> buscar(evento evento) {
        try {
             
            
            String sql = "SELECT * FROM eventofestividade WHERE status = "+evento.isStatus()+" and nomeEvento LIKE '%" + evento.getNomeEvento()+ "%'";

            ArrayList dado = new ArrayList();
            
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                evento ret = new evento();
                ret.setId(rs.getInt("id"));
                ret.setNomeEvento(rs.getString("nomeEvento"));
                ret.setIdCardapio(rs.getInt("idCardapio"));
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
