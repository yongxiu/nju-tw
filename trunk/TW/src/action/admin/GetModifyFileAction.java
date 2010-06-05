package action.admin;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import org.apache.struts2.interceptor.SessionAware;

import service.SortUtil;

import bean.File;
import bean.User;
import bean.temp.FileTemp;

import com.opensymphony.xwork2.ActionSupport;

import dao.FileDao;
import dao.UserDao;

public class GetModifyFileAction extends ActionSupport implements SessionAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * list file to be modified
	 * Yongxiu
	 */
	
	private ArrayList<FileTemp> files;
	private Map session;
	
	public String execute() {
		files = new ArrayList<FileTemp>();
		FileDao fileDao =  new FileDao();
		UserDao userDao = new UserDao();
		Long id = (Long) getSession().get("id");
		User user = userDao.getById(id);
	
		Set<File> tempFiles = user.getFiles();
		ArrayList<File> filesG = new ArrayList<File>();
		for(File fileTemp : tempFiles) {
			filesG.add(fileTemp);
		}
		
		//sort articles by date
		filesG = SortUtil.revertSortFile(filesG);
		
		//clone generic article to aritcleTemp
		for(File a : filesG) {
			FileTemp aTemp = new FileTemp();
			aTemp.setDate(a.getDate());
			aTemp.setFilename(a.getFilename());
			aTemp.setId(a.getId());
			aTemp.setOwner(a.getUser().getName());
			files.add(aTemp);
		}
		
		
		return SUCCESS;
	}

	


	public ArrayList<FileTemp> getFiles() {
		return files;
	}




	public void setFiles(ArrayList<FileTemp> files) {
		this.files = files;
	}




	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}
	
	
}
