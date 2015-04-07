package Email;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.MimeMultipart;

import ChooseLink.GetLink;

public class EmailIMAP implements EmailInterface {
	
	@SuppressWarnings("static-access")
	public EmailIMAP(String email, String pw) {
		this.user = email;
		this.password = pw;
	}
	

	static String host = "imap.gmail.com";
	static String user;
	static String password ;	
	public static String htmlCode;
	public static String[] htmlArray;
	public static int emailCount;
	public static Address from ;
	public static String from2;
	static boolean deleteMail = false;
	public static int sumMails;
	int anzahl;
	
	public static void main(String[] args)  throws IOException, MessagingException, NullPointerException, javax.mail.MessagingException {
		setUser("cfmap14@googlemail.com");
		setPassword("ClickMailer1!");
		run();
	}

	
    public static void run() throws IOException, NullPointerException, javax.mail.MessagingException {  
    	
    	Properties props = System.getProperties();
		props.setProperty("mail.store.protocol", "imaps");
		try {
		Session session = Session.getDefaultInstance(props, null);
	// Login 
		Store store = session.getStore("imaps");
		store.connect( host, user, password);
		System.out.println("Erfolgreich eingelogt");


	//choose the folder
		Folder folder = store.getFolder("Inbox");
		folder.open(Folder.READ_WRITE);
		
		/**Folder[] f = store.getDefaultFolder().list();
		for(Folder fd:f)
		    System.out.println(">> "+fd.getName());
		*/
		
		Message messages[] = folder.getMessages();

		System.out.println("No of Messages : " + folder.getMessageCount());
        System.out.println("No of Unread Messages : " + folder.getUnreadMessageCount());        
		
		GetLink gen = new GetLink();
		gen.generate();
		
        //for (int i=0; i < messages.length;i++) {
		for (int i=0; i < 60; i++) {
        	Message message =  messages[i];
        	System.out.println("*****************************************************************************");
        	System.out.println("MESSAGE " + (i + 1) + " / " + folder.getMessageCount() + ":");
            System.out.println("From: " + message.getFrom()[0]);
       
        	String sender = message.getSubject();
        	System.out.println(sender);
        	
            from = message.getFrom()[0];
            from2 = from.toString();

            //Nachricht ist eine Multipart-Nachricht 
            Object messageContent = message.getContent();
            if (messageContent instanceof MimeMultipart) {
            	MimeMultipart messageContentMimeMP = (MimeMultipart) messageContent;
            	
            	for (int j = 0; j < messageContentMimeMP.getCount(); j++) {            		
		            Multipart mp = (Multipart)message.getContent();
		            Part bp = mp.getBodyPart(j);
					if (bp.isMimeType("text/html")) {	
	// ->	
						htmlCode = messageContentMimeMP.getBodyPart(1).getContent().toString();	            		
		        		String test = htmlCode.toString();
	          		gen.setList(test, from2, sender);
						if (isDeleteMail() == true) {
							System.out.println("Email wurde erfolgreich gelöscht");
							message.setFlag(Flags.Flag.DELETED, true);
			    			//setDeleteMail(Message m);
							setDeleteMail(false);
						}
					}
            	}
            //Nachricht ist eine einfache Text- bzw. HTML-Nachricht
            } else {
    // ->		
            	htmlCode =  message.getContent().toString();
        		String test = htmlCode.toString();
        	    		gen.setList(test, from2, sender);
        		if (isDeleteMail() == true) {
        			System.out.println("Email wurde erfolgreich gelöscht");
        			message.setFlag(Flags.Flag.DELETED, true);
					setDeleteMail(false);
					//setDeleteMail(Message m);
        		}
            }
    // for delete Email
            System.out.println(" "); 
            if (isDeleteMail() == true) {
            	System.out.println("Darf gelöscht werden");
            }

		}
        
        System.out.println("                  Fertig ");
		} catch (NoSuchProviderException e) {
		e.printStackTrace();
		System.exit(1);
		}
   
    }


	public static boolean isDeleteMail() {
		System.out.println(deleteMail);
		return deleteMail;
	}

	public static void setEmailCount(int sum) {
		sumMails = sum;
	}
	
	public int getEmailCount() throws MessagingException {
		return sumMails;
	}

	public static void setDeleteMail(boolean stat) {
		deleteMail = stat;
		System.out.println(deleteMail);
	}

	@Override
	public int login(String user, String pwd) throws MessagingException {
		Properties props = System.getProperties();
		props.setProperty("mail.store.protocol", "imaps");
	
		Session session = Session.getDefaultInstance(props, null);
	// Login 
		Store store;
		try {
			store = session.getStore("imaps");
		
		store.connect( host, user, password);
		System.out.println("Erfolgreich eingelogt");


	//choose the folder
		Folder folder = store.getFolder("Inbox");
		folder.open(Folder.READ_WRITE);
		
		/**Folder[] f = store.getDefaultFolder().list();
		for(Folder fd:f)
		    System.out.println(">> "+fd.getName());
		*/
		
		Message messages[] = folder.getMessages();

		anzahl = folder.getMessageCount();
		System.out.println("No of Messages : " + folder.getMessageCount());
        System.out.println("No of Unread Messages : " + folder.getUnreadMessageCount());    
		} catch (NoSuchProviderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return anzahl;
		

	}

	@Override
	public boolean logout() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getEmail(int index) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public static String getUser() {
		return user;
	}

	public static void setUser(String user) {
		EmailIMAP.user = user;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		EmailIMAP.password = password;
	}
	
	
	
	

}
