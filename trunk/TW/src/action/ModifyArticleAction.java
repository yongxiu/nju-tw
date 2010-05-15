package action;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import org.apache.struts2.interceptor.SessionAware;

import service.SortUtil;

import bean.GenericArticle;
import bean.User;

import com.opensymphony.xwork2.ActionSupport;

import dao.GenericArticleDao;
import dao.UserDao;

public class ModifyArticleAction extends ActionSupport implements SessionAware{
	/**
	 * list article to be modified
	 * wjc
	 */
	
	private ArrayList<GenericArticle> articles;
	private Map session;
	
	public String execute() {
		GenericArticleDao articleDao =  new GenericArticleDao();
		UserDao userDao = new UserDao();
		Long id = (Long) getSession().get("id");
		User user = userDao.getById(id);
	
		Set<GenericArticle> tempArticles = user.getArticles();
		articles = new ArrayList<GenericArticle>();
		for(GenericArticle articleTemp : tempArticles) {
			articles.add(articleTemp);
		}
		
		//sort articles by date
		articles = SortUtil.revertSort(articles);
		
		
		
		
		return SUCCESS;
	}

	

	public void setArticles(ArrayList<GenericArticle> articles) {
		this.articles = articles;
	}







	public ArrayList<GenericArticle> getArticles() {
		return articles;
	}



	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}
	
	
}
