package UI;

import java.awt.EventQueue;

import javax.mail.MessagingException;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;

import Email.EmailIMAP;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class StartWindow {

	private JFrame frmAidoas;
	private JTextField NameField;
	private JTextField PwField;
	
	public static String Username;
	public String Pw;
	public String Email;

	/**
	 * Launch the application.
	 */

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartWindow window = new StartWindow();
					window.frmAidoas.setVisible(true);
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
		frmAidoas = new JFrame();
		frmAidoas.setTitle("Welcome to ClickMail");
		frmAidoas.setBounds(100, 100, 226, 374);
		frmAidoas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAidoas.getContentPane().setLayout(null);
		
		JButton btnJapplet = new JButton("Login");
		btnJapplet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setUsername(NameField.getText());
				setPw(PwField.getText());
				//EmailIMAP imap = new EmailIMAP(getUsername(),getPw());
				EmailIMAP mail = new EmailIMAP("cfmap14@googlemail.com", "ClickMailer1!");
				//try {
				//	mail.run();
			//	} catch (NullPointerException | IOException
			//			| MessagingException e) {
					// TODO Auto-generated catch block
			//		e.printStackTrace();
			//	}
				MainWindow main = new MainWindow(123);
				main.setVisible(true);
				
		
				
			}
		});
		btnJapplet.setBounds(6, 157, 211, 29);
		frmAidoas.getContentPane().add(btnJapplet);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(102, 23, 54, 16);
		frmAidoas.getContentPane().add(lblLogin);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(6, 57, 61, 16);
		frmAidoas.getContentPane().add(lblName);
		
		JLabel lblPasswort = new JLabel("Passwort:");
		lblPasswort.setBounds(6, 101, 61, 16);
		frmAidoas.getContentPane().add(lblPasswort);
		
		NameField = new JTextField();
		NameField.setBounds(79, 51, 138, 28);
		frmAidoas.getContentPane().add(NameField);
		NameField.setColumns(10);
		
		PwField = new JTextField();
		PwField.setBounds(79, 95, 138, 28);
		frmAidoas.getContentPane().add(PwField);
		PwField.setColumns(10);
		
		JLabel lblNochNichtRegistriert = new JLabel("Noch nicht Registriert? Hier Registrieren");
		lblNochNichtRegistriert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				RegistryWindow regisgter = new RegistryWindow();
				regisgter.setVisible(true);
				Vorwort vor = new Vorwort();
				vor.setVisible(true);

			}
		});
		lblNochNichtRegistriert.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		lblNochNichtRegistriert.setBounds(24, 129, 194, 16);
		frmAidoas.getContentPane().add(lblNochNichtRegistriert);
	}

	public static String getUsername() {
		return Username;
	}

	public static void setUsername(String username) {
		Username = username;
	}

	public String getPw() {
		return Pw;
	}

	public void setPw(String pw) {
		Pw = pw;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
}
