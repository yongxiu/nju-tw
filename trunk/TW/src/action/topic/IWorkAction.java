package action.topic;


import java.util.ArrayList;

import bean.IWork;

import com.opensymphony.xwork2.ActionSupport;

import dao.IWorkDao;

public class IWorkAction extends ActionSupport{

	/**
	 * @Yongxiu
	 */
	private static final long serialVersionUID = 1L;

	private IWork iworkone;
	private IWork iworktwo;
	public String execute() {
		IWorkDao iWorkDao = new IWorkDao();
		ArrayList<IWork> iWorks = iWorkDao.getTopIWorks();
		iworkone = iWorks.get(0);
		iworktwo = iWorks.get(1);
		return SUCCESS;
	}
	public IWork getIworkone() {
		return iworkone;
	}
	public void setIworkone(IWork iworkone) {
		this.iworkone = iworkone;
	}
	public IWork getIworktwo() {
		return iworktwo;
	}
	public void setIworktwo(IWork iworktwo) {
		this.iworktwo = iworktwo;
	}

	
}
