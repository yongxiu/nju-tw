package action;

import java.util.ArrayList;

import bean.Brand;

import com.opensymphony.xwork2.ActionSupport;

import dao.BrandDao;

public class BrandListAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Brand> entities;

	public String execute() {
		BrandDao userDao = new BrandDao();
		entities = (ArrayList<Brand>) userDao.getAllEntity();
		return SUCCESS;
	}
	
	public void setEntities(ArrayList<Brand> entities) {
		this.entities = entities;
	}

	public ArrayList<Brand> getEntities() {
		return entities;
	}
	
	
	
	
}
