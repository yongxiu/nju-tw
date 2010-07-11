package action.brand;


import java.util.ArrayList;

import bean.Brand;

import com.opensymphony.xwork2.ActionSupport;

import dao.BrandDao;

public class BrandHomeAction extends ActionSupport{

	/**
	 * @Yongxiu
	 */
	private static final long serialVersionUID = 1L;

	private Brand brandone;
	public Brand getBrandone() {
		return brandone;
	}

	public void setBrandone(Brand brandone) {
		this.brandone = brandone;
	}

	public Brand getBrandtwo() {
		return brandtwo;
	}

	public void setBrandtwo(Brand brandtwo) {
		this.brandtwo = brandtwo;
	}

	public Brand getBrandthree() {
		return brandthree;
	}

	public void setBrandthree(Brand brandthree) {
		this.brandthree = brandthree;
	}

	private Brand brandtwo;
	private Brand brandthree;
	
	public String execute() {
		BrandDao brandDao = new BrandDao();
		ArrayList<Brand> brands = brandDao.getTopBrands();
		brandone = brands.get(0);
		brandtwo = brands.get(1);
		brandthree = brands.get(1);
		return SUCCESS;
	}

	
}
