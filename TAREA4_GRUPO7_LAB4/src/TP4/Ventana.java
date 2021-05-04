package TP4;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	Ejercicio1 ej = new Ejercicio1();
	Ejercicio3 ej3 = new Ejercicio3();
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("GRUPO NRO: 7");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBackground(Color.BLACK);
		lblTitulo.setBounds(20, 11, 134, 27);
		contentPane.add(lblTitulo);
		
		/////////////// ejercicio 1 /////////////////
		JButton btnEjercicio1 = new JButton("Ejercicio 1");
		btnEjercicio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ej.setVisible(true);
				
				
			}
		});
		btnEjercicio1.setBackground(Color.LIGHT_GRAY);
		btnEjercicio1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEjercicio1.setBounds(144, 49, 122, 33);
		contentPane.add(btnEjercicio1);
		
		
		
		//////////////////// ejercicio3 ///////////////
		JButton btnEjercicio3 = new JButton("Ejercicio 3");
		btnEjercicio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ej3.setVisible(true);
			}
		});
		btnEjercicio3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEjercicio3.setBackground(Color.LIGHT_GRAY);
		btnEjercicio3.setBounds(144, 162, 122, 33);
		contentPane.add(btnEjercicio3);
	}
}
