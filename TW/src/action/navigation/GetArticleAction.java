package action.navigation;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.omg.CORBA.PRIVATE_MEMBER;

import service.Category;
import service.GetArticles;
import service.SortUtil;
import sun.print.resources.serviceui;

import bean.GenericArticle;

import com.opensymphony.xwork2.ActionSupport;

import dao.GenericArticleDao;

public class GetArticleAction extends ActionSupport implements SessionAware{
	/**
	 * 
	 */
	private Map session;
	private static final long serialVersionUID = 1L;
	private ArrayList<GenericArticle> articles;
	private ArrayList<String> pageCount;
	private int category;
	private int currentPage;
	
	public String execute() throws Exception {
		GenericArticleDao dao = new GenericArticleDao();
	    SortUtil sortUtil = new SortUtil();
		int number = 18;
		
		int count;
		//categoryd的处理
		setCategory(getCategory());
		if(category!=4) {
			category = getCategory();
			articles = dao.getArticlesByPage(currentPage, number, category);
			count = getPageCount(dao.getCountBycategory(category), number); 
			
		}
		
		else {
			articles = dao.getArticlesByPage(currentPage, number, 5, 6, 7, 8, 9);
			
			count = dao.getCountBycategory(5)+dao.getCountBycategory(6)
				+ dao.getCountBycategory(7) + dao.getCountBycategory(8)
					+ dao.getCountBycategory(9);
			
			count = getPageCount(count, number); 
		
		}
		
		//sort articles
		articles = sortUtil.revertSort(articles);
		
		//init page count
		pageCount = new ArrayList<String>();
		
	
		for(int i = 1;i<=count;i++) {
			pageCount.add(i+"");
		}
		
		
		
	
		
		return SUCCESS;
	}





	public ArrayList<GenericArticle> getArticles() {
		return articles;
	}





	public void setArticles(ArrayList<GenericArticle> articles) {
		this.articles = articles;
	}





	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}

	public ArrayList<String> getPageCount() {
		return pageCount;
	}

	public void setPageCount(ArrayList<String> pageCount) {
		this.pageCount = pageCount;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	
	public int getPageCount(int count,int number) {
		int result;
		
		
		if(count % number == 0) {
			if(count == number)
				result = 0;
			else 
				result = count/number;
		}
		else {
			if(count<number)
				result = 0;
			else 
				 result = count/number+1;
		}
		
		return result;
	}
	
	
	
}
