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
import model.fornecedor;
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
    
       public fornecedor buscar(String busca) {
        try {
            fornecedor ret = new fornecedor(); 
            String sql = "SELECT * FROM fornecedor WHERE razaoSocial or endereco LIKE '%" + busca + "%' ";

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
//            JOptionPane.showMessageDialog(null, ret.());;
            return ret;
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro preencher o ArrayList");
            return null;
        }

    }
    

}
