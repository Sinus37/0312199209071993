package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterWindow extends JFrame {

	String email1;
	String email2;
	String pw1;
	String pw2;
	String userPasswort;
	String userEmail;
	boolean passwortIsEqual = false;
	boolean userIsEqual = false;
	boolean agbIsAccepted = false;
	
	/**
	 * 
	 */
	private JPanel contentPane;
	private JTextField emailFeld1;
	private JTextField emailFeld2;
	private JTextField pwFeld1;
	private JTextField pwFeld2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterWindow frame = new RegisterWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegisterWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 268, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setBounds(6, 34, 61, 16);
		contentPane.add(lblEmail);
		
		JLabel lblErneuteEmail = new JLabel("Erneute Email :");
		lblErneuteEmail.setBounds(6, 75, 93, 16);
		contentPane.add(lblErneuteEmail);
		
		emailFeld1 = new JTextField();
		emailFeld1.setBounds(115, 28, 134, 28);
		contentPane.add(emailFeld1);
		emailFeld1.setColumns(10);
		
		emailFeld2 = new JTextField();
		emailFeld2.setBounds(115, 69, 134, 28);
		contentPane.add(emailFeld2);
		emailFeld2.setColumns(10);
		
		pwFeld1 = new JTextField();
		pwFeld1.setBounds(115, 109, 134, 28);
		contentPane.add(pwFeld1);
		pwFeld1.setColumns(10);
		
		pwFeld2 = new JTextField();
		pwFeld2.setBounds(115, 149, 134, 28);
		contentPane.add(pwFeld2);
		pwFeld2.setColumns(10);
		
		JLabel lblPasswort = new JLabel("Passwort :");
		lblPasswort.setBounds(6, 115, 93, 16);
		contentPane.add(lblPasswort);
		
		JLabel lblPasswortWdh = new JLabel("Passwort Wdh :");
		lblPasswortWdh.setBounds(6, 155, 97, 16);
		contentPane.add(lblPasswortWdh);
		
		JCheckBox checkFeld = new JCheckBox("Nutzungsbedingungen bestätigen");
		checkFeld.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		checkFeld.setBounds(16, 189, 233, 23);
		contentPane.add(checkFeld);
		
		JButton btnNewButton = new JButton("Registrieren");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * Passwort erstellen und auf Gleichheit prüfen
				 * Passwortkriterien:
				 * Länge:				?
				 * Zusammensetzung: 	?
				 */
				if (pwFeld1.getText().equals(pwFeld2.getText())) {
					userPasswort = pwFeld1.getText();
					System.out.println("Die Passwörter stimmen überein.");
					System.out.println("Das Passwort ist : " + userPasswort);
					passwortIsEqual = true;
				} else {
					System.out.println("Die Passwörter stimmen nicht überein");
				}
				
				
				/**
				 * User erstellen und auf Gleichheit prüfen
				 */
				if (emailFeld1.getText().equals(emailFeld2.getText())) {
					userEmail = pwFeld1.getText();
					System.out.println("Die Usernamen stimmen überein.");
					System.out.println("Der Username ist : " + userEmail);
					userIsEqual = true;
				} else {
					System.out.println("Die Usernamen stimmen nicht überein");
				}
				
				
				/**
				 * Akzeptanz der Bedingungen testen
				 */
				if (checkFeld.isSelected()) {
					System.out.println("AGBs akzeptiert");
					agbIsAccepted = true;
				} else {
					System.out.println("AGBs nicht akzeptiert");
				}
				
				
				
			}
		});
		btnNewButton.setBounds(6, 224, 243, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblAgbs = new JLabel("AGBs");
		lblAgbs.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		lblAgbs.setBounds(234, 6, 28, 16);
		contentPane.add(lblAgbs);
	}
}
