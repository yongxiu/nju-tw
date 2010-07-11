package action.brand;

import bean.Brand;

import com.opensymphony.xwork2.ActionSupport;

import dao.BrandDao;

public class BrandChangeSaveAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6956065430772785228L;
	private int topicid;
	private int checkId;
	
	public String execute() {
		BrandDao brandDao = new BrandDao();
		if(checkId!=topicid) {
		Brand iWorkNew = brandDao.getById(checkId);
		Brand iWorkOld = brandDao.getById(topicid);
		iWorkNew.setTop(1);
		iWorkOld.setTop(0);
		brandDao.update(iWorkNew);
		brandDao.update(iWorkOld);
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
