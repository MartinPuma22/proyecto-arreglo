package guis;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class DlgMatriculasRetiros extends JDialog {

    private final JPanel contentPanel = new JPanel();
    private JTextField txtCodigoMatricula, txtCodigoRetiro;
    private JButton btnConsultarMatricula, btnConsultarRetiro;
    private JTextArea txtArea;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            DlgMatriculasRetiros dialog = new DlgMatriculasRetiros();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Create the dialog.
     */
    public DlgMatriculasRetiros() {
        setTitle("Consulta | Matr�culas y Retiros");
        setBounds(100, 100, 600, 400);
        getContentPane().setLayout(null);

        // Etiqueta y campo de texto para c�digo de matr�cula
        JLabel lblCodigoMatricula = new JLabel("C�digo de Matr�cula:");
        lblCodigoMatricula.setBounds(20, 20, 150, 25);
        getContentPane().add(lblCodigoMatricula);

        txtCodigoMatricula = new JTextField();
        txtCodigoMatricula.setBounds(160, 20, 150, 25);
        getContentPane().add(txtCodigoMatricula);

        // Bot�n Consultar Matr�cula
        btnConsultarMatricula = new JButton("Consultar Matr�cula");
        btnConsultarMatricula.setBounds(330, 20, 170, 25);
        getContentPane().add(btnConsultarMatricula);

        // Etiqueta y campo de texto para c�digo de retiro
        JLabel lblCodigoRetiro = new JLabel("C�digo de Retiro:");
        lblCodigoRetiro.setBounds(20, 60, 150, 25);
        getContentPane().add(lblCodigoRetiro);

        txtCodigoRetiro = new JTextField();
        txtCodigoRetiro.setBounds(160, 60, 150, 25);
        getContentPane().add(txtCodigoRetiro);

        // Bot�n Consultar Retiro
        btnConsultarRetiro = new JButton("Consultar Retiro");
        btnConsultarRetiro.setBounds(330, 60, 170, 25);
        getContentPane().add(btnConsultarRetiro);

        // �rea de texto para mostrar informaci�n
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