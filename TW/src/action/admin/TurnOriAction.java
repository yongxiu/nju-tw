package action.admin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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

		File source = new File(currentDirPath + "css/style.css");
		File tmp = new File(currentDirPath + "css/tmp.css");

		changeBack(source, tmp);
		message = "主题已经恢复原主题，请刷新";

		return SUCCESS;
	}

	public void changeBack(File style, File tmpFile) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(style)));
			String tmp = "";
			String normalCSS = "";
			String filter = "";

			while ((tmp = br.readLine()) != null) {
				if(tmp.length() == 0) {
					break;
				}
				filter += (tmp + "\n");
			}
			
			if(!filter.substring(0, 4).equals("html")) {
				normalCSS = filter;
			}
			
			while ((tmp = br.readLine()) != null) {
				normalCSS += (tmp + "\n");
			}

			br.close();
			BufferedWriter bo = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(tmpFile)));
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
