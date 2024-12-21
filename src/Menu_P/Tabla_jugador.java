package Menu_P;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Tabla_jugador {
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scrollPane;

    public Tabla_jugador() {
        // Crear el modelo de la tabla
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Equipo");

        // Crear la tabla basada en el modelo
        tabla = new JTable(modeloTabla);
        scrollPane = new JScrollPane(tabla);
        scrollPane.setBounds(50, 100, 400, 80);
    }

    // Método para obtener el JScrollPane con la tabla
    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    // Método para agregar datos a la tabla
    public void agregarDatos(String nombre, String apellido,String equipo) {
        modeloTabla.addRow(new Object[]{nombre, apellido,equipo});
    }
}
