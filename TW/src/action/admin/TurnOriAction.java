package action.admin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class TurnOriAction extends ActionSupport {

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

		File source = new File(currentDirPath + "css/originalstyle.css");
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

		message = "主题已经恢复原主题，请刷新";

		return SUCCESS;
	}

}
