package action.iwork;

import java.io.File;
import java.util.ArrayList;

import org.apache.struts2.ServletActionContext;

import bean.GenericArticle;
import bean.IWork;

import com.opensymphony.xwork2.ActionSupport;

import dao.GenericArticleDao;
import dao.IWorkDao;
import dao.UserDao;

public class DeleteiworkAction extends ActionSupport{
	/**
	 * Delete iwork
	 * CYX
	 */
	private int id;
	private String message;
	public String execute() {
		IWorkDao iworkDao = new IWorkDao();
		IWork iwork = iworkDao.getById(getId());
		GenericArticleDao articleDao = new GenericArticleDao();
		ArrayList<GenericArticle> articles = articleDao.getArticlesByIWorkId(id);
		if(iwork.getTop()==1) {
			setMessage("(删除失败)！首页的重点工作主题不可删除！请先替换别的重点工作主题");
			return ERROR;
		}
		//set iworkid to zero
		for(GenericArticle article:articles) {
			article.setIworkid(0);
			articleDao.update(article);
		}
		
		
		String currentPath = ServletActionContext.getServletContext().getRealPath(iwork.getPath().substring(3));
		System.out.println(currentPath);
		boolean success = new File(currentPath).delete();
		if(success) {
			iworkDao.delete(getId());
		}
		return SUCCESS;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
