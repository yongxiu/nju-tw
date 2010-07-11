package action.iwork;

import java.io.File;

import org.apache.struts2.ServletActionContext;

import bean.IWork;

import com.opensymphony.xwork2.ActionSupport;

import dao.IWorkDao;
import dao.UserDao;

public class DeleteiworkAction extends ActionSupport{
	/**
	 * Delete iwork
	 * CYX
	 */
	private int id;
	public String execute() {
		IWorkDao iworkDao = new IWorkDao();
		IWork iwork = iworkDao.getById(getId());
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
	
	
}
