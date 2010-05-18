package action;

import interceptor.UserInterceptor;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
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
	/**
	 * 
	 */
	private static final long serialVersionUID = 8372001051631250847L;

	private String content;

	private String title;

	private String category2;
	
	private String category1;
	
	
	@SuppressWarnings("unchecked")
	private Map session;
	
	//image paths
	ArrayList<String> imageStrings;

	@SuppressWarnings("unchecked")
	public String execute() throws Exception {
		//test session
//		System.out.println(getSession().get(UserInterceptor.USER_KEY));
//		System.out.println(getSession().get("id"));
		
		/**
		 * check the image path wjc
		 */
		GetImageFromArticle get = new GetImageFromArticle();
		imageStrings = get.getImage(getContent());

		GenericArticleDao dao = new GenericArticleDao();
		UserDao userDao = new UserDao();
		User user = userDao.getById((Long) getSession().get("id"));
	    
		//two category
		int category;
		if(getCategory2().equals("—— ——")) {
			category = Category.getCategory(getCategory1());
		}
		else {
			category = Category.getCategory(getCategory2());
		}
		GenericArticle article = new GenericArticle(getTitle(), new Date(),
				getContent(), user, category,
				true, false, null);
		getSession().put("article", article);
		dao.create(article);
		
		//更新索引
		String INDEX_PATH = ServletActionContext.getServletContext().getRealPath("/")+"index";
		LuceneIndexWriter.updateIndex(INDEX_PATH, article);
		System.out.println("更新索引");
		
		if (imageStrings.isEmpty()) {
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

	@SuppressWarnings("unchecked")
	public Map getSession() {
		return session;
	}

	@SuppressWarnings("unchecked")
	public void setSession(Map session) {
		this.session = session;
	}

	public ArrayList<String> getImageStrings() {
		return imageStrings;
	}

	public void setImageStrings(ArrayList<String> imageStrings) {
		this.imageStrings = imageStrings;
	}

	public String getCategory1() {
		return category1;
	}

	public void setCategory1(String category1) {
		this.category1 = category1;
	}

	


	
}
