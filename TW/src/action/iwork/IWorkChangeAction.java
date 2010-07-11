package action.iwork;

import java.util.ArrayList;

import bean.IWork;

import com.opensymphony.xwork2.ActionSupport;

import dao.IWorkDao;

public class IWorkChangeAction extends ActionSupport{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -765268874265118207L;
	
	private ArrayList<IWork> iworks;
	public String execute() {
		IWorkDao orgDao = new IWorkDao();
		setIworks((ArrayList<IWork>) orgDao.getAllEntity());

		return SUCCESS;
	}
	public void setIworks(ArrayList<IWork> iworks) {
		this.iworks = iworks;
	}
	public ArrayList<IWork> getIworks() {
		return iworks;
	}
	
	
}
