package br.sc.senac.dd.aula6.exercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInserir {

	private JFrame frame;
	private JTextField txtID;
	private JTextField txtNome;
	private JTextField txtCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInserir window = new TelaInserir();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaInserir() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(73, 86, 46, 14);
		frame.getContentPane().add(lblId);
		
		txtID = new JTextField();
		txtID.setBounds(73, 99, 276, 20);
		frame.getContentPane().add(txtID);
		txtID.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(73, 130, 46, 14);
		frame.getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(73, 145, 276, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(73, 176, 46, 14);
		frame.getContentPane().add(lblCpf);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(73, 190, 276, 20);
		frame.getContentPane().add(txtCPF);
		txtCPF.setColumns(10);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "ID: "+txtID.getText() );
				JOptionPane.showMessageDialog(null, "Nome: "+txtNome.getText() );
				JOptionPane.showMessageDialog(null, "CPF: "+txtCPF.getText() );
			}
		});
		btnFinalizar.setBounds(322, 227, 89, 23);
		frame.getContentPane().add(btnFinalizar);
	}
}
