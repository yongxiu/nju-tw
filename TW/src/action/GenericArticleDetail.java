package action;

import bean.GenericArticle;

import com.opensymphony.xwork2.ActionSupport;

import dao.GenericArticleDao;

public class GenericArticleDetail extends ActionSupport{
	//show generic article's detail
	private int id;
	private GenericArticle article;
	public String execute() {
		GenericArticleDao articleDao = new GenericArticleDao();
		article = articleDao.getById(new Long(id));
		return SUCCESS;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public GenericArticle getArticle() {
		return article;
	}
	public void setArticle(GenericArticle article) {
		this.article = article;
	}
	
	
}
