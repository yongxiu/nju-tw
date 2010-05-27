package action;

import org.apache.struts2.ServletActionContext;

import bean.Article;
import bean.GenericArticle;

import com.opensymphony.xwork2.ActionSupport;

import dao.GenericArticleDao;

public class DetailArticleAction extends ActionSupport {
	/**
	 * wjc list article detail
	 */
	// the emtpy case
	private int empty;

	private int id; // article's id
	private GenericArticle article;

	public String execute() {

		GenericArticleDao articleDao = new GenericArticleDao();
		article = articleDao.getById(new Long(id));

		if (article == null) {
			empty = 1;
		} else {
			empty = 0;
		}

		return SUCCESS;

	}

	public int getEmpty() {
		return empty;
	}

	public void setEmpty(int empty) {
		this.empty = empty;
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
