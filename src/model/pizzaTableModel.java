/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Leonardo
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.pizza;

/**
 *
 * @author Igor
 */
public class pizzaTableModel extends AbstractTableModel {
    public static final int COL_ID = 0;
    public static final int COL_NOME = 1;
    public static final int COL_DETALHES = 2;
    public static final int COL_STATUS = 3;
    
    public ArrayList<pizza> lista;
    
    public pizzaTableModel(ArrayList<pizza> l){
        lista = new ArrayList<pizza>(l);
    }
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
       return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       pizza p = lista.get(rowIndex);
       if(columnIndex == COL_ID) return p.getId();
       if(columnIndex == COL_NOME) return p.getNome();
       if(columnIndex == COL_DETALHES) return p.getDetalhes();
       if(columnIndex == COL_STATUS) return p.getStatus();
       return "";
    }
    
    @Override
    public String getColumnName(int columnIndex){
       if(columnIndex == COL_ID) return "Código";
       if(columnIndex == COL_NOME) return "Nome";
       if(columnIndex == COL_DETALHES) return "Descrição";
       if(columnIndex == COL_STATUS) return "Status";
       return "";
    }
   
}