package action.brand;

import java.util.ArrayList;

import bean.Brand;

import com.opensymphony.xwork2.ActionSupport;

import dao.BrandDao;

public class BrandChangeAction extends ActionSupport{
	
	private int topicid;
	private String path;
	/**
	 * 
	 */
	private static final long serialVersionUID = -765268874265118207L;
	
	private ArrayList<Brand> brands;
	public String execute() {
		BrandDao brandDao = new BrandDao();
		setBrands((ArrayList<Brand>) brandDao.getAllEntity());
		Brand iWork = brandDao.getById(topicid);
		path = iWork.getPath();
		return SUCCESS;
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

	public void setBrands(ArrayList<Brand> brands) {
		this.brands = brands;
	}

	public ArrayList<Brand> getBrands() {
		return brands;
	}
	
	
}
