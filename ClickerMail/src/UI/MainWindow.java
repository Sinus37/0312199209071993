package UI;

import java.awt.BorderLayout;
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
		
		JMenu mnAccount = new JMenu("Account");
		menuBar.add(mnAccount);
		
		JMenuItem mntmMeinAcount = new JMenuItem("Mein Acount");
		mnAccount.add(mntmMeinAcount);
		
		JMenuItem mntmKontostandAnzeigen = new JMenuItem("Kontostand anzeigen");
		mnAccount.add(mntmKontostandAnzeigen);
		
		JMenuItem mntmWerbelink = new JMenuItem("Werbelink");
		mnAccount.add(mntmWerbelink);
		
	}
	
}
