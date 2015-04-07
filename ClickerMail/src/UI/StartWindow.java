package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartWindow {

	private JFrame frmLogin;
	private JTextField emailField;
	private JTextField pwField;
	String userLoginEmail;
	String userLoginPw;

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
		RegisterWindow reg = new RegisterWindow();
		MainWindow main = new MainWindow();

		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 286, 292);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setBounds(23, 51, 61, 16);
		frmLogin.getContentPane().add(lblEmail);
		
		JLabel lblPasswort = new JLabel("Passwort :");
		lblPasswort.setBounds(23, 92, 75, 16);
		frmLogin.getContentPane().add(lblPasswort);
		
		emailField = new JTextField();
		emailField.setBounds(120, 45, 134, 28);
		frmLogin.getContentPane().add(emailField);
		emailField.setColumns(10);
		
		pwField = new JTextField();
		pwField.setBounds(120, 86, 134, 28);
		frmLogin.getContentPane().add(pwField);
		pwField.setColumns(10);
		
		JLabel lblNochNichtRegistriert = new JLabel("Noch nicht registriert? Hier Registrieren.");
		lblNochNichtRegistriert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				reg.setVisible(true);
			}
		});
		lblNochNichtRegistriert.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNochNichtRegistriert.setBounds(33, 120, 228, 16);
		frmLogin.getContentPane().add(lblNochNichtRegistriert);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userLoginEmail = emailField.getText();
				System.out.println("Anmeldeemail : " + userLoginEmail);
				userLoginPw = pwField.getText();
				System.out.println("Anmeldepasswort : " + userLoginPw);
				setUserLoginEmail(userLoginEmail);
				setUserLoginPw(userLoginPw);	
				main.setVisible(true);
				//main.start(userLoginEmail, userLoginPw);
				frmLogin.setVisible(false);
			}
		});
		btnNewButton.setBounds(23, 148, 231, 29);
		frmLogin.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Beenden");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(23, 181, 231, 29);
		frmLogin.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MasterLogin Muhahaha");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.setVisible(true);
				//main.start("cfmap14@googlemail.com", "ClickMailer1!");
				frmLogin.setVisible(false);
				
			}
		});
		btnNewButton_2.setBounds(23, 211, 231, 29);
		frmLogin.getContentPane().add(btnNewButton_2);
	}

	public String getUserLoginEmail() {
		return userLoginEmail;
	}

	public void setUserLoginEmail(String userLoginEmail) {
		this.userLoginEmail = userLoginEmail;
	}

	public String getUserLoginPw() {
		return userLoginPw;
	}

	public void setUserLoginPw(String userLoginPw) {
		this.userLoginPw = userLoginPw;
	}
	

}
