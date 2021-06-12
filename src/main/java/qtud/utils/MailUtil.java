/*
 * Copyright (C) 2010 LifeTek Ltd co. All rights reserved.
 * LifeTek Ltd co PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package qtud.utils;

import java.io.IOException;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*; 

/**
 *
 * @author LIFETEK@lifetek.com.vn
 * @since since_text
 * @version 1.0
 */
public class MailUtil {

    public static void postMail(String recipients[], String subject, String message, String from, String fileName) throws MessagingException, IOException {
        boolean debug = false;

        //Set the host smtp address
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.lifetek.com.vn");
        props.put("mail.smtp.auth", "true");

        // create some properties and get the default Session
        Session session = Session.getDefaultInstance(props, null);
        session.setDebug(debug);

        // create a message
        Message msg = new MimeMessage(session);

        // set the from and to address
        InternetAddress addressFrom = new InternetAddress(from);
        msg.setFrom(addressFrom);

        InternetAddress[] addressTo = new InternetAddress[recipients.length];
        for (int i = 0; i < recipients.length; i++) {
            addressTo[i] = new InternetAddress(recipients[i]);
        }
        msg.setRecipients(Message.RecipientType.TO, addressTo);


        // Optional : You can also set your custom headers in the Email if you Want
        msg.addHeader("MyHeaderName", "myHeaderValue");

        // Setting the Subject and Content Type
        msg.setSubject(subject);
        msg.setContent(message, "UTF-8");

        MimeBodyPart mbp1 = new MimeBodyPart();
	mbp1.setText("Kính gửi công ty", "UTF-8");

        // create the second message part
	MimeBodyPart mbp2 = new MimeBodyPart();

	// attach the file to the message
	mbp2.attachFile(fileName);

        Multipart mp = new MimeMultipart();
        mp.addBodyPart(mbp1);
	mp.addBodyPart(mbp2);

	// add the Multipart to the message
	msg.setContent(mp);

//        msg.setFileName(fileName);

        Transport tr = session.getTransport("smtps");
        tr.connect("smtp.lifetek.com.vn", from, "cuongnh");
        tr.sendMessage(msg, msg.getAllRecipients());
        tr.close();
    }


}
