package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import bean.GenericArticle;

import com.opensymphony.xwork2.ActionSupport;

import dao.GenericArticleDao;

public class SelectImageAction extends ActionSupport implements SessionAware{
	private String imageValue;
	@SuppressWarnings("unchecked")
	private Map session;
	
	public String execute() {
		System.out.println(getImageValue());
		GenericArticleDao articleDao = new GenericArticleDao();
		GenericArticle article = (GenericArticle) getSession().get("article");
		article.setIshaveimage(true);
		
		article.setPath(getImageValue());
		
		articleDao.update(article);
		getSession().remove("article");
		return SUCCESS;
	}

	

	public String getImageValue() {
		return imageValue;
	}



	public void setImageValue(String imageValue) {
		this.imageValue = imageValue;
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
