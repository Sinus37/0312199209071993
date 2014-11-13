package UI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vorwort extends JDialog {
	
	public static boolean read = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Vorwort dialog = new Vorwort();
			//dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Vorwort() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		toFront();
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 239, 450, 39);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			//toFront();
			
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						read = true;
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			JLabel lblBlablaWarnungUnd = new JLabel("Blabla Warnung und hinweis");
			lblBlablaWarnungUnd.setBounds(90, 44, 240, 91);
			getContentPane().add(lblBlablaWarnungUnd);
		}
	}

	public static boolean getRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}
	
	

}
