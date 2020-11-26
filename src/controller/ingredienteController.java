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
import model.ingrediente;
/**
 *
 * @author Leonardo
 */
public class ingredienteController {
    private Connection con = conexao.getConnection();
    
    private Connection connection;
    public ingredienteController() {
        this.connection = new conexao().getConnection();
    }

    public void cadastrar(ingrediente ingrediente) {
        try {
            String sql = "INSERT INTO ingrediente(nome, detalhes, idFornecedor, status) VALUES(?,?,?,?)";
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, ingrediente.getNome());
                stmt.setString(2, ingrediente.getUnidade());
                stmt.setInt(3, ingrediente.getIdFornecedor());
                stmt.setBoolean(4, ingrediente.isStatus());
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Inserido com sucesso");
        } 
        catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir "+u);
        }
    }
    public void alterar(ingrediente ingrediente) {
        try {
            int id = ingrediente.getId();
            String sql = "update ingrediente set nome=?, unidade=?, idFornecedor=?, status=? where id="+id;
                PreparedStatement stmt = connection.prepareStatement(sql);
                
                 stmt.setString(1, ingrediente.getNome());
                stmt.setString(2, ingrediente.getUnidade());
                stmt.setInt(3, ingrediente.getIdFornecedor());
                stmt.setBoolean(4, ingrediente.isStatus());
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } 
        catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar "+u);
        }
    }
    
    public void excluir(ingrediente ingrediente) {
        try {
            String sql;
            if (!String.valueOf(ingrediente.getId()).isEmpty()) {
                sql = "DELETE FROM ingrediente WHERE id= ?";
                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setInt(1, ingrediente.getId());
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Deletado com sucesso");
            }
        } catch (SQLException e) {
             e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro ao deletar");
        }
    }
    
    
    public ArrayList<ingrediente> listarTodos() {
        try {

            String sql = "SELECT * FROM ingrediente where status=1";

            ArrayList dado = new ArrayList();

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ingrediente p = new ingrediente();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setUnidade(rs.getString("unidade"));
                p.setIdFornecedor(rs.getInt("idFornecedor"));
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
    
       public ArrayList<ingrediente> buscar(ingrediente ingrediente) {
        try {
             
            
            String sql = "SELECT * FROM ingrediente WHERE nome = '" + ingrediente.getNome()+"'";
            
            ArrayList dado = new ArrayList();
            
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

             while (rs.next()) {
                ingrediente p = new ingrediente();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setUnidade(rs.getString("unidade"));
                p.setIdFornecedor(rs.getInt("idFornecedor"));
                p.setStatus(rs.getBoolean("status"));
                dado.add(p);

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
