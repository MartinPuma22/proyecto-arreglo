package guis;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import java.awt.*;

public class DlgRetiro extends JDialog implements ActionListener
{	private JLabel lblNumRetiro;
	private JLabel lblNumMatricula;
	private JLabel lblHora;
	private JLabel lblFecha;
	private JTextField txtNumRetiro;
	private JTextField txtNumMatricula;
	private JTextField txtHora;
	private JTextField txtFecha;
	private JComboBox <String> cmbOperacion;
	private JButton btnGrabar;
	private JScrollPane scrollPane;
	private JTable tblMatricula;
	private DefaultTableModel modelo;
	/**
	 * Launch the application.
	 */

    public static void main(String[] args) {
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
		        try {
		            DlgRetiro dialog = new DlgRetiro();
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
    public DlgRetiro() {
    	setResizable(false);
        setTitle("Registro | Retiro");
        setBounds(100, 100, 810, 610);
        getContentPane().setLayout(null);

        lblNumRetiro = new JLabel("N� Retiro");
		lblNumRetiro.setBounds(21, 11, 50, 23);
		getContentPane().add(lblNumRetiro);
		
		lblNumMatricula = new JLabel("N� Matr�cula");
		lblNumMatricula.setBounds(21, 38, 70, 23);
		getContentPane().add(lblNumMatricula);
	
		lblHora = new JLabel("Hora");
		lblHora.setBounds(21, 91, 99, 23);
		getContentPane().add(lblHora);
		
		lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(21, 64, 99, 23);
		getContentPane().add(lblFecha);
		
		txtNumRetiro = new JTextField("");
		txtNumRetiro.setBounds(131, 11, 86, 23);
		getContentPane().add(txtNumRetiro);
		txtNumRetiro.setColumns(10);

		txtNumMatricula = new JTextField();
		txtNumMatricula.setBounds(131, 37, 178, 23);
		getContentPane().add(txtNumMatricula);
		txtNumMatricula.setColumns(10);
		
		txtHora = new JTextField();
		txtHora.setBounds(131, 88, 86, 23);
		getContentPane().add(txtHora);
		txtHora.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(131, 64, 86, 20);
		getContentPane().add(txtFecha);
		txtFecha.setColumns(10);

		cmbOperacion = new JComboBox <String> ();
		cmbOperacion.addActionListener(this);
		cmbOperacion.setModel(new DefaultComboBoxModel(new String[] {"Adicionar", "Consultar", "Modificar", "Eliminar"}));
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
		modelo.addColumn("N� RETIRO");
		modelo.addColumn("N� MATRICULA");
		modelo.addColumn("FECHA");
		modelo.addColumn("HORA");
		tblMatricula.setModel(modelo);
		
		ajustarAnchoColumnas();
		listar();
    }
//  Declaraci�n global

	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(arg0);
		}
		if (arg0.getSource() == cmbOperacion) {
			actionPerformedCmbOperacion(arg0);
		}
	}
	protected void actionPerformedCmbOperacion(ActionEvent arg0) {
		
		
	}
	protected void actionPerformedBtnGrabar(ActionEvent arg0) 
	{
		
	}
	//  M�todos tipo void (sin par�metros)
	void ajustarAnchoColumnas() 
	{	TableColumnModel tcm = tblMatricula.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(anchoColumna( 6));  // numRetiro
		tcm.getColumn(1).setPreferredWidth(anchoColumna(30));  // numMatr�cula
		tcm.getColumn(2).setPreferredWidth(anchoColumna( 8));  // fecha
		tcm.getColumn(3).setPreferredWidth(anchoColumna( 8));  // hora	
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