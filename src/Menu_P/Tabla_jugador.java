import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Tabla_jugador extends JPanel {
    public Tabla_jugador(DefaultTableModel modeloTabla) {
        setLayout(null);
        JTable tabla = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setBounds(50, 50, 450, 300);
        add(scrollPane);
    }
}