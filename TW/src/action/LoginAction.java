package action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.apache.struts2.interceptor.SessionAware;

import bean.Article;
import bean.GenericArticle;
import bean.User;

import com.opensymphony.xwork2.ActionSupport;

import dao.ArticleDao;
import dao.GenericArticleDao;
import dao.UserDao;


public class LoginAction extends ActionSupport{
	
	private String username;
	private String password;
	
	private static final long serialVersionUID = 1L;

	public String execute()throws Exception {
		if(username.equals("1")&&password.equals("1"))
			return SUCCESS;	
		
		/**
		 * test the hibernate CRUD
		 */
//		ArticleDao articleDao=new ArticleDao();
//		List<Article> articles=articleDao.getAllEntity();
//		for(Article article:articles){
//			System.out.println(article.getId()+" : "+article.getTitle()+" : "+article.getContent());
//		}
		
		
		
		/**
		 * test create an article, success
		 */
		
//		UserDao userDAO=new UserDao();
//		GenericArticleDao articleDao=new GenericArticleDao();
//		User user1=userDAO.getById(new Long(1));
//		GenericArticle article1=new GenericArticle("title1", new Date(), "content1", user1,1, false);
//		
//	
//		
//		articleDao.create(article1);
//		
		GenericArticleDao dao=new GenericArticleDao();
		List<GenericArticle> articles=dao.getAllEntity();
		List<GenericArticle> news=new ArrayList<GenericArticle>();
		for(GenericArticle a:articles){
			if(a.getCategory()==0)
				news.add(a);
		}
		
		for(GenericArticle n:news)
		System.out.println(n.getCategory()+":"+n.getContent());
		
		
		
		
	
		
		return INPUT;
		
		
		
	}

	public void setSession(Map arg0) {
		// TODO Auto-generated method stub
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
