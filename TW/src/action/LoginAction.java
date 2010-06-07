package action;

import interceptor.UserInterceptor;

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

import service.ValidateUser;

import FinalValue.UserRole;
import bean.Article;
import bean.GenericArticle;
import bean.User;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.generic.NEW;

import dao.ArticleDao;
import dao.GenericArticleDao;
import dao.UserDao;


public class LoginAction extends ActionSupport implements SessionAware{
	
	private String username;
	private String password;
	private int role;
	private String name;
	private User user;
	private Map session;
	
	

	
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public String execute()throws Exception {
			 ValidateUser validateUser=new ValidateUser();
			 //judge if username or password is null
			 if(getUsername()==null || getUsername().equals("")){
				 System.out.println("username is null");
				 addFieldError("usernameError", "用户名不能为空");
				 return INPUT;
			 }
			 
			 if(getPassword()==null || getPassword().equals("")){
				 System.out.println("password is null");
				 addFieldError("passwordError", "密码不能为空");
				 return INPUT;
			 }
			 
			 //validate user
		
			 User user=validateUser.validate(getUsername(),getPassword());
			
			 if(user!=null){
				role=user.getRole();
				name=user.getName();
				System.out.println(role+ " : "+user.getUsername());
				
				
				System.out.println(name+" is login");
				getSession().put(UserInterceptor.USER_KEY, user.getUsername());
				getSession().put("name", getName());
			
				getSession().put("id", new Long(user.getId()));
				getSession().put("user", user);
				getSession().put("role", user.getRole());
				return SUCCESS;
			 }
			 else {
				addActionError("用户名或密码错误!");
				return INPUT;
			}
		
		
	
		
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
//		GenericArticleDao dao=new GenericArticleDao();
//		List<GenericArticle> articles=dao.getAllEntity();
//		List<GenericArticle> news=new ArrayList<GenericArticle>();
//		for(GenericArticle a:articles){
//			if(a.getCategory()==0)
//				news.add(a);
//		}
//		
//		for(GenericArticle n:news)
//		System.out.println(n.getCategory()+":"+n.getContent());
//		
//		
//		
//		
//	
//		
//		return INPUT;
		
		
		
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}







	public Map getSession() {
		return session;
	}



	public void setSession(Map session) {
		this.session = session;
	}



	public int getRole() {
		return role;
	}



	public void setRole(int role) {
		this.role = role;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
