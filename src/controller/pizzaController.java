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
import model.pizza;
/**
 *
 * @author Leonardo
 */
public class pizzaController {
    private Connection con = conexao.getConnection();
    
    private Connection connection;
    public pizzaController() {
        this.connection = new conexao().getConnection();
    }

    public void cadastrar(pizza pizza) {
        try {
            String sql = "INSERT INTO pizza(nome, detalhes, status) VALUES(?,?,?)";
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, pizza.getNome());
                stmt.setString(2, pizza.getDetalhes());
                stmt.setInt(3, pizza.getStatus());
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Inserido com sucesso");
        } 
        catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir "+u);
        }
    }
    public void alterar(pizza pizza) {
        try {
            int id = pizza.getId();
            String sql = "update pizza set nome=?, detalhes=?, status=? where id="+id;
                PreparedStatement stmt = connection.prepareStatement(sql);
                
                stmt.setString(1, pizza.getNome());
                stmt.setString(2, pizza.getDetalhes());
                stmt.setInt(3, pizza.getStatus());
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } 
        catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar "+u);
        }
    }
    
    
    public ArrayList<pizza> listarTodos() {
        try {

            String sql = "SELECT * FROM pizza";

            ArrayList dado = new ArrayList();

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                pizza p = new pizza();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setDetalhes(rs.getString("detalhes"));
                p.setStatus(rs.getInt("status"));
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
    
       public pizza buscar(String busca) {
        try {
            pizza ret = new pizza(); 
            String sql = "SELECT * FROM pizza WHERE nome or detalhes LIKE '%" + busca + "%' ";

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ret.setId(rs.getInt("id"));
                ret.setNome(rs.getString("nome"));
                ret.setDetalhes(rs.getString("detalhes"));
                ret.setStatus(rs.getInt("status"));
            }
            ps.close();
            rs.close();
            connection.close();
            JOptionPane.showMessageDialog(null, ret.getNome());
            return ret;
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro preencher o ArrayList");
            return null;
        }

    }
    

}
