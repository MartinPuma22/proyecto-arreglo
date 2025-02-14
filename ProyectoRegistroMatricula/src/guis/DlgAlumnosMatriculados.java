package guis;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class DlgAlumnosMatriculados extends JDialog {

    private final JPanel contentPanel = new JPanel();
    private JButton btnConsultarMatricula;
    private JTextArea txtArea;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            DlgAlumnosMatriculados dialog = new DlgAlumnosMatriculados();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Create the dialog.
     */
    public DlgAlumnosMatriculados() {
        setTitle("Reporte | Alumnos con matriculados por curso");
        setBounds(100, 100, 600, 400);
        getContentPane().setLayout(null);

        // Etiqueta y campo de texto para código de matrícula
        JLabel lblCodigoMatricula = new JLabel("Alumnos matriculados");
        lblCodigoMatricula.setBounds(20, 37, 134, 25);
        getContentPane().add(lblCodigoMatricula);

        // Botón Consultar Matrícula
        btnConsultarMatricula = new JButton("Generar Reporte");
        btnConsultarMatricula.setBounds(157, 37, 170, 25);
        getContentPane().add(btnConsultarMatricula);

        // Área de texto para mostrar información
        txtArea = new JTextArea();
        txtArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtArea);
        scrollPane.setBounds(20, 110, 540, 200);
        getContentPane().add(scrollPane);

        // Panel de botones (Opcional)
        JPanel buttonPane = new JPanel();
        buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
        buttonPane.setBounds(0, 330, 600, 35);
        getContentPane().add(buttonPane);
    }
}