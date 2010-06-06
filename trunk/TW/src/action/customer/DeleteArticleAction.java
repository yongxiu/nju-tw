package action.customer;

import java.io.IOException;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import service.LuceneIndexWriter;

import bean.GenericArticle;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.generic.NEW;

import dao.GenericArticleDao;

public class DeleteArticleAction extends ActionSupport implements SessionAware {

	String[] checkId;
	private Map session;

	public String execute() throws Exception {
		long uid = (Long) getSession().get("id");
		GenericArticleDao articleDao = new GenericArticleDao();
		GenericArticle article = null;
		String INDEX_PATH = ServletActionContext.getServletContext()
				.getRealPath("/")
				+ "index";
		long id;
		for (int i = 0; i < checkId.length; i++) {
			id = Long.parseLong(checkId[i]);
			System.out.println(id);
			article = articleDao.getById(id);
			
			if(article.getUser().getId() == uid) {
				// delete index
				LuceneIndexWriter.deleteIndex(INDEX_PATH, article);
				System.out.println("delete index");
	
				// delete article
				articleDao.delete(id);
				System.out.println("delete article:" + id);
			}
		}

		return SUCCESS;
	}

	public String[] getCheckId() {
		return checkId;
	}

	public void setCheckId(String[] checkId) {
		this.checkId = checkId;
	}
	
	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}

}
