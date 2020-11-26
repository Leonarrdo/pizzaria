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
public class cardapiosFinalizadosTableModel extends AbstractTableModel {
    public static final int COL_NOME = 0;
    
    public ArrayList<pizza> lista;
    
    public cardapiosFinalizadosTableModel(ArrayList<pizza> l){
        lista = new ArrayList<pizza>(l);
    }
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
       return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       pizza p = lista.get(rowIndex);
       if(columnIndex == COL_NOME) return p.getNome();
       return "";
    }
    
    @Override
    public String getColumnName(int columnIndex){
       if(columnIndex == COL_NOME) return "Pizzas";
       return "";
    }
   
}