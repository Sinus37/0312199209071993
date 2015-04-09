package ProviderOpen;

<<<<<<< HEAD
import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

=======
>>>>>>> develop
public class OpenDodonaMails {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Bei Paid auf "Hier Klicken" drücken
	 * Wartezeit bis Schließen	: 1
	 */

	String[] dodonaTemp ;
<<<<<<< HEAD
	
	public void open(String mail,String sender){
		System.out.println("Art der Email : Dodona-Mails");
		dodonaTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + dodonaTemp.length);
		//System.out.println(mail);
=======
	String b;
	
	public String getLink(String mail,String sender){
		System.out.println("Art der Email : Dodona-Mails");
		dodonaTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + dodonaTemp.length);
>>>>>>> develop
		for (int i = 0; i < dodonaTemp.length-1; i++) {
			if (dodonaTemp[i].contains("www.dodona-mails.de/mail.")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + dodonaTemp[i]);
				int startLink = dodonaTemp[i].indexOf("http:");
<<<<<<< HEAD
				//String b = bonixmailTemp[i].substring(startLink, startLink + 59 );
				if (sender.contains("Paidmail")){
					if (dodonaTemp[i].contains("><b>Zum bestätige")){
						int endLink = dodonaTemp[i].indexOf("><b>Zum bestätige");
						String b = dodonaTemp[i].substring(startLink, endLink -1 );
						System.out.println(b);
						i = dodonaTemp.length -1;
						openLink(b);
					} else {
						String b = dodonaTemp[i].substring(startLink, dodonaTemp[i].length() -1 );
						System.out.println(b);
						i = dodonaTemp.length -1;
						openLink(b);
=======
				if (sender.contains("Paidmail")){
					if (dodonaTemp[i].contains("><b>Zum bestätige")){
						int endLink = dodonaTemp[i].indexOf("><b>Zum bestätige");
						b = dodonaTemp[i].substring(startLink, endLink -1 );
						System.out.println(b);
						i = dodonaTemp.length -1;
					} else {
						b = dodonaTemp[i].substring(startLink, dodonaTemp[i].length() -1 );
						System.out.println(b);
						i = dodonaTemp.length -1;
>>>>>>> develop
					}
				} else {
					if (sender.contains("Questionmail")) {
						if (dodonaTemp[i].contains("><b>Zum bestätige")){
							int endLink = dodonaTemp[i].indexOf("><b>Zum bestätige");
<<<<<<< HEAD
							String b = dodonaTemp[i].substring(startLink, endLink -1 );
							System.out.println(b);
							i = dodonaTemp.length -1;
							openLink(b);
						} else {
							String b = dodonaTemp[i].substring(startLink, dodonaTemp[i].length() -1 );
							System.out.println(b);
							i = dodonaTemp.length -1;
							openLink(b);
						}
							
							
							
							
						
					}  else {
					System.out.println("Emailart noch nicht implementiert");
				}}
				
				
				
				
				
			}
	}
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Dodona-Mails");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        System.out.println("Nachricht erfolgreich geöffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
=======
							b = dodonaTemp[i].substring(startLink, endLink -1 );
							System.out.println(b);
							i = dodonaTemp.length -1;
						} else {
							b = dodonaTemp[i].substring(startLink, dodonaTemp[i].length() -1 );
							System.out.println(b);
							i = dodonaTemp.length -1;
						}	
					}  else {
					System.out.println("Emailart noch nicht implementiert");
				}}
			}
	}
		return (b);
}
>>>>>>> develop
}
