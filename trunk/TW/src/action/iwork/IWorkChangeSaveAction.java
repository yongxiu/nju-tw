package action.iwork;

import bean.IWork;

import com.opensymphony.xwork2.ActionSupport;

import dao.IWorkDao;

public class IWorkChangeSaveAction extends ActionSupport{
	private int topicid;
	private int checkId;
	
	public String execute() {
		IWorkDao iWorkDao = new IWorkDao();
		if(checkId!=topicid) {
		IWork iWorkNew = iWorkDao.getById(checkId);
		IWork iWorkOld = iWorkDao.getById(topicid);
		iWorkNew.setTop(1);
		iWorkOld.setTop(0);
		iWorkDao.update(iWorkNew);
		iWorkDao.update(iWorkOld);
		}
		return SUCCESS;
		
	}

	public int getTopicid() {
		return topicid;
	}

	public void setTopicid(int topicid) {
		this.topicid = topicid;
	}

	public int getCheckId() {
		return checkId;
	}

	public void setCheckId(int checkId) {
		this.checkId = checkId;
	}
	
	
}
