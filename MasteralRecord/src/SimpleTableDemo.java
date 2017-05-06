/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arvince Neil
 */
import javax.swing.event.*;
import javax.swing.table.TableModel;

public class SimpleTableDemo implements TableModelListener {
    
    public SimpleTableDemo() {
        
        GetValue.jTable1.getModel().addTableModelListener(this);
        
    }

    public void tableChanged(TableModelEvent e) {
        int row = e.getFirstRow();
        int column = e.getColumn();
        TableModel model = (TableModel)e.getSource();
        String columnName = model.getColumnName(column);
        Object data = model.getValueAt(row, column);

//        ...// Do something with the data...
    }
//    ...
}
