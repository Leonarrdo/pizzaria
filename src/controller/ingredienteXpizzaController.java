package controller;
import entity.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.cardapioPizza;
import model.cardapioXpizza;
import model.ingrediente;
import model.ingredienteXpizza;
import model.pizza;
/**
 *
 * @author Leonardo
 */
public class ingredienteXpizzaController {
    private Connection con = conexao.getConnection();
    
    private Connection connection;
    public ingredienteXpizzaController() {
        this.connection = new conexao().getConnection();
    }

    public void cadastrar(ingredienteXpizza ip) {
        try {
            String sql = "INSERT INTO ingredientexpizza(idIngrediente, IdPizza) VALUES(?,?)";
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setInt(1, ip.getIdIngrediente());
                stmt.setInt(2, ip.getIdPizza());
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Inserido com sucesso");
        } 
        catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir "+u);
        }
    }
    
    public void excluir(ingredienteXpizza c) {
        try {
            int idIngrediente = c.getIdIngrediente();
            int idPizza = c.getIdPizza();
            String sql = "delete from ingredientexpizza where idPizza="+idPizza +" and idIngrediente ="+idIngrediente;
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Ingrediente deletado com sucesso");
        } 
        catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar pizza "+u);
        }
    }
    
       public ArrayList<ingrediente> buscar(ingredienteXpizza ip) {
        try {
             
            String sql =    "select * from ingredientexpizza c \n" +
                            "join ingrediente i on c.idIngrediente = i.id \n" +
                            "where c.idPizza ="+ip.getIdPizza()+" and i .status = 1";
            ArrayList dado = new ArrayList();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ingrediente ret = new ingrediente();
                ret.setId(rs.getInt("id"));
                ret.setNome(rs.getString("nome"));
                ret.setUnidade(rs.getString("unidade"));   
                ret.setIdFornecedor(rs.getInt("idFornecedor"));
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

