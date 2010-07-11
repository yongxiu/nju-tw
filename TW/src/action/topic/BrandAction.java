package action.topic;

import java.util.ArrayList;

import bean.Brand;

import com.opensymphony.xwork2.ActionSupport;

import dao.BrandDao;

public class BrandAction extends ActionSupport{
	private Brand brandone;
	private Brand brandtwo;
	private Brand brandthree;
	
	public String execute() {
		System.out.println("into action");
		BrandDao brandDao = new BrandDao();
		ArrayList<Brand> brands = brandDao.getTopBrands();
		brandone = brands.get(0);
		brandtwo = brands.get(1);
		brandthree = brands.get(2);
		System.out.println(brandone.getPath());
		return SUCCESS;
	}

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
	
	
}
