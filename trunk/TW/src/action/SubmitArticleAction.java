package action;

import interceptor.UserInterceptor;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.IndexWriter;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import service.Category;
import service.GetImageFromArticle;
import service.LuceneIndexWriter;

import bean.GenericArticle;
import bean.User;

import com.opensymphony.xwork2.ActionSupport;

import dao.GenericArticleDao;
import dao.UserDao;

public class SubmitArticleAction extends ActionSupport implements SessionAware{
	private String content;

	private String title;

	private String category2;
	
	
	private Map session;
	
	//image paths
	ArrayList<String> imageStrings;

	public String execute() throws Exception {
		//test session
		System.out.println(getSession().get(UserInterceptor.USER_KEY));
		System.out.println(getSession().get("id"));
		////////
		
		
		// System.out.println(getContent());

		/**
		 * check the image path wjc
		 */
		GetImageFromArticle get = new GetImageFromArticle();
		imageStrings = get.getImage(getContent());
//		 for(String image : imageStrings) {
//		 System.out.println(image);
//		 }
		GenericArticleDao dao = new GenericArticleDao();
		UserDao userDao = new UserDao();
		User user = userDao.getById((Long) getSession().get("id"));
		GenericArticle article = new GenericArticle(getTitle(), new Date(),
				getContent(), user, Category.getCategory(getCategory2()),
				true, false, null);
		getSession().put("article", article);
		dao.create(article);
		
		//更新索引
		String INDEX_PATH = ServletActionContext.getServletContext().getRealPath("/")+"index";
		LuceneIndexWriter.updateIndex(INDEX_PATH, article);
		System.out.println("更新索引");
		
		if (imageStrings.isEmpty()) {

			
			
			//get user from session
			
			
			
			System.out.println(article.getContent());
			

			return SUCCESS;
		}
		
		else {
			return "imageSelect";
		}
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory2() {
		return category2;
	}

	public void setCategory2(String category2) {
		this.category2 = category2;
	}

	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}

	public ArrayList<String> getImageStrings() {
		return imageStrings;
	}

	public void setImageStrings(ArrayList<String> imageStrings) {
		this.imageStrings = imageStrings;
	}




	
}
