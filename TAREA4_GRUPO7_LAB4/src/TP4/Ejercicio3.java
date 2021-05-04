package TP4;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Checkbox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtHoras;
	ButtonGroup btnGroupSO;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Ejercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(30, 11, 410, 72);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Elije un sistema operativo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 26, 175, 23);
		panel.add(lblNewLabel);
		
		btnGroupSO = new ButtonGroup();
		
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setBounds(191, 28, 69, 23);
		panel.add(rdbtnWindows);
		btnGroupSO.add(rdbtnWindows);
		
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setBounds(275, 28, 57, 23);
		panel.add(rdbtnMac);
		btnGroupSO.add(rdbtnMac);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setBounds(334, 28, 57, 23);
		panel.add(rdbtnLinux);
		btnGroupSO.add(rdbtnLinux);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(30, 95, 410, 123);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblEspecialidad = new JLabel("Elije una especialidad");
		lblEspecialidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEspecialidad.setBounds(52, 40, 149, 33);
		panel_1.add(lblEspecialidad);
		
		Checkbox checkboxProgramacion = new Checkbox("Programacion");
		checkboxProgramacion.setBounds(241, 14, 95, 22);
		panel_1.add(checkboxProgramacion);
		
		Checkbox checkboxAdministracion = new Checkbox("Administracion");
		checkboxAdministracion.setBounds(241, 50, 95, 22);
		panel_1.add(checkboxAdministracion);
		
		Checkbox checkboxDisenoGrafico = new Checkbox("Dise\u00F1o Grafico");
		checkboxDisenoGrafico.setBounds(241, 86, 95, 22);
		panel_1.add(checkboxDisenoGrafico);
		
		JLabel lblHoras = new JLabel("Cantidad de horas en el computador:");
		lblHoras.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHoras.setBounds(30, 240, 242, 21);
		contentPane.add(lblHoras);
		
		txtHoras = new JTextField();
		txtHoras.setBounds(282, 242, 69, 20);
		contentPane.add(txtHoras);
		txtHoras.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAceptar.setBounds(351, 283, 89, 23);
		contentPane.add(btnAceptar);
		
		
	}
}
