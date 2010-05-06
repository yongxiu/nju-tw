package action;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {
	private static final long serialVersionUID = 572146812454l;

	private File myFile;
	private String contentType;
	private String fileName;
	private String uploadFileName;
	private String caption;
	
	private static ArrayList<String> allowedExtensions;// 允许的上传文件扩展名
	private static ArrayList<String> deniedExtensions;// 阻止的上传文件扩展名

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
		return uploadFileName;
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
	
	private boolean extIsAllowed(String ext) {
		ext = ext.toLowerCase();
		if (allowedExtensions.size() == 0) {
			if (deniedExtensions.contains(ext)) {
				return false;
			} else {
				return true;
			}
		}
		if (deniedExtensions.size() == 0) {
			if (allowedExtensions.contains(ext)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	private ArrayList<String> stringToArrayList(String str) {
		String[] strArr = str.split("\\|");
		ArrayList<String> tmp = new ArrayList<String>();
		if (str.length() > 0) {
			for (int i = 0; i < strArr.length; ++i) {
				tmp.add(strArr[i].toLowerCase());
			}
		}
		return tmp;
	}
	
	public FileUploadAction() {
		allowedExtensions = new ArrayList<String>();
		deniedExtensions = stringToArrayList("html|htm|php|php2|php3|php4|php5|phtml|pwml|inc|asp|aspx|ascx|jsp|cfm|cfc|pl|bat|exe|com|dll|vbs|js|reg|cgi|htaccess|asis|ftl");
	}

	@Override
	public String execute() throws Exception {
		if(extIsAllowed(getExtention(fileName).substring(1))) {
			uploadFileName = new Date().getTime() + getExtention(fileName);
			File imageFile = new File(ServletActionContext.getServletContext()
					.getRealPath("/UserFiles")
					+ "/" + uploadFileName);
			try {
				FileUtils.copyFile(myFile, imageFile);
			} catch (IOException e) {
				addActionError(e.getMessage());
				return INPUT;
			}

			return SUCCESS;
		} else {
			addFieldError("myFileError", "文件格式错误！");
			return INPUT;
		}
	}
}
