package action.admin;

import java.io.*;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class TurnGrayAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	public String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String execute() throws Exception {

		String currentDirPath = ServletActionContext.getServletContext()
				.getRealPath("/");

		File source = new File(currentDirPath + "css/graystyle.css");
		File desc = new File(currentDirPath + "css/style.css");

		BufferedReader in = new BufferedReader(new InputStreamReader(
				new FileInputStream(source)));

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(desc)));

		String str = null;
		while ((str = in.readLine()) != null) {
			out.write(str + "\r\n");
		}
		out.close();
		in.close();

		
			message = "主题已经变为灰色，请刷新";
		

		return SUCCESS;

	}

}
