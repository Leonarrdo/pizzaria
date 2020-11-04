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
import java.util.List;
import javax.swing.JOptionPane;
import model.fornecedor;
import model.pizza;

/**
 *
 * @author Leonardo
 */
public class fornecedorController {
    private Connection con = conexao.getConnection();
    
    private Connection connection;
    public fornecedorController() {
        this.connection = new conexao().getConnection();
    }

    public void cadastrar(fornecedor fornecedor) {
        try {
            String sql = "INSERT INTO fornecedor(razaoSocial, endereco, status) VALUES(?,?,?)";
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, fornecedor.getRazaoSocial());
                stmt.setString(2, fornecedor.getEndereco());
                stmt.setBoolean(3, fornecedor.getStatus());
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Inserido com sucesso");
        } 
        catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir "+u);
        }
    }
    public void alterar(fornecedor fornecedor) {
        try {
            int id = fornecedor.getId();
            String sql = "update fornecedor set razaoSocial=?, endereco=?, status=? where id="+id;
                PreparedStatement stmt = connection.prepareStatement(sql);
                
                stmt.setString(1, fornecedor.getRazaoSocial());
                stmt.setString(2, fornecedor.getEndereco());
                stmt.setBoolean(3, fornecedor.getStatus());
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } 
        catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar "+u);
        }
    }
    
    
    public ArrayList<fornecedor> listarTodos() {
        try {

            String sql = "SELECT * FROM fornecedor";

            ArrayList dado = new ArrayList();

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                fornecedor p = new fornecedor();
                p.setId(rs.getInt("id"));
                p.setRazaoSocial(rs.getString("razaoSocial"));
                p.setEndereco(rs.getString("endereco"));
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
    
     public List<String> loadFornecedoresNomes() {
        try {

            List<String> strList = new ArrayList<String>();
            
            String sql = "SELECT * FROM fornecedor";


            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                strList.add(rs.getString("razaoSocial"));
            }
            ps.close();
            rs.close();
            connection.close();

            return strList;
            
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro preencher o ArrayList: "+e);
            return null;
        }

    }
    
    
 
          public void excluir(fornecedor fornecedor) {
        try {
            String sql;
            if (!String.valueOf(fornecedor.getId()).isEmpty()) {
                sql = "DELETE FROM fornecedor WHERE id= ?";
                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setInt(1, fornecedor.getId());
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Deletado com sucesso");
            }
        } catch (SQLException e) {
             e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro ao deletar");
        }
    }
          
           public ArrayList<fornecedor> buscar(fornecedor fornecedor) {
        try {
             
            
            String sql = "SELECT * FROM fornecedor WHERE razaoSocial LIKE '%" + fornecedor.getRazaoSocial()+ "%' or endereco LIKE '%" + fornecedor.getEndereco()+ "%' ";
            
            ArrayList dado = new ArrayList();
            
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                fornecedor ret = new fornecedor();
                ret.setId(rs.getInt("id"));
                ret.setRazaoSocial(rs.getString("razaoSocial"));
                ret.setEndereco(rs.getString("endereco"));
                ret.setStatus(rs.getBoolean("status"));
                dado.add(ret);
            }
            ps.close();
            rs.close();
            connection.close();
            return dado;
            
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro preencher o ArrayList "+e);
            return null;
        }
    }
           public fornecedor buscarPorRazaoSocial(fornecedor fornecedor) {
        try {
             
            
            String sql = "SELECT * FROM fornecedor WHERE razaoSocial='"+fornecedor.getRazaoSocial()+"'";
            System.out.println(sql);
            fornecedor ret = new fornecedor();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                ret.setId(rs.getInt("id"));
                ret.setRazaoSocial(rs.getString("razaoSocial"));
                ret.setEndereco(rs.getString("endereco"));
                ret.setStatus(rs.getBoolean("status"));
            }
            ps.close();
            rs.close();
            connection.close();
            return ret;
            
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro preencher o ArrayList "+e);
            return null;
        }
    }
           public fornecedor buscarPorID(fornecedor fornecedor) {
        try {
             
            
            String sql = "SELECT * FROM fornecedor WHERE id="+fornecedor.getId();
            System.out.println(sql);
            fornecedor ret = new fornecedor();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                ret.setId(rs.getInt("id"));
                ret.setRazaoSocial(rs.getString("razaoSocial"));
                ret.setEndereco(rs.getString("endereco"));
                ret.setStatus(rs.getBoolean("status"));
            }
            ps.close();
            rs.close();
            connection.close();
            return ret;
            
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro preencher o ArrayList "+e);
            return null;
        }
    }
    

}
