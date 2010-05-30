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

		String style = currentDirPath + "css/style.css";
		String tmp = currentDirPath + "css/tmp.css";

		changeGray(style, tmp);

		message = "主题已经变为灰色，请刷新";

		return SUCCESS;
	}

	public void changeGray(String style, String tmpFile) {

		String filter = "html { filter:progid:DXImageTransform.Microsoft.BasicImage(grayscale=1);}";
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(tmpFile)));
			String tmp = "";
			String normalCSS = "";
			while ((tmp = br.readLine()) != null) {
				normalCSS += (tmp + "\n");
			}
			br.close();
			BufferedWriter bo = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(style)));
			bo.append(filter + "\n" + normalCSS);
					
			bo.flush();
			bo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
