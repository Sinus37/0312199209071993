package ProviderOpen;

public class OpenDodonaMails {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Bei Paid auf "Hier Klicken" drücken
	 * Wartezeit bis Schließen	: 1
	 */

	String[] dodonaTemp ;
	String b;
	
	public String getLink(String mail,String sender){
		System.out.println("Art der Email : Dodona-Mails");
		dodonaTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + dodonaTemp.length);
		for (int i = 0; i < dodonaTemp.length-1; i++) {
			if (dodonaTemp[i].contains("www.dodona-mails.de/mail.")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + dodonaTemp[i]);
				int startLink = dodonaTemp[i].indexOf("http:");
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
					}
				} else {
					if (sender.contains("Questionmail")) {
						if (dodonaTemp[i].contains("><b>Zum bestätige")){
							int endLink = dodonaTemp[i].indexOf("><b>Zum bestätige");
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
}
