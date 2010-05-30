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

		String source = currentDirPath + "css/style.css";
		String tmp = currentDirPath + "css/tmp.css";

		changeGray(source, tmp);

		message = "主题已经变为灰色，请刷新";

		return SUCCESS;
	}

	public void changeGray(String source, String tmpFile) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(source)));
			String tmp = "";
			String grayCSS = "";
			String normalCSS = "";
			while ((tmp = br.readLine()) != null) {
				if (tmp.length() == 0) {
					break;
				}
				grayCSS += (tmp + "\n");
			}
			while ((tmp = br.readLine()) != null) {
				normalCSS += (tmp + "\n");
			}
			br.close();
			if (grayCSS.charAt(0) == '/') {
				grayCSS = grayCSS.substring(2, grayCSS.length() - 3);
				BufferedWriter bo = new BufferedWriter(new OutputStreamWriter(
						new FileOutputStream(tmpFile)));
				bo.append(grayCSS + "\n" + normalCSS);
				bo.flush();
				bo.close();

			}
			updateCSS(source, tmpFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void updateCSS(String source, String tmpFile) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(tmpFile)));
			String tmp = "";
			String CSS = "";
			while ((tmp = br.readLine()) != null) {
				CSS += (tmp + "\n");
			}
			br.close();
			BufferedWriter bo = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(source)));
			bo.append(CSS);
			bo.flush();
			bo.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
