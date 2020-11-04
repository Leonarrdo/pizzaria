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
import model.fornecedor;

/**
 *
 * @author Igor
 */
public class fornecedorTableModel extends AbstractTableModel {
    public static final int COL_ID = 0;
    public static final int COL_RAZAOSOCIAL = 1;
    public static final int COL_ENDERECO = 2;
    public static final int COL_STATUS = 3;
    
    public ArrayList<fornecedor> lista;
    
    public fornecedorTableModel(ArrayList<fornecedor> l){
        lista = new ArrayList<fornecedor>(l);
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
       fornecedor p = lista.get(rowIndex);
       if(columnIndex == COL_ID) return p.getId();
       if(columnIndex == COL_RAZAOSOCIAL) return p.getRazaoSocial();
       if(columnIndex == COL_ENDERECO) return p.getEndereco();
       if(columnIndex == COL_STATUS) return p.getStatus();
       return "";
    }
    
    @Override
    public String getColumnName(int columnIndex){
       if(columnIndex == COL_ID) return "Código";
       if(columnIndex == COL_RAZAOSOCIAL) return "Razão Social";
       if(columnIndex == COL_ENDERECO) return "Endereço";
       if(columnIndex == COL_STATUS) return "Status";
       return "";
    }
   
}