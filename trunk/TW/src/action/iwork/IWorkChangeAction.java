package action.iwork;

import java.util.ArrayList;

import bean.IWork;

import com.opensymphony.xwork2.ActionSupport;

import dao.IWorkDao;

public class IWorkChangeAction extends ActionSupport{
	
	private int topicid;
	private String path;
	/**
	 * 
	 */
	private static final long serialVersionUID = -765268874265118207L;
	
	private ArrayList<IWork> iworks;
	public String execute() {
		IWorkDao iWorkDao = new IWorkDao();
		setIworks((ArrayList<IWork>) iWorkDao.getAllEntity());
		IWork iWork = iWorkDao.getById(topicid);
		path = iWork.getPath();
		return SUCCESS;
	}
	public void setIworks(ArrayList<IWork> iworks) {
		this.iworks = iworks;
	}
	public ArrayList<IWork> getIworks() {
		return iworks;
	}
	public int getTopicid() {
		return topicid;
	}
	public void setTopicid(int topicid) {
		this.topicid = topicid;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	
}
