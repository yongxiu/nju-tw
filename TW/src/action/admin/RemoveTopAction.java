package action.admin;

import bean.GenericArticle;

import com.opensymphony.xwork2.ActionSupport;

import dao.GenericArticleDao;

public class RemoveTopAction extends ActionSupport{
	private long articleId;
	public String execute() {
		System.out.println(articleId);
		GenericArticleDao articleDao = new GenericArticleDao();
		GenericArticle article = articleDao.getById(articleId);
		article.setIstop(0);
		articleDao.update(article);
		return SUCCESS;
	}
	public long getArticleId() {
		return articleId;
	}
	public void setArticleId(long articleId) {
		this.articleId = articleId;
	}
	
	
}
