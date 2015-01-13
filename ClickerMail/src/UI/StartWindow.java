package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class StartWindow {

	private JFrame frmLogin;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartWindow window = new StartWindow();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StartWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 286, 266);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setBounds(23, 51, 61, 16);
		frmLogin.getContentPane().add(lblEmail);
		
		JLabel lblPasswort = new JLabel("Passwort :");
		lblPasswort.setBounds(23, 92, 75, 16);
		frmLogin.getContentPane().add(lblPasswort);
		
		textField = new JTextField();
		textField.setBounds(120, 45, 134, 28);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 86, 134, 28);
		frmLogin.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNochNichtRegistriert = new JLabel("Noch nicht registriert? Hier Registrieren.");
		lblNochNichtRegistriert.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNochNichtRegistriert.setBounds(33, 120, 228, 16);
		frmLogin.getContentPane().add(lblNochNichtRegistriert);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(23, 148, 231, 29);
		frmLogin.getContentPane().add(btnNewButton);
	}
}
