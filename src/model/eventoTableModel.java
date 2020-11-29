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
import model.cardapio;

/**
 *
 * @author Igor
 */
public class eventoTableModel extends AbstractTableModel {
    public static final int COL_ID = 0;
    public static final int COL_NOME = 1;
    public static final int COL_IDCARDAPIO = 2;
    public static final int COL_STATUS = 3;
    
    public ArrayList<evento> lista;
    
    public eventoTableModel(ArrayList<evento> l){
        lista = new ArrayList<evento>(l);
    }
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
       return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       evento e = lista.get(rowIndex);
       if(columnIndex == COL_ID) return e.getId();
       if(columnIndex == COL_NOME) return e.getNomeEvento();
       if(columnIndex == COL_IDCARDAPIO) return e.getIdCardapio();
       if(columnIndex == COL_STATUS) return e.isStatus();
       return "";
    }
    
    @Override
    public String getColumnName(int columnIndex){
       if(columnIndex == COL_ID) return "Código";
       if(columnIndex == COL_NOME) return "Nome";
       if(columnIndex == COL_IDCARDAPIO) return "Cardápio";
       if(columnIndex == COL_STATUS) return "Status";
       return "";
    }
   
}