package Email;

import java.io.IOException;

import javax.mail.MessagingException;

//import email.IOException;
//import email.POP3Exception;
//import email.String;

public interface EmailInterface {

	/**
	 * Generic interface providing the needed methods for fetching the click mails.
	 * Implementing classes provide the actual protocol implementation and server details.
	 * @author x1gma
	 *
	 */
		
		/**
		 * Logs in as the specified user. First method called.
		 * @param user
		 * @param pwd
		 * @return true if successful
		 * @throws MessagingException 
		 */
		public boolean login(String user, String pwd) throws MessagingException;
		
		/**
		 * Logs out and finalizes the session. Last method called.	
		 * @return true if successful
		 */
		public boolean logout();
		
		/**
		 * Fetches the EMail with the index from the server.
		 * Returns an string array with the lines of the mail as elements.
		 * @param index
		 * @return
		 * @throws POP3Exception 
		 * @throws IOException 
		 */
		public String getEmail(int index) throws IOException;
		
		/**
		 * Gets the number of e-mails to process. 
		 * This can be the number of e-mails in the inbox or the number of e-mails in the folder.
		 * @return
		 * @throws MessagingException 
		 */
		public int getEmailCount() throws MessagingException;

	
}
