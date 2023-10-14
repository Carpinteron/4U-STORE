package com.raven.swing;

import com.raven.model.StatusType;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Table extends JTable {

    public Table() {
        setShowHorizontalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header = new TableHeader(o + "");
                Color foregroundColor = Color.decode("#26004b"); // Color de fuente
                Color backgroundColor = Color.decode("#A09CFC"); // Color de fondo
                header.setFont(new Font("Sylfaen", Font.BOLD, 14));
                header.setForeground(foregroundColor); // Cambiar el color de fuente
                jtable.setFont(new Font("Sylfaen", Font.PLAIN, 14));
                /**
                 * if (i1 == 5) { header.setHorizontalAlignment(JLabel.CENTER);
                 * }
                 *
                 */
                return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bln1, int i, int i1) {

                if (i1 != 5) {
                    Component com = super.getTableCellRendererComponent(jtable, o, selected, bln1, i, i1);
                    com.setBackground(Color.WHITE);
                    setBorder(noFocusBorder);
                    if (selected) {
                        com.setForeground(new Color(15, 89, 140));
                    } else {
                        com.setForeground(new Color(0, 0, 0));
                    }
                    return com;
                } else {
                    StatusType type = (StatusType) o;
                    CellStatus cell = new CellStatus(type);
                    return cell;
                }
            }
        });

    }

    public void addRow(Object[] row) {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(row);
    }

    public void setVerticalScrollBar(ScrollBar scrollBar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getVerticalScrollBar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getViewport() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setCorner(String UPPER_RIGHT_CORNER, JPanel p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
