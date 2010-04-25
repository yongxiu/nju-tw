package action;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {
	private static final long serialVersionUID = 572146812454l;
	private static final int BUFFER_SIZE = 16 * 1024;

	private File myFile;
	private String contentType;
	private String fileName;
	private String imageFileName;
	private String caption;

	public void setMyFileContentType(String contentType) {
		this.contentType = contentType;
	}

	public void setMyFileFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	private String getExtention(String fileName) {
		System.out.println(fileName);
		int pos = fileName.lastIndexOf(".");
		return fileName.substring(pos);
	}

	@Override
	public String execute() throws Exception {

		imageFileName = new Date().getTime() + getExtention(fileName);
		File imageFile = new File(ServletActionContext.getServletContext()
				.getRealPath("/UserFiles")
				+ "/" + imageFileName);
		try {
			FileUtils.copyFile(myFile, imageFile);
		} catch (IOException e) {
			addActionError(e.getMessage());
			return INPUT;
		}

		// copy(myFile, imageFile);
		// myFile.delete();
		return SUCCESS;
	}
}
