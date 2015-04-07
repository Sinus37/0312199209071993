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

	public class EmailmapToDeleteMails  {
		
		@SuppressWarnings("static-access")
		public EmailmapToDeleteMails(String email, String pw) {
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
			run();
		}

		
	    public static void run() throws IOException, NullPointerException, javax.mail.MessagingException {  
	    	
	    	Properties props = System.getProperties();
			props.setProperty("mail.store.protocol", "imaps");
			try {
			Session session = Session.getDefaultInstance(props, null);
		// Login 
			Store store = session.getStore("imaps");
			store.connect( host, "cfmap14@googlemail.com", "ClickMailer1!");
			System.out.println("Erfolgreich eingelogt");


		//choose the folder
			Folder folder = store.getFolder("Inbox");
			folder.open(Folder.READ_WRITE);
			
			Message messages[] = folder.getMessages();

			System.out.println("No of Messages : " + folder.getMessageCount());
	        System.out.println("No of Unread Messages : " + folder.getUnreadMessageCount());        
			
	        int emailLength = folder.getMessageCount();
	        
			GetLink gen = new GetLink();
			gen.generate();
			
	        //for (int i=0; i < messages.length;i++) {
			for (int i=0; i < emailLength - 300; i++) {
	        	Message message =  messages[i];
				message.setFlag(Flags.Flag.DELETED, true);
			}
	        
	        System.out.println("                  Fertig ");
			} catch (NoSuchProviderException e) {
			e.printStackTrace();
			System.exit(1);
			}
	   
	    }

	}

	
	
	

