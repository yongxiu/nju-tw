package action.brand;

import java.util.ArrayList;

import bean.Brand;

import com.opensymphony.xwork2.ActionSupport;

import dao.BrandDao;

public class BrandManageListAction extends ActionSupport{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -765268874265118207L;
	
	private ArrayList<Brand> brands;
	public String execute() {
		BrandDao orgDao = new BrandDao();
		setBrands((ArrayList<Brand>) orgDao.getAllEntity());

		return SUCCESS;
	}
	public void setBrands(ArrayList<Brand> brands) {
		this.brands = brands;
	}
	public ArrayList<Brand> getBrands() {
		return brands;
	}
	
	
}
