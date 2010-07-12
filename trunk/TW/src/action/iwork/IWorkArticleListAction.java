package action.iwork;

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

public class IWorkArticleListAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<GenericArticle> articles;
	private int iworkid;
	
	public String execute() throws Exception {
		GenericArticleDao dao = new GenericArticleDao();
		setArticles(dao.getArticlesByIWorkId(getIworkid()));
		
		return SUCCESS;
	}

	public ArrayList<GenericArticle> getArticles() {
		return articles;
	}

	public void setArticles(ArrayList<GenericArticle> articles) {
		this.articles = articles;
	}

	public void setIworkid(int iworkid) {
		this.iworkid = iworkid;
	}

	public int getIworkid() {
		return iworkid;
	}
	
}
