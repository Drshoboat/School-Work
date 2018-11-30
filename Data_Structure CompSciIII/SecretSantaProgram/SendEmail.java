//to send to different email providers split email input on @ and use switch statements, (i.e. if @aol.com, use smtp.aol.com as host) 

import java.util.*;
import java.io.*;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;

public class SendEmail 
{
	public static void main(String[] args) 
   {
      Scanner keyboard = new Scanner(System.in);
      
      ArrayList<String> Emails = new ArrayList<String>();
		String userpt2 = "";
		String passpt2 = "";
      String total = "";
      String bodypt2 = "";
      String subjectpt2 = "";
      String wantToAttach = "";
      String pathToFile = "";
      String nameOfFile = "";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

      System.out.println("How many Emails would you like to send to? (one or multiple)");
         total = keyboard.nextLine();
      
      if(total.equals("one"))
      {
         System.out.println("Enter your email (i.e. myemail@gmail.com)");
            userpt2 = keyboard.nextLine();
            
         System.out.println("Enter your email account's password (case-sensitive)");
            passpt2 = keyboard.nextLine();
            
         System.out.println("Enter the email's subject");
            subjectpt2 = keyboard.nextLine();
            
         System.out.println("Would you like to add an attachment? (yes or no)");
            wantToAttach = keyboard.nextLine();
            
         if(wantToAttach.equals("yes"))
         {
            System.out.println("Enter the file path to your attachment, without including the file name. (i.e. C://Users/person/Desktop/Pictures/)");
               pathToFile = keyboard.nextLine();
            
            System.out.println("Enter the name of your attachment, including its extention. (i.e. mycat.jpg)");
               nameOfFile = keyboard.nextLine();
         }   
            
         System.out.println("Enter the email's body text");
            bodypt2 = keyboard.nextLine();
         
         System.out.println("Enter the recipient's email (i.e. youremail@gmail.com)");
            Emails.add(keyboard.nextLine());
      }
      else if(total.equals("multiple"))
      {
         String done = "no";
         String status = "yes";
      
         System.out.println("Enter your email (i.e. myemail@gmail.com)");
            userpt2 = keyboard.nextLine();
            
         System.out.println("Enter your email account's password (case-sensitive)");
            passpt2 = keyboard.nextLine();
            
         System.out.println("Enter the email's subject");
            subjectpt2 = keyboard.nextLine();
            
         System.out.println("Would you like to add an attachment? (yes or no)");
            wantToAttach = keyboard.nextLine();
            
         if(wantToAttach.equals("yes"))
         {
            System.out.println("Enter the file path to your attachment, without including the file name. (i.e. C://Users/person/Desktop/Pictures/)");
               pathToFile = keyboard.nextLine();
            
            System.out.println("Enter the name of your attachment, including its extention. (i.e. mycat.jpg)");
               pathToFile = keyboard.nextLine();
         }      
            
         System.out.println("Enter the email's body text");
            bodypt2 = keyboard.nextLine();   
            
         System.out.println("Enter the recipient's email (i.e. youremail@gmail.com)");
            Emails.add(keyboard.nextLine());
        
            while(done.equals("no"))
            {
               System.out.println("Enter the next recipient's email (i.e. youremail@gmail.com)");
                  Emails.add(keyboard.nextLine());
                  
               System.out.println("Would you like to add another email? (yes or no)");
                  status = keyboard.nextLine();
               
               if(status.equals("no"))
               {
                  done = "yes";
               }
            }
         }
      
      final String username = userpt2;
      final String password = passpt2;
      final String subject = subjectpt2;
      final String body = bodypt2;
      final String pathToFilept2 = pathToFile;
      final String nameOfFilept2 = nameOfFile;
      final String wantToAttachpt2 = wantToAttach;
      
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
            
            if(wantToAttachpt2.equals("yes"))
            {
               String file = pathToFilept2;
               String fileName = nameOfFilept2;
               
               DataSource source = new FileDataSource(file);
               messageBodyPart.setDataHandler(new DataHandler(source));
               messageBodyPart.setFileName(fileName);
               multipart.addBodyPart(messageBodyPart);
      
               message.setContent(multipart);
            }
      
         for(int i = 0; i < 10 /*Emails.size()*/; i++)
         {  
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(/*Emails.get(i))*/"treyeleigh1@gmail.com"));
            System.out.println("sending...");
			   
            Transport.send(message);
            
			   System.out.printf("Email %d sent.\n", i + 1);
         }
         System.out.println("-------------\nOperation Complete.");
		}
      catch (MessagingException e) 
      {
			throw new RuntimeException(e);
		}
	}
}