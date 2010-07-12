package action.brand;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.omg.CORBA.PRIVATE_MEMBER;

import service.Category;
import service.GetArticles;
import service.SortUtil;
import sun.print.resources.serviceui;

import bean.GenericArticle;

import com.opensymphony.xwork2.ActionSupport;

import dao.GenericArticleDao;

public class BrandArticleListAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<GenericArticle> articles;
	private int brandid;
	
	public String execute() throws Exception {
		GenericArticleDao dao = new GenericArticleDao();
		setArticles(dao.getArticlesByBrandId(getBrandid()));
		
		return SUCCESS;
	}

	public ArrayList<GenericArticle> getArticles() {
		return articles;
	}

	public void setArticles(ArrayList<GenericArticle> articles) {
		this.articles = articles;
	}


	public void setBrandid(int brandid) {
		this.brandid = brandid;
	}


	public int getBrandid() {
		return brandid;
	}	
	
}
