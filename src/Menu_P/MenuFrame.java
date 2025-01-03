package Menu_P;

//import java.awt.Container;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
//import javax.swing.JMenu;
//import javax.swing.JMenuBar;
//import javax.swing.JMenuItem;
//import javax.swing.JPanel;

//import javax.swing.JFrame;


class MenuFrame extends JFrame implements ActionListener{
    private JMenuItem info_p,participantes;
    private JMenuBar mibarra;
    private JMenuItem crear,salir,guardar,guardarcomo,consult_op1;
    private JMenu acerca;
    private JMenu archivo;
    private JMenu editar;
    private JMenu logo;
    private JLabel titulo1;

    private Formulario2 formularioPanel;

    public MenuFrame() {
        setLayout(null);
        setBounds(0, 0, 550, 400);

        DefaultTableModel modeloTabla = new DefaultTableModel();
// MenuLamina milamina = new MenuLamina();

// add(milamina);


        mibarra = new JMenuBar();

        archivo = new JMenu("Archivo");
        editar  = new JMenu("Editar");
        acerca  = new JMenu("Acerca de...");
        logo    = new JMenu(" ");

        crear = new JMenuItem("Nuevo");
        crear.addActionListener(this);

        salir = new JMenuItem("Salir");
        salir.addActionListener(this);

        guardar = new JMenuItem("Guardar");
        guardar.addActionListener(this);

        guardarcomo = new JMenuItem("Guardar como");
        guardarcomo.addActionListener(this);

        info_p = new JMenuItem("Informacion del Programa");
        info_p.addActionListener(this);

        participantes = new JMenuItem("Autores");
        participantes.addActionListener(this);

        JMenu consulta = new JMenu("Consulta");
        consult_op1 = new JMenuItem("Jugadores");
        consult_op1.addActionListener(this);
        JMenuItem consult_op2 = new JMenuItem("Equipos");
        JMenuItem consult_op3 = new JMenuItem("Arbitros");
        JMenuItem consult_op4 = new JMenuItem("Dirigentes");

        JMenuItem actualizar = new JMenuItem("Actualizar");
        JMenuItem borrar = new JMenuItem("Borrar");


        mibarra.add(logo);
        mibarra.add(archivo);
        mibarra.add(editar);
        mibarra.add(acerca);
        
        

        archivo.add(crear);
        archivo.add(salir);
        archivo.add(guardar);
        archivo.add(guardarcomo);
        

        editar.add(consulta);
        consulta.add(consult_op1);
        consulta.add(consult_op2);
        consulta.add(consult_op3);
        consulta.add(consult_op4);

        editar.add(actualizar);
        editar.add(borrar);
        

        acerca.add(info_p);
        acerca.add(participantes);
        



//mibarra.add(opciones );

        add(mibarra);

//Indicamos que es el menu por defecto
        setJMenuBar(mibarra);


        formularioPanel = new Formulario2(modeloTabla);
        add(formularioPanel);
    }

    public void actionPerformed(ActionEvent e){
// Container C=this.getContentPane();

        if(e.getSource()==crear){
            getContentPane().removeAll(); // Remover componentes anteriores
            formularioPanel.setBounds(0, 0, 550, 400);
            add(formularioPanel);
            revalidate();
            repaint();
        }
        if(e.getSource()==salir){
            System.exit(0);
        }

        if (e.getSource() == info_p) {
            // Mostrar un mensaje en pantalla
            JOptionPane.showMessageDialog(this, 
                " Programa de campeonato creado por el Grupo # \n Materia: Programacion Orientada a Objetos.",
                " Materia impartida por el Ing Crespo Mendoza Roberto",
                JOptionPane.INFORMATION_MESSAGE);
        }
        if (e.getSource() == participantes) {
            // Mostrar un mensaje en pantalla
            JOptionPane.showMessageDialog(this, 
                " Jose Agapito Hernandez Vega \n Miguel Eduardo Loyola Mora \n Gary Johao Zuñiga Saltos \n Cristhian Alejandro Gavilanes Sanchez \n Christian Alexander Bone Arias",
                " Autores",
                JOptionPane.INFORMATION_MESSAGE);
        }
        if (e.getSource() == consult_op1) {

            getContentPane().removeAll();  // Limpiar la ventana
            JTable tabla = new JTable(formularioPanel.getModeloTabla());
            JScrollPane scrollPane = new JScrollPane(tabla);
            scrollPane.setBounds(50, 50, 400, 200);
            add(scrollPane);  // Mostrar solo la tabla
            revalidate();
            repaint();
            titulo1 = new JLabel("DATOS DE LOS JUGADORES");
            titulo1.setBounds(150, 10, 200, 40);
            add(titulo1);
        }


    }
}

