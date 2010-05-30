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

		File style = new File(currentDirPath + "css/style.css");
		File tmp = new File(currentDirPath + "css/tmp.css");

		changeGray(style, tmp);

		message = "主题已经变为灰色，请刷新";

		return SUCCESS;
	}

	public void changeGray(File style, File tmpFile) {

		String filter = "html{filter:progid:DXImageTransform.Microsoft.BasicImage(grayscale=1);}";
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(style)));
			String tmp = "";
			String normalCSS = "";
			String grayCSS = "";

			while ((tmp = br.readLine()) != null) {
				grayCSS += (tmp + "\n");
			}

			if (!grayCSS.substring(0, 4).equals("html")) {
				grayCSS = filter + "\n\n" + grayCSS;
			}
			normalCSS = grayCSS;
			while ((tmp = br.readLine()) != null) {
				normalCSS += (tmp + "\n");
			}
			br.close();
			BufferedWriter bo = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(tmpFile)));
			if (!normalCSS.contains(filter)) {
				normalCSS = filter + "\n" + normalCSS;
			}

			bo.append(normalCSS);
			bo.flush();
			bo.close();

			updateCSS(style, tmpFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void updateCSS(File source, File tmpFile) {
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
