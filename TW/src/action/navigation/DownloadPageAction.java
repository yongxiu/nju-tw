package action.navigation;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import bean.File;

import com.opensymphony.xwork2.ActionSupport;

import dao.FileDao;

public class DownloadPageAction extends ActionSupport implements SessionAware{
	private ArrayList<File> files;
	private int currentPage;
	private Map session;
	private ArrayList<String> pageCount;
	public String execute() {
		int number = 24;
		
		FileDao fileDao = new FileDao();
		files = fileDao.getFileByPage(currentPage, number);
		
		//init page count
		pageCount = new ArrayList<String>();
		
		int count = fileDao.getAllFilesCount();
		
		count = getPageCount(count, number);
		for(int i = 1;i<=count;i++) {
			pageCount.add(i+"");
		}
		
		return SUCCESS;
		
	}
	public ArrayList<File> getFiles() {
		return files;
	}
	public void setFiles(ArrayList<File> files) {
		this.files = files;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public Map getSession() {
		return session;
	}
	public void setSession(Map session) {
		this.session = session;
	}
	public ArrayList<String> getPageCount() {
		return pageCount;
	}
	public void setPageCount(ArrayList<String> pageCount) {
		this.pageCount = pageCount;
	}
	
	public int getPageCount(int count,int number) {
		int result;
		
		
		if(count % number == 0) {
			if(count == number)
				result = 0;
			else 
				result = count/number;
		}
		else {
			if(count<number)
				result = 0;
			else 
				 result = count/number+1;
		}
		
		return result;
	}
	
}