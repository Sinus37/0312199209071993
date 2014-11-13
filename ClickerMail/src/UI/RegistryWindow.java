package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class RegistryWindow extends JFrame {
	
	public int read = 1;

	private JPanel contentPane;
	private JTextField UserNameField;
	private JTextField EmailCheckField;
	private JLabel lblHinweisErneutLesen;
	private JButton btnWeiter;
	private JTextField EmailField;
	private JTextField PwField;
	private JTextField PwCheckField;
	
	String userName;
	String email;
	String emailCheck;
	String pw;
	String pwCheck;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
			    
				
				try {
					RegistryWindow frame = new RegistryWindow();
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
	public RegistryWindow() {	
		setTitle("Register");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		UserNameField = new JTextField();
		UserNameField.setBounds(92, 43, 195, 28);
		contentPane.add(UserNameField);
		UserNameField.setColumns(10);
		
		EmailCheckField = new JTextField();
		EmailCheckField.setBounds(92, 123, 195, 28);
		contentPane.add(EmailCheckField);
		EmailCheckField.setColumns(10);
		
		JLabel lblNutzername = new JLabel("Nutzername");
		lblNutzername.setBounds(6, 49, 84, 16);
		contentPane.add(lblNutzername);
		
		JLabel lblPasswort = new JLabel("Passwort");
		lblPasswort.setBounds(6, 169, 61, 16);
		contentPane.add(lblPasswort);
		
		lblHinweisErneutLesen = new JLabel("Hinweis erneut lesen");
		lblHinweisErneutLesen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Vorwort a = new Vorwort();
				a.setVisible(true);
			}
		});
		lblHinweisErneutLesen.setFont(new Font("Lao MN", Font.PLAIN, 9));
		lblHinweisErneutLesen.setBounds(218, 6, 92, 16);
		contentPane.add(lblHinweisErneutLesen);
		
		btnWeiter = new JButton("Weiter");
		btnWeiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO Prüfen auf Korrektheit der Eingaben
				
		// Check auf Füller 
				userName = UserNameField.getText();
				userNameFillCheck(userName);
				
				
		// Email check
				email = EmailField.getText();
				emailCheck = EmailCheckField.getText();
				if (email.equals(emailCheck)) {
					System.out.println("Email gleich");
				} else {
					System.out.println("Email verschieden");
					JOptionPane.showMessageDialog(null,"Die Emailadressen stimmen nicht überein!","Falsche Email", JOptionPane.PLAIN_MESSAGE);
				}
		// Passwort check
				if (PwField.getText() == "") {
					System.out.println("leer");
				} else {
				pw = PwField.getText();
				pwCheck = PwCheckField.getText();
				if (pw.equals(pwCheck)) {
					System.out.println("pw gleich");
				} else {
					System.out.println("pw verschieden");
					JOptionPane.showMessageDialog(null,"Die Passwörter stimmen nicht überein!","Falsche Email", JOptionPane.PLAIN_MESSAGE);
				}}
				
				
				// TODO Prüfen auf akzeptieren/lesen der Info
				if (Vorwort.getRead() == true) {
					System.out.println("akzeptiert");
				} else {
					JOptionPane.showMessageDialog(null,"Bitte den Hinweis lesen!","Erst lesen!", JOptionPane.PLAIN_MESSAGE);
					System.out.println("nicht akzeptiert");
				}
				dispose();
				
				
			}
		});
		btnWeiter.setBounds(6, 272, 281, 29);
		contentPane.add(btnWeiter);
		
		EmailField = new JTextField();
		EmailField.setBounds(92, 83, 195, 28);
		contentPane.add(EmailField);
		EmailField.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(6, 89, 44, 16);
		contentPane.add(lblEmail);
		
		PwField = new JTextField();
		PwField.setBounds(92, 163, 195, 28);
		contentPane.add(PwField);
		PwField.setColumns(10);
		
		PwCheckField = new JTextField();
		PwCheckField.setBounds(92, 203, 195, 28);
		contentPane.add(PwCheckField);
		PwCheckField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(6, 237, 281, 23);
		contentPane.add(chckbxNewCheckBox);
		
		

	}
	
	public void setRead(int stat) {
		read = stat;
	}
	
	public int getRead() {
		return read;
	}
	
	public boolean rightEmail(String adresse) {
		adresse = adresse.trim();

	     int at, dot, len = adresse.length();

	    // s nicht angegeben (oder nur Whitespaces), oder kein @ bzw .

	    if ( (len == 0) ||
	         ((at=adresse.indexOf('@')) == -1) || ((dot=adresse.lastIndexOf('.')) == -1) )
	      return false;

	    // keine EMailadresse vor @ Zeichen oder . vor &

	     if ( (at == 0) || (dot < at) )
	      return false;

	    // Mindestens zwei Zeichen für die Endung

	    return dot+2 < len;
	}
	
	public boolean userNameFillCheck(String name) {
		if (name == "") {
			System.out.println("leer");
			return false;
		} else {
			System.out.println("gefüllt");

		return true;
		}
	}
	
}
