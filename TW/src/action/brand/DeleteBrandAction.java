package action.brand;

import java.io.File;
import java.util.ArrayList;

import org.apache.struts2.ServletActionContext;

import bean.Brand;
import bean.GenericArticle;

import com.opensymphony.xwork2.ActionSupport;

import dao.BrandDao;
import dao.GenericArticleDao;

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
	private String message;
	public String execute() {
		BrandDao brandDao = new BrandDao();
		GenericArticleDao articleDao = new GenericArticleDao();
		ArrayList<GenericArticle> articles = articleDao.getArticlesByBrandId(id);
		Brand brand = brandDao.getById(getId());
		if(brand.getTop()==1) {
			setMessage("(删除失败)！首页的品牌项目主题不可删除！请先替换别的品牌项目主题");
			return ERROR;
		}
		//set brandit to zero
		for(GenericArticle article:articles) {
			article.setBrandid(0);
			articleDao.update(article);
		}
		
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
