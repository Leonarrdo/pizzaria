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
import model.ingrediente;

/**
 *
 * @author Igor
 */
public class ingredienteTableModel extends AbstractTableModel {
    public static final int COL_ID = 0;
    public static final int COL_NOME = 1;
    public static final int COL_UNIDADE = 2;
    public static final int COL_FORNECEDOR = 3;
    public static final int COL_STATUS = 4;
    
    public ArrayList<ingrediente> lista;
    
    public ingredienteTableModel(ArrayList<ingrediente> l){
        lista = new ArrayList<ingrediente>(l);
    }
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
       return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       ingrediente p = lista.get(rowIndex);
       if(columnIndex == COL_ID) return p.getId();
        if(columnIndex == COL_NOME) return p.getNome();
       if(columnIndex == COL_UNIDADE) return p.getUnidade();
       if(columnIndex == COL_FORNECEDOR) return p.getIdFornecedor();
       if(columnIndex == COL_STATUS) return p.isStatus();
       return "";
    }
    
    @Override
    public String getColumnName(int columnIndex){
       if(columnIndex == COL_ID) return "Código";
       if(columnIndex == COL_NOME) return "Nome";
       if(columnIndex == COL_UNIDADE) return "Unidade";
       if(columnIndex == COL_FORNECEDOR) return "Fornecedor";
       if(columnIndex == COL_STATUS) return "Status";
       return "";
    }
   
}