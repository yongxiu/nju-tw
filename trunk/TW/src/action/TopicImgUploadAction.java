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

	@Override
	public String execute() throws Exception {
		if(imgFile == null) {
			addFieldError("imgFile", "请选择要上传的文件！");
			return INPUT;
		}
		
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
}
