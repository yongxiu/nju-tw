package test;

import java.io.IOException;
import java.io.PrintWriter;
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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendMail extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public SendMail() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String mailfrom = request.getParameter("mailfrom");
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");

		String mailServer = "smtp.qq.com";

		try {
			Properties prop = System.getProperties();
			prop.put("mail.stmp.host", mailServer);
			prop.put("mail.stmp.auth", "false");

			Session session = Session.getInstance(prop);
			session.setDebug(true);

			MimeMessage message = new MimeMessage(session);

			message.setFrom(new InternetAddress("723943634@qq.com"));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(
					"njutuanweiadmin@126.com"));

			message.setSubject(subject);
			message.setText(content + mailfrom);

			// ����Mimemultipart���BodyPart����
			Multipart mul = new MimeMultipart();

			BodyPart bpart = new MimeBodyPart();
			bpart.setContent(content, "text/html;charset=utf-8");
			mul.addBodyPart(bpart);
			message.setContent(mul);

			message.setSentDate(new Date());

			message.saveChanges();

			Transport transport = session.getTransport("smtp");

			transport.connect(mailServer, "723943634@qq.com", "huating8232828");
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
			response.sendRedirect("mail.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			String s = "<script language='Javascript'>alert('0')</script>";
			out.println(s);
		}
	}
}
