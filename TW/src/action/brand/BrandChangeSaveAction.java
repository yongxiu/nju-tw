package action.brand;

import bean.Brand;
import bean.IWork;

import com.opensymphony.xwork2.ActionSupport;

import dao.BrandDao;
import dao.IWorkDao;

public class BrandChangeSaveAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6956065430772785228L;
	private int topicid;
	private int checkId;
	
	public String execute() {
		BrandDao brandDao = new BrandDao();
		Brand brandNew = brandDao.getById(checkId);
		Brand brandOld = brandDao.getById(topicid);
		if(brandNew.getTop()==1){
			System.out.println(brandNew.getName());
			System.out.println(brandNew.getTop());
			return ERROR;
		}
		else if(checkId!=topicid) {
		
		brandNew.setTop(1);
		brandOld.setTop(0);
		brandDao.update(brandNew);
		brandDao.update(brandOld);
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
