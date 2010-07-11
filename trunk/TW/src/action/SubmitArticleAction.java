package action;

import interceptor.GeneralInterceptor;
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
import com.sun.org.apache.bcel.internal.generic.NEW;

import dao.BrandDao;
import dao.CategoryDao;
import dao.GenericArticleDao;
import dao.IWorkDao;
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
	
	private String message;
	
	
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
		//deal with new category 2010-7-11
		CategoryDao categoryDao = new CategoryDao();
		BrandDao brandDao = new BrandDao();
		IWorkDao iWorkDao = new IWorkDao();
		int iworkid=0;
		int brandid=0;
		
		GetImageFromArticle get = new GetImageFromArticle();
		imageStrings = get.getImage(getContent());

		GenericArticleDao dao = new GenericArticleDao();
		UserDao userDao = new UserDao();
		User user = userDao.getById((Long) getSession().get("id"));
	    
		//two category
		int category=0;
		if(getCategory2().equals("—— ——")) {
			category = categoryDao.getCategoryByName(getCategory1());
		}
		else if(getCategory1().equals("重点工作")){
			
			iworkid = iWorkDao.getIdByName(getCategory2());
		}
		else if (getCategory1().equals("品牌项目")) {
		
			brandid = brandDao.getIdByName(getCategory2());
		}
		else {
			category = categoryDao.getCategoryByName(getCategory2());
		}
		GenericArticle article = new GenericArticle(getTitle(), new Date(),
				getContent(), user, category,
				true, false, null);
		article.setBrandid(brandid);
		article.setIworkid(iworkid);
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

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	


	
}
