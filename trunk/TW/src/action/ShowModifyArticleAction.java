package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import bean.GenericArticle;

import com.opensymphony.xwork2.ActionSupport;


import dao.GenericArticleDao;

public class ShowModifyArticleAction extends ActionSupport implements SessionAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 112102139212359360L;
	private GenericArticle article;
	private int id;
	@SuppressWarnings("unchecked")
	private Map session;
	
	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		GenericArticleDao articleDao = new GenericArticleDao();
		article = articleDao.getById(new Long(id));
		getSession().put("articlem",article);
		return SUCCESS;
		
	}


	public GenericArticle getArticle() {
		return article;
	}


	public void setArticle(GenericArticle article) {
		this.article = article;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@SuppressWarnings("unchecked")
	public Map getSession() {
		return session;
	}


	@SuppressWarnings("unchecked")
	public void setSession(Map session) {
		this.session = session;
	}
	
	
}
