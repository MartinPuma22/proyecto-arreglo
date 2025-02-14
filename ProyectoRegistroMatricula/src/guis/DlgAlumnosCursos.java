package guis;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class DlgAlumnosCursos extends JDialog {

    private JTextField txtCodigoAlumno;
    private JButton btnConsultar;
    private JTable tblCursos;
    private JTextArea txtDatosAlumno;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            DlgAlumnosCursos dialog = new DlgAlumnosCursos();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Create the dialog.
     */
    public DlgAlumnosCursos() {
        setTitle("Consulta | Alumnos y Cursos");
        setBounds(100, 100, 700, 500);
        getContentPane().setLayout(null);

        // Etiqueta y campo de texto para el código del alumno
        JLabel lblCodigoAlumno = new JLabel("Código de Alumno:");
        lblCodigoAlumno.setBounds(20, 20, 140, 25);
        getContentPane().add(lblCodigoAlumno);

        txtCodigoAlumno = new JTextField();
        txtCodigoAlumno.setBounds(160, 20, 150, 25);
        getContentPane().add(txtCodigoAlumno);

        // Botón Consultar
        btnConsultar = new JButton("Consultar");
        btnConsultar.setBounds(330, 20, 120, 25);
        getContentPane().add(btnConsultar);

        // Área de texto para mostrar información del alumno
        JLabel lblDatosAlumno = new JLabel("Datos del Alumno:");
        lblDatosAlumno.setBounds(20, 60, 140, 25);
        getContentPane().add(lblDatosAlumno);

        txtDatosAlumno = new JTextArea();
        txtDatosAlumno.setEditable(false);
        txtDatosAlumno.setLineWrap(true);
        txtDatosAlumno.setWrapStyleWord(true);
        JScrollPane scrollAlumno = new JScrollPane(txtDatosAlumno);
        scrollAlumno.setBounds(20, 90, 640, 100);
        getContentPane().add(scrollAlumno);

        // Tabla para mostrar los cursos matriculados
        JLabel lblCursos = new JLabel("Cursos Matriculados:");
        lblCursos.setBounds(20, 200, 140, 25);
        getContentPane().add(lblCursos);

        tblCursos = new JTable(new DefaultTableModel(
                new Object[][]{},
                new String[]{"Código Curso", "Nombre Curso", "Créditos", "Horas"}
        ));
        JScrollPane scrollCursos = new JScrollPane(tblCursos);
        scrollCursos.setBounds(20, 230, 640, 200);
        getContentPane().add(scrollCursos);

        // Botón para cerrar (opcional)
        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.setBounds(570, 440, 90, 25);
        getContentPane().add(btnCerrar);

        // Acción para cerrar el diálogo
        btnCerrar.addActionListener(e -> dispose());
    }
}