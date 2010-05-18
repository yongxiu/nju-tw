package action.navigation;

import java.util.ArrayList;

import bean.File;

import com.opensymphony.xwork2.ActionSupport;

import dao.FileDao;

public class DownloadAction extends ActionSupport{
	private ArrayList<File> files;
	public String execute() {
		FileDao fileDao = new FileDao();
		files = (ArrayList<File>) fileDao.getAllEntity();
		for(File file:files) {
			System.out.println(file.getFilename());
		}
		return SUCCESS;
		
	}
	public ArrayList<File> getFiles() {
		return files;
	}
	public void setFiles(ArrayList<File> files) {
		this.files = files;
	}
	
	
	
}
