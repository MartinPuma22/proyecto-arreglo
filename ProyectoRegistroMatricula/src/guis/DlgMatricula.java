package guis;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import java.awt.*;

public class DlgMatricula extends JDialog implements ActionListener
{	private JLabel lblNumMatricula;
	private JLabel lblCodAlumno;
	private JLabel lblFecha;
	private JLabel lblCodCurso;
	private JTextField txtNumMatricula;
	private JTextField txtCodAlumno;
	private JTextField txtFecha;
	private JTextField txtCodCurso;
	private JComboBox <String> cmbOperacion;
	private JButton btnGrabar;
	private JScrollPane scrollPane;
	private JTable tblMatricula;
	private DefaultTableModel modelo;
	private JTextField txtHora;
	/**
	 * Launch the application.
	 */

    public static void main(String[] args) {
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
		        try {
		            DlgMatricula dialog = new DlgMatricula();
		            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		            dialog.setVisible(true);
		        } 
		        catch (Exception e) {
		            e.printStackTrace();
		        }
			}
    	});				
    }
    /**
	 * Create the dialog.
	 */
    public DlgMatricula() {
    	setResizable(false);
        setTitle("Registro | Matr�cula");
        setBounds(100, 100, 810, 610);
        getContentPane().setLayout(null);

        lblNumMatricula = new JLabel("N� Matr�cula");
		lblNumMatricula.setBounds(21, 11, 99, 23);
		getContentPane().add(lblNumMatricula);
		
		lblCodAlumno = new JLabel("C�digo Alumno");
		lblCodAlumno.setBounds(21, 38, 99, 23);
		getContentPane().add(lblCodAlumno);
	
		lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(21, 91, 99, 23);
		getContentPane().add(lblFecha);
		
		lblCodCurso = new JLabel("C�digo Curso");
		lblCodCurso.setBounds(21, 64, 99, 23);
		getContentPane().add(lblCodCurso);
		
		txtNumMatricula = new JTextField("");
		txtNumMatricula.setBounds(131, 11, 86, 23);
		getContentPane().add(txtNumMatricula);
		txtNumMatricula.setColumns(10);

		txtCodAlumno = new JTextField();
		txtCodAlumno.setBounds(131, 37, 178, 23);
		getContentPane().add(txtCodAlumno);
		txtCodAlumno.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(131, 88, 86, 23);
		getContentPane().add(txtFecha);
		txtFecha.setColumns(10);
		
		txtCodCurso = new JTextField();
		txtCodCurso.setBounds(131, 64, 86, 20);
		getContentPane().add(txtCodCurso);
		txtCodCurso.setColumns(10);

		cmbOperacion = new JComboBox <String> ();
		cmbOperacion.addActionListener(this);
		cmbOperacion.setModel(new DefaultComboBoxModel <String>
							 (new String[] {"Adicionar", "Consultar", "Modificar", "Eliminar"}));
		cmbOperacion.setBounds(669, 11, 99, 23);
		getContentPane().add(cmbOperacion);
	
		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(668, 111, 100, 23);
		getContentPane().add(btnGrabar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 145, 775, 415);
		getContentPane().add(scrollPane);
		
		tblMatricula = new JTable();
		tblMatricula.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblMatricula);

		modelo = new DefaultTableModel();
		modelo.addColumn("N� MATR�CULA");
		modelo.addColumn("COD ALUMNO");
		modelo.addColumn("COD CURSO");
		modelo.addColumn("FECHA");
		modelo.addColumn("HORA");
		tblMatricula.setModel(modelo);		
		
		txtHora = new JTextField();
		txtHora.setColumns(10);
		txtHora.setBounds(131, 115, 86, 23);
		getContentPane().add(txtHora);
		
		JLabel lblHora = new JLabel("Hora");
		lblHora.setBounds(21, 117, 110, 23);
		getContentPane().add(lblHora);
		
		ajustarAnchoColumnas();
		listar();
    }
//  Declaraci�n global

	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(arg0);
		}
		if (arg0.getSource() == cmbOperacion) {
			actionPerformedCboOperacion(arg0);
		}
	}
	protected void actionPerformedCboOperacion(ActionEvent arg0) {
		
		
	}
	protected void actionPerformedBtnGrabar(ActionEvent arg0) 
	{
		
	}
	//  M�todos tipo void (sin par�metros)
	void ajustarAnchoColumnas() 
	{	TableColumnModel tcm = tblMatricula.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(anchoColumna( 6));  // codigo
		tcm.getColumn(1).setPreferredWidth(anchoColumna(15));  // nombres y apellidos
		tcm.getColumn(2).setPreferredWidth(anchoColumna(10));  // dni/ce
		tcm.getColumn(3).setPreferredWidth(anchoColumna(10));  // sexo
		tcm.getColumn(4).setPreferredWidth(anchoColumna(10));  // edad			
	}
	void listar() {
		
	}


	public void setModal(boolean b) {
		// TODO Auto-generated method stub
		
	}
//  M�todos que retornan valor (con par�metros)
	int anchoColumna(int porcentaje) {
		return porcentaje * scrollPane.getWidth() / 100;
	}
	double ajustar(double numero) {
		return (int)(numero * 10) / 10.0;
	}
	int confirmar(String s) {
		return JOptionPane.showConfirmDialog(this, s, "Alerta", 0, 1, null);
	}
}