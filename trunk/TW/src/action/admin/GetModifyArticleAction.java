package action.admin;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import org.apache.struts2.interceptor.SessionAware;

import service.Category;
import service.SortUtil;

import bean.GenericArticle;
import bean.User;
import bean.temp.ArticleTemp;

import com.opensymphony.xwork2.ActionSupport;

import dao.GenericArticleDao;
import dao.UserDao;

public class GetModifyArticleAction extends ActionSupport implements SessionAware{
	/**
	 * list article to be modified
	 * wjc
	 */
	
	private ArrayList<ArticleTemp> articles;
	private Map session;
	
	public String execute() {
		articles = new ArrayList<ArticleTemp>();
		GenericArticleDao articleDao =  new GenericArticleDao();
		UserDao userDao = new UserDao();
		Long id = (Long) getSession().get("id");
		User user = userDao.getById(id);
	
		Set<GenericArticle> tempArticles = user.getArticles();
		ArrayList<GenericArticle> articlesG = new ArrayList<GenericArticle>();
		for(GenericArticle articleTemp : tempArticles) {
			articlesG.add(articleTemp);
		}
		
		//sort articles by date
		articlesG = SortUtil.revertSort(articlesG);
		
		//clone generic article to aritcleTemp
		for(GenericArticle a : articlesG) {
			ArticleTemp aTemp = new ArticleTemp();
			aTemp.setCategory(Category.getCategory(a.getCategory()));
			aTemp.setDate(a.getDate().toString());
			aTemp.setId((int) a.getId());
			aTemp.setTitle(a.getTitle());
			articles.add(aTemp);
		}
		
		
		return SUCCESS;
	}

	


	public ArrayList<ArticleTemp> getArticles() {
		return articles;
	}




	public void setArticles(ArrayList<ArticleTemp> articles) {
		this.articles = articles;
	}




	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}
	
	
}
