package action;

import java.util.ArrayList;

import bean.IWork;

import com.opensymphony.xwork2.ActionSupport;

import dao.IWorkDao;

public class iWorkListAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<IWork> entities;

	public String execute() {
		//System.out.println("到了");
		IWorkDao iWorkDao = new IWorkDao();
		entities = (ArrayList<IWork>) iWorkDao.getAllEntity();
		for(int i = 0;i < entities.size();i ++) {
			System.out.println(entities.get(i).getName());
		}
		return SUCCESS;
	}
	
	public void setEntities(ArrayList<IWork> entities) {
		this.entities = entities;
	}

	public ArrayList<IWork> getEntities() {
		return entities;
	}
	
	
	
	
}
