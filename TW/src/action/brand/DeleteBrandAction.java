package action.brand;

import java.io.File;

import org.apache.struts2.ServletActionContext;

import bean.Brand;

import com.opensymphony.xwork2.ActionSupport;

import dao.BrandDao;

public class DeleteBrandAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = -502940456343686858L;
	/**
	 * Delete iwork
	 * CYX
	 */
	private int id;
	public String execute() {
		BrandDao brandDao = new BrandDao();
		Brand brand = brandDao.getById(getId());
		String currentPath = ServletActionContext.getServletContext().getRealPath(brand.getPath().substring(3));

		boolean success = new File(currentPath).delete();
		if(success) {
			brandDao.delete(getId());
		}
		return SUCCESS;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
