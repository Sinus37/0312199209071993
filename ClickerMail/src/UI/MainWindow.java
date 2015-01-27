package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.mail.MessagingException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Email.EmailIMAP;

import javax.swing.JMenuBar;

import java.awt.Component;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenu;
import javax.swing.JScrollPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class MainWindow extends JFrame {
	
	String user;
	String pw;
	int anzahlUngeleseneEmails;

	private JPanel contentPane;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 398);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnDatei = new JMenu("Datei");
		menuBar.add(mnDatei);
		
		JMenuItem mntmBla = new JMenuItem("bla");
		mnDatei.add(mntmBla);
		
		JMenuItem mntmBeenden = new JMenuItem("Beenden");
		mntmBeenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		mnDatei.add(mntmBeenden);
		
		JMenu mnProvider = new JMenu("Provider");
		menuBar.add(mnProvider);
		
		JMenuItem mntmRegistrieren = new JMenuItem("Registrieren");
		mnProvider.add(mntmRegistrieren);
		
		JMenuItem mntmEinloggen = new JMenuItem("Einloggen");
		mnProvider.add(mntmEinloggen);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel AnzahlEMails = new JLabel("");
		AnzahlEMails.setBounds(30, 175, 421, 16);
		
		JButton LoginButton = new JButton("Einloggen ins Postfach");
		LoginButton.setBounds(20, 145, 303, 29);
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnzahlEMails.setText("Einloggen läuft... Bitte Warten");
				System.out.println("Einloggen läuft");
				anzahlUngeleseneEmails = login(getUser(), getPw());
				AnzahlEMails.setText("Sie haben " + anzahlUngeleseneEmails + " Emails");
//				LoginButton.setVisible(false);
				LoginButton.setEnabled(false);
				LoginButton.setLabel("Penis");
			}
		});
		contentPane.setLayout(null);
		contentPane.add(AnzahlEMails);
		contentPane.add(LoginButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Alle Provider");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(6, 6, 167, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Ausgwählte Provider");
		rdbtnNewRadioButton_1.setBounds(191, 6, 167, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		ButtonGroup providerWahl = new ButtonGroup();
		providerWahl.add(rdbtnNewRadioButton);
		providerWahl.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton = new JButton("Frame Test");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JEditorPane website;
				try {
					website = new JEditorPane("http://www.facebook.com/");
					website.setEditable(false);

			        JFrame frame = new JFrame("Google");
			        frame.getContentPane().add(new JScrollPane(website));
			        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        frame.setVisible(true);
			        frame.pack();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        
			}
		});
		btnNewButton.setBounds(457, 145, 117, 29);
		contentPane.add(btnNewButton);
	}

	public void start(String string, String string2) {
		setUser(string);
		setPw(string2);
		System.out.println("User: " + string + "  Passwort: " + string2);
		
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public int login(String user, String pw){
		EmailIMAP getMail = new EmailIMAP(user, pw);
		try {
			anzahlUngeleseneEmails = getMail.login(user, pw);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return anzahlUngeleseneEmails;
	}
}
