package UI;

import java.awt.BorderLayout;
<<<<<<< HEAD
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;


public class MainWindow extends JFrame {
=======
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

	
>>>>>>> develop
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

<<<<<<< HEAD
	
	public MainWindow() {
		String[] providerList = new String[]{"a", "b", "c", "s", "e","f", "g", "h", "i", "j","k", "l", "m", "n", "o", "b", "c", "s", "e","f", "g", "h", "i", "j","k", "l", "m", "n", "o", "b", "c", "s", "e","f", "g", "h", "i", "j","k", "l", "m", "n", "o"};
		frameErzeugen();
		menuErzeugen();
		northPanelErzeugen();
		southPanelErzeugen();
		westPanelErzeugen();
		centerPanelErzeugen();
		eastPanelErzeugen(providerList);

		
	}
	
	private void centerNorthPanelErzeugen(JPanel cn) {
		/**
		 * Create the Center North Panel.
		 * Add two Radiobuttons "Alle Provider" and " Providerauswahl"
		 */	
		JPanel centerNorthPanel = new JPanel();		
		cn.add(centerNorthPanel, BorderLayout.NORTH);
		centerNorthPanel.setBackground(new Color(175, 238, 238));
		centerNorthPanel.setVisible(true);		
				
	    ButtonGroup bG = new ButtonGroup();
		JRadioButton alleProviderRadio = new JRadioButton("Alle Provider");
		alleProviderRadio.setSelected(true);
		centerNorthPanel.add(alleProviderRadio);
		JRadioButton providerAuswahlRadio = new JRadioButton("Providerauswahl");
		centerNorthPanel.add(providerAuswahlRadio);
		bG.add(alleProviderRadio);
		bG.add(providerAuswahlRadio);
	}
	
	


	private void westPanelErzeugen() {
		/**
		 * Create the West Panel.
		 */	
		JPanel westPanel = new JPanel();		
		getContentPane().add(westPanel, BorderLayout.WEST);
		westPanel.setLayout(new FlowLayout());
		westPanel.setBackground(Color.GRAY);
		westPanel.setVisible(true);		
	}


	private void centerPanelErzeugen() {
		/**
		 * Create the Center Panel.
		 */	
		JPanel centerPanel = new JPanel();		
		getContentPane().add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new BorderLayout());
		centerPanel.setBackground(Color.WHITE);
		centerPanel.setVisible(true);	
//		centerNorthPanelErzeugen(centerPanel);
//		centerCenterPanelErzeugen(centerPanel);
//		centerEastPanelErzeugen(centerPanel);
//		centerSouthPanelErzeugen(centerPanel);
//		centerWestPanelErzeugen(centerPanel);
	
	}


	private void centerSouthPanelErzeugen(JPanel cs) {
		/**
		 * Create the Center South North Panel.
		 */	
		JPanel centerSouthPanel = new JPanel();		
		cs.add(centerSouthPanel, BorderLayout.SOUTH);
		centerSouthPanel.setBackground(new Color(175, 238, 238));
		centerSouthPanel.setVisible(true);		
	}


	private void centerWestPanelErzeugen(JPanel cw) {
		/**
		 * Create the Center North West Panel.
		 */	
		JPanel centerwestPanel = new JPanel();		
		cw.add(centerwestPanel, BorderLayout.WEST);
		centerwestPanel.setBackground(new Color(135, 206, 235));
		centerwestPanel.setVisible(true);		
	}


	private void centerEastPanelErzeugen(JPanel ce) {
		/**
		 * Create the Center East Panel.
		 */	
		JPanel centerEastPanel = new JPanel();		
		ce.add(centerEastPanel, BorderLayout.EAST);
		centerEastPanel.setBackground(new Color(135, 206, 235));
		centerEastPanel.setVisible(true);		
	}


	private void southPanelErzeugen() {
		/**
		 * Create the South Panel.
		 */	
		JPanel southPanel = new JPanel();		
		getContentPane().add(southPanel, BorderLayout.SOUTH);
		southPanel.setLayout(new FlowLayout());
		southPanel.setBackground(Color.LIGHT_GRAY);
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(Color.GRAY);
		southPanel.add(progressBar);
		southPanel.setVisible(true);		
	}


	private void eastPanelErzeugen(String[] providerList) {

		/**
		 * Create the East Panel.
		 */	
		JPanel eastPanel = new JPanel();		
		getContentPane().add(eastPanel, BorderLayout.EAST);
		eastPanel.setLayout(new BorderLayout());
		eastPanel.setBackground(Color.GRAY);
		eastPanel.setVisible(true);		
		eastPanel.add(new CheckBoxGroup(providerList));

	}


	private void northPanelErzeugen() {
		/**
		 * Create the North Panel.
		 */	
		JPanel northPanel = new JPanel();		
		getContentPane().add(northPanel, BorderLayout.NORTH);
		northPanel.setLayout(new FlowLayout());
		northPanel.setBackground(Color.LIGHT_GRAY);
		
		JLabel eingeloggtAlsLabel = new JLabel("Eingeloggt als:");
		eingeloggtAlsLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		northPanel.add(eingeloggtAlsLabel);
		
		JLabel eMailLabel = new JLabel("eMail");
		eMailLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		northPanel.add(eMailLabel);
		northPanel.setVisible(true);
				
	}

	
	public void frameErzeugen() {
		/**
		 * Create the frame.
		 */		
		setTitle("Willkommen beim ClickMailer");		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 418);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
	}
	
	
	public void menuErzeugen(){
=======
	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 398);
		
>>>>>>> develop
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
<<<<<<< HEAD
		
		JMenu mnAccount = new JMenu("Account");
		menuBar.add(mnAccount);
		
		JMenuItem mntmMeinAcount = new JMenuItem("Mein Acount");
		mnAccount.add(mntmMeinAcount);
		
		JMenuItem mntmKontostandAnzeigen = new JMenuItem("Kontostand anzeigen");
		mnAccount.add(mntmKontostandAnzeigen);
		
		JMenuItem mntmWerbelink = new JMenuItem("Werbelink");
		mnAccount.add(mntmWerbelink);
		
	}
	
=======
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
>>>>>>> develop
}
