package action.brand;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import bean.Brand;

import com.opensymphony.xwork2.ActionSupport;

import dao.BrandDao;

public class AddBrandAction extends ActionSupport implements SessionAware{
	private static final long serialVersionUID = 572146812454l;

	private String myName;
	private File imgFile;
	private static ArrayList<String> allowedExtensions;// 允许的上传文件扩展名
	private static ArrayList<String> deniedExtensions;// 阻止的上传文件扩展名
	
	public void setImgFile(File imgFile) {
		this.imgFile = imgFile;
	}

	private String extension;

	private Map session;

	
	public AddBrandAction() {
		deniedExtensions = new ArrayList<String>();
		allowedExtensions = stringToArrayList("png|jpg|gif|bmp");
	}

	@Override
	public String execute() throws Exception {
		if(imgFile == null) {
			addFieldError("imgFile", "请选择要上传的文件！");
			return INPUT;
		}
		
		if(myName == null || myName == "") {
			addFieldError("myName", "请输入活动的名称！");
			return INPUT;
		}

		if(extIsAllowed(extension.substring(1))) {
			BrandDao dao = new BrandDao();
			Brand brand = new Brand();
			String imageName = (new Date()).getTime() + extension;
			File newFile = new File(ServletActionContext.getServletContext().getRealPath("/topicImage") + "\\" + imageName);
			System.out.println(ServletActionContext.getServletContext().getRealPath("/topicImage") + "\\" + imageName);
			try {
				FileUtils.copyFile(imgFile, newFile);
			} catch (IOException e) {
				addActionError(e.getMessage());
				return INPUT;
			}
			
			brand.setPath("/TW/topicImage/" + imageName);
			brand.setTop(0);
			brand.setName(getMyName());
			dao.create(brand);
			return SUCCESS;
		} else {
			addFieldError("imgFile", "文件格式错误！");
			return INPUT;
		}
	}

	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}

	
	public void setImgFileFileName(String fileName) {
		this.extension = fileName.substring(fileName.lastIndexOf("."));
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

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public String getMyName() {
		return myName;
	}

}
