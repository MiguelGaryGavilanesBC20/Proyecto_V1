package Menu_P;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

public class Formulario2 extends JPanel implements ActionListener {

    private JButton boton1;
    private JLabel label1, label2, label3;
    private JTextField texto1, texto2, texto3;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scrollPane;



    public Formulario2(DefaultTableModel modeloTabla ) {



        //setUndecorated(true);//eliminar botones de minimizar,maximizar,salir
        setLayout(null);


        label1 = new JLabel("Nombre");
        label1.setBounds(50, 20, 50, 20);
        add(label1);


        texto1 = new JTextField();
        texto1.setBounds(110, 20, 110, 20);
        add(texto1);


        label2 = new JLabel("Apellido");
        label2.setBounds(50, 50, 50, 20);
        add(label2);


        texto2 = new JTextField();
        texto2.setBounds(110, 50, 110, 20);
        add(texto2);


        label3 = new JLabel("Equipo");
        label3.setBounds(50, 80, 50, 20);
        add(label3);


        texto3 = new JTextField();
        texto3.setBounds(110, 80, 110, 20);
        add(texto3);


        boton1 = new JButton("Registrar");
        boton1.setBounds(300, 20, 100, 30);
        add(boton1);
        boton1.addActionListener(this);


        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Equipo");

        this.modeloTabla = modeloTabla;
        tabla = new JTable(modeloTabla);
        scrollPane = new JScrollPane(tabla);
        scrollPane.setBounds(40, 130, 420, 200);
        add(scrollPane);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) { //guardar

            String nombre = primeraletra(texto1.getText());
            String apellido = primeraletra(texto2.getText());
            String equipo = primeraletra(texto3.getText());


            if (nombre.isEmpty() || apellido.isEmpty() || equipo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error al agregar los datos", JOptionPane.ERROR_MESSAGE);
            } else {
                modeloTabla.addRow(new Object[]{nombre, apellido,equipo});
                //limpiar campos de texto
                texto1.setText("");
                texto2.setText("");
                texto3.setText("");
            }
        }

    }
    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }
    private String primeraletra(String palabra) {
        if (palabra == null || palabra.isEmpty()) {
            return palabra;
        }
        return palabra.substring(0, 1).toUpperCase() + palabra.substring(1).toLowerCase();
    }
}



