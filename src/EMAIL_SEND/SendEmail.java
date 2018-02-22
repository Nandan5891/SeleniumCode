package EMAIL_SEND;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {

	/**
	 * @param args
	 * @throws EmailException 
	 */
	public static void main(String[] args) throws EmailException {
		
		System.out.println("==============Mail Started============");
		Email email= new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("self.ram100@gmail.com", "daemonsindia"));
		email.setSSLOnConnect(true);
		email.setFrom("rnt.softechindia@gmail.com");
		email.setSubject("Selenium test report");
		email.setMsg("This is a first test email from selenium programming");
		email.addTo("nandan_softechindia@outlook.com");
		email.send();
		
		System.out.println("==============Mail Successfully Sent============");
		
	}

}
