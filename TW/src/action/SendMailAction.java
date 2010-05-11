package action;

import java.util.Date;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.opensymphony.xwork2.ActionSupport;

public class SendMailAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String author, mailfrom, subject, content, mailInfo, mailBox,
			mailFooter;

	private int charInARow = 50;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getMailfrom() {
		return mailfrom;
	}

	public void setMailfrom(String mailfrom) {
		this.mailfrom = mailfrom;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String execute() {

		String mailServer = "smtp.gmail.com";

		mailInfo = "<p><font color=\"#ff0000\">注意：本邮件来自团委网站！</font></p>";
		mailBox = "<p><font color=\"FF00FF\">发件人：<a title=\"点此可回复邮件。\" href=\"mailto:"
				+ mailfrom + "\">" + author + "</a></span></font><br/><br/>";
		mailFooter = "</br><br/><p><font color=\"#ff00ff\">若要回复此邮件，请点此处：<a href=\"mailto:"
				+ mailfrom + "\">回复</a></font></p>";

		String tmp = "";
		for (int i = 0; i < content.length(); i++) {
			tmp += content.charAt(i);
			if ((i + 1) % charInARow == 0) {
				tmp += "</br/>";
			}
		}
		subject = "<font color=\"#FF00FF\">邮件主题：</font>" + subject + "</br>";
		content = "<font color=\"#FF00FF\">邮件内容：</font><br/>" + tmp;
		try {
			Properties prop = System.getProperties();
			prop.put("mail.stmp.host", mailServer);
			prop.put("mail.stmp.auth", "true");
			prop.put("mail.smtp.starttls.enable", "true");

			Session session = Session.getInstance(prop);
			session.setDebug(true);

			MimeMessage message = new MimeMessage(session);

			java.security.Security
					.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
			message.setFrom(new InternetAddress("njutwproxy@gmail.com"));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(
					"njutwmail.gmail.com"));

			message.setSubject(subject);

			Multipart mul = new MimeMultipart();
			BodyPart bpart = new MimeBodyPart();
			bpart.setContent(mailInfo + mailBox + subject + content
					+ mailFooter, "text/html;charset=utf-8");
			mul.addBodyPart(bpart);
			message.setContent(mul);

			message.setSentDate(new Date());

			message.saveChanges();

			Transport transport = session.getTransport("smtp");

			transport.connect(mailServer, "njutwproxy@gmail.com", "njutw2010@");
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
			return SUCCESS;
		} catch (Exception e) {
			return INPUT;
		}
	}
}
