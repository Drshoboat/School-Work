package SecretSantaProgram;

//to send to different email providers split email input on @ and use switch statements, (i.e. if @aol.com, use smtp.aol.com as host)

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class SendEmail
{
	public SendEmail(String sender, String receiver)
   {

      ArrayList<String> Emails = new ArrayList<String>();
			String userpt2 = "";
			String passpt2 = "";
      String bodypt2 = "";
      String subjectpt2 = "";

			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");


      //System.out.println("Enter your email (i.e. myemail@gmail.com)");
            userpt2 = "senderoftest@gmail.com";

         //System.out.println("Enter your email account's password (case-sensitive)");
            passpt2 = "ir!%West";

         //System.out.println("Enter the email's subject");
            subjectpt2 = "Hey there my guy... Here is your Secret Santa, " + sender;

         //System.out.println("Enter the email's body text");
            bodypt2 = "Your secret santa is: " + receiver + "\n\nThis email was totaly sent by James Hovey and not Brian";

         //System.out.println("Enter the recipient's email (i.e. youremail@gmail.com)");
            Emails.add("receiveroftest@gmail.com");

      final String username = userpt2;
      final String password = passpt2;
      final String subject = subjectpt2;
      final String body = bodypt2;

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try
      {

         Multipart multipart = new MimeMultipart();

			   Message message = new MimeMessage(session);
			   message.setFrom(new InternetAddress(username));
			   message.setSubject(subject);
            BodyPart messageBodyPart = new MimeBodyPart();
            multipart.addBodyPart(messageBodyPart);
			   message.setText(body);

         for(int i = 0; i < Emails.size(); i++)
         {
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(Emails.get(i)));
            System.out.println("Sending...");

            Transport.send(message);

			   //System.out.printf("Email %d sent.\n", i + 1);
         }
         System.out.println("Operation Complete.");
		}
      catch (MessagingException e)
      {
			throw new RuntimeException(e);
		}
	}
}
