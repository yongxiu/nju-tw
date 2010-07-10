package action;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import bean.User;

import com.opensymphony.xwork2.ActionSupport;

import dao.FileDao;

public class FileUploadAction extends ActionSupport implements SessionAware{
	private static final long serialVersionUID = 572146812454l;

	private File myFile;
	private String contentType;
	private String fileName;
	private String uploadFileName;
	private String caption;
	private String myName;
	private String message;
	
	//category
	private int category;
	
	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	private Map session;
	
	private static ArrayList<String> allowedExtensions;// 允许的上传文件扩展名
	private static ArrayList<String> deniedExtensions;// 阻止的上传文件扩展名

	public void setMyFileContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getContentType() {
		return contentType;
	}
	public void setMyFileFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	private String getExtention(String fileName) {

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
		
		System.out.println("IN FileUpload");
		if(myFile == null) {
			addFieldError("myFile", "请选择要上传的文件！");
			System.out.println("No file");
			return INPUT;
		}
		if(extIsAllowed(getExtention(fileName).substring(1))) {
			Date dNow = new Date();
			String strPath = "UserFiles/Upload/" + (new SimpleDateFormat("yyyyMM")).format(dNow);
			String currentDirPath = ServletActionContext.getServletContext().getRealPath("/" + strPath);
			File path = new File(currentDirPath);
			if(!path.exists()){
				path.mkdirs();
			}
			String newName = dNow.getTime() + getExtention(fileName);
			uploadFileName = currentDirPath + File.separator + newName;
			
			File imageFile = new File(uploadFileName);
			try {
				FileUtils.copyFile(myFile, imageFile);
			} catch (IOException e) {
				addActionError(e.getMessage());
				System.out.println("这儿错了");
				return INPUT;
				
			}
			
			uploadFileName = strPath + "/" + newName;
			
			bean.File file = new bean.File();
			file.setDate(dNow);
			file.setPath("/TW/"+uploadFileName);
			User user = (User) getSession().get("user");
			file.setUser(user);
			file.setFilename(myName);
			
			//set category
			file.setCategory(category);
			
			FileDao fileDao = new FileDao();
			fileDao.create(file);
			System.out.println("对了");
			message = "文件上传成功！";
			return SUCCESS;
		} else {
			addFieldError("myFile", "文件格式错误！");
			System.out.println("格式错了");
			return INPUT;
		}
	}

	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}
	
	
}
