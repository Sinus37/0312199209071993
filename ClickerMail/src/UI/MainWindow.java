package UI;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ProgressBarUI;
import javax.swing.JLabel;

import Email.EmailIMAP;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.net.URI;

import javax.swing.JProgressBar;

public class MainWindow extends JFrame {

	int sum;
	
	public int count = 0;
	private JPanel contentPane;
	static JProgressBar bar = new JProgressBar( 0, 1000000 );

	public void setCount(int sum){
		count = sum;
	}
	

	/**
	 * Create the frame.
	 */
	public MainWindow(int sum) {
		this.sum = sum;
		setTitle("Hallo " + StartWindow.getUsername());
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(82, 52, 61, 16);
		getContentPane().add(lblNewLabel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVerfgbareEmails = new JLabel("Verf\u00FCgbare Emails:");
		lblVerfgbareEmails.setBounds(26, 29, 132, 16);
		contentPane.add(lblVerfgbareEmails);
		
		JLabel CountLabel = new JLabel();
		CountLabel.setBounds(170, 29, 61, 16);
		contentPane.add(CountLabel);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(106, 405, 251, 20);
		contentPane.add(progressBar);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setProgressBar(0, 10, 8);
			}
		});
		btnNewButton.setBounds(122, 157, 117, 29);
		contentPane.add(btnNewButton);
	
		setProgressBar(0, 10, 5);
	}
	
	public void setProgressBar(int min, int max, int cur) {
		bar.setVisible(true);
		bar.setStringPainted(true);
		bar.setValue(cur);
		bar.setMinimum(min);
		bar.setMaximum(max);
	}


}
