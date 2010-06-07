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

import bean.TopicImage;
import bean.User;

import com.opensymphony.xwork2.ActionSupport;

import dao.FileDao;
import dao.TopicImageDao;

public class TopicImgUploadAction extends ActionSupport implements SessionAware{
	private static final long serialVersionUID = 572146812454l;

	private File imgFile;
	private static ArrayList<String> allowedExtensions;// 允许的上传文件扩展名
	private static ArrayList<String> deniedExtensions;// 阻止的上传文件扩展名
	
	public void setImgFile(File imgFile) {
		this.imgFile = imgFile;
	}

	private String extension;

	private Map session;
	
	private int topicid;
	private int isnew;
	

	public int getTopicid() {
		return topicid;
	}

	public void setTopicid(int topicid) {
		this.topicid = topicid;
	}

	public int getIsnew() {
		return isnew;
	}

	public void setIsnew(int isnew) {
		this.isnew = isnew;
	}
	
	public TopicImgUploadAction() {
		deniedExtensions = new ArrayList<String>();
		allowedExtensions = stringToArrayList("png|jpg|gif|bmp");
	}

	@Override
	public String execute() throws Exception {
		if(imgFile == null) {
			addFieldError("imgFile", "请选择要上传的文件！");
			return INPUT;
		}

		if(extIsAllowed(extension.substring(1))) {
			TopicImageDao dao = new TopicImageDao();
			TopicImage image = dao.getById(topicid);
			String currentPath = ServletActionContext.getServletContext().getRealPath(image.getPath().substring(3));
			System.out.println(currentPath);
			boolean success = new File(currentPath).delete();
			if(success) {
				File newFile = new File(ServletActionContext.getServletContext().getRealPath("/topicImage/huodong") + topicid + extension);
				try {
					FileUtils.copyFile(imgFile, newFile);
				} catch (IOException e) {
					addActionError(e.getMessage());
					return INPUT;
				}
				
				image.setPath("/TW/topicImage/huodong" + topicid + extension);
				dao.update(image);
			}
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
}
