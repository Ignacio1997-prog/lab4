package TP4;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class Ejercicio1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	

	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFechaNac;
	private JButton btnMostrar;
	private JLabel lblDatos;
	boolean estado = true;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Ejercicio1() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 471, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(63, 41, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(63, 95, 46, 14);
		contentPane.add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(63, 151, 60, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblFechaNac = new JLabel("Fecha Nac.");
		lblFechaNac.setBounds(44, 207, 79, 14);
		contentPane.add(lblFechaNac);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(161, 36, 140, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(161, 92, 140, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(161, 148, 140, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtFechaNac = new JTextField();
		txtFechaNac.setBounds(161, 204, 140, 20);
		contentPane.add(txtFechaNac);
		txtFechaNac.setColumns(10);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDatos.setText("Los datos ingresados fueron: ");
				if((txtNombre.getText().length() == 0) || (txtApellido.getText().length() == 0) || (txtTelefono.getText().length() == 0) || (txtFechaNac.getText().length() == 0)) {
				if(txtNombre.getText().length() == 0) {
					txtNombre.setBackground(Color.red);
				}
				if(txtApellido.getText().length() == 0) {
					txtApellido.setBackground(Color.red);
				}
				if(txtTelefono.getText().length() == 0) {
					txtTelefono.setBackground(Color.red);
				}
				if(txtFechaNac.getText().length() == 0) {
					txtFechaNac.setBackground(Color.red);
				}
				lblDatos.setText("Los datos ingresados fueron: ");
				}else {
					txtNombre.setBackground(Color.white);
					txtApellido.setBackground(Color.white);
					txtTelefono.setBackground(Color.white);
					txtFechaNac.setBackground(Color.white);
				lblDatos.setText(lblDatos.getText()+" "+txtNombre.getText()+", "+txtApellido.getText()+", "+txtTelefono.getText()+", "+txtFechaNac.getText());
					txtNombre.setText("");
					txtApellido.setText("");
					txtTelefono.setText("");
					txtFechaNac.setText("");
				}
			}
		});
		btnMostrar.setBounds(308, 238, 89, 23);
		contentPane.add(btnMostrar);
		
		lblDatos = new JLabel("Los datos ingresados fueron: ");
		lblDatos.setBounds(10, 284, 435, 30);
		contentPane.add(lblDatos);
	}
	
}
