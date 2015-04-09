package UI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
<<<<<<< HEAD
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

=======
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
>>>>>>> develop
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AGBWindow extends JDialog {
	
	boolean agbsAreRead = false;

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AGBWindow dialog = new AGBWindow();
<<<<<<< HEAD
			dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
=======
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
>>>>>>> develop
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AGBWindow() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblRegelnNutzungScheigelaber = new JLabel("Regeln, Nutzung, Scheißgelaber");
		lblRegelnNutzungScheigelaber.setBounds(31, 42, 370, 16);
		contentPanel.add(lblRegelnNutzungScheigelaber);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.LEFT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
<<<<<<< HEAD
					@Override
=======
>>>>>>> develop
					public void actionPerformed(ActionEvent e) {
						setAgbsAreRead(true);
						System.out.println("AGBs gelesen");
						setVisible(false);
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
<<<<<<< HEAD
					@Override
=======
>>>>>>> develop
					public void actionPerformed(ActionEvent e) {
						System.out.println("AGB geschlossen ohne zu lesen");
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public boolean isAgbsAreRead() {
		return agbsAreRead;
	}

	public void setAgbsAreRead(boolean agbsAreRead) {
		System.out.println("AGB Wert übernommen");
		this.agbsAreRead = agbsAreRead;
	}
}
