package action.navigation.page;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import service.SortUtil;

import bean.GenericArticle;

import com.opensymphony.xwork2.ActionSupport;

import dao.GenericArticleDao;

public class NaviPageAction extends ActionSupport implements SessionAware{
	private int category;
	private int currentPage;
	private Map session;
	private ArrayList<GenericArticle> articles;
	private ArrayList<String> pageCount;
	
	public String execute() {
		GenericArticleDao dao = new GenericArticleDao();
	    SortUtil sortUtil = new SortUtil();
		int number = 24;
	
		int count;
		//categoryd的处理
		if(category!=4) {
			category = getCategory();
			articles = dao.getArticlesByPage(currentPage, number, category);
			count = dao.getCountBycategory(category)/number+1;
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
		
		System.out.println("count:"+count);
		for(int i = 1;i<=count;i++) {
			pageCount.add(i+"");
		}
		
	
		return SUCCESS;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
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
