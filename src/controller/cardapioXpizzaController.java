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
import model.pizza;
/**
 *
 * @author Leonardo
 */
public class cardapioXpizzaController {
    private Connection con = conexao.getConnection();
    
    private Connection connection;
    public cardapioXpizzaController() {
        this.connection = new conexao().getConnection();
    }

    public void cadastrar(cardapioXpizza cardapioPizza) {
        try {
            String sql = "INSERT INTO cardapioxpizza(idPizza, idCardapio) VALUES(?,?)";
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setInt(1, cardapioPizza.getIdPizza());
                stmt.setInt(2, cardapioPizza.getIdCardapio());
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
                stmt.setBoolean(3, pizza.getStatus());
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } 
        catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar "+u);
        }
    }
    
    public void excluir(cardapioXpizza c) {
        try {
            int idCardapio = c.getIdCardapio();
            int idPizza = c.getIdPizza();
            String sql = "delete from cardapioxpizza where idPizza="+idPizza +" and idCardapio ="+idCardapio;
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.execute();
                stmt.close();
                JOptionPane.showMessageDialog(null, "Pizza deletada com sucesso");
        } 
        catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar pizza "+u);
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
    
       public ArrayList<pizza> buscar(cardapioXpizza cardapioPizza) {
        try {
             
            String sql =    "select * from cardapioxpizza c \n" +
                            "join pizza p on c.idPizza = p.id \n" +
                            "where c.idCardapio ="+cardapioPizza.getIdCardapio()+" and p.status = 1";
            ArrayList dado = new ArrayList();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                pizza ret = new pizza();
                ret.setId(rs.getInt("id"));
                ret.setStatus(rs.getBoolean("status"));
                ret.setNome(rs.getString("nome"));
                ret.setDetalhes(rs.getString("detalhes"));
                
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
       
        public boolean verificaExiste(cardapioXpizza cardapioPizza) {
        try {
             
            String sql =    "select * from cardapioxpizza c \n" +
                            "join pizza p on c.idPizza = p.id \n" +
                            "where c.idCardapio ="+cardapioPizza.getIdCardapio()+" and idPizza="+cardapioPizza.getIdPizza()+" and p.status = 1";
            ArrayList dado = new ArrayList();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                pizza ret = new pizza();
                ret.setId(rs.getInt("id"));
                ret.setStatus(rs.getBoolean("status"));
                ret.setNome(rs.getString("nome"));
                ret.setDetalhes(rs.getString("detalhes"));
                
                dado.add(ret);
            }
            ps.close();
            rs.close();
            connection.close();
            if(dado.size()>0){
                return false;
            }
            return true;
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro preencher o ArrayList");
            return false;
        }

    }
    

}

