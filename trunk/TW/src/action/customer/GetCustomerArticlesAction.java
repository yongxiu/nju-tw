package action.customer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.struts2.interceptor.SessionAware;

import service.Category;
import service.SortUtil;

import bean.GenericArticle;
import bean.temp.ArticleTemp;

import com.opensymphony.xwork2.ActionSupport;

import dao.GenericArticleDao;

public class GetCustomerArticlesAction extends ActionSupport implements SessionAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * list all article to be modified
	 * @author Yongxiu
	 */
	
	private ArrayList<ArticleTemp> articles;
	private Map session;
	private int currentPage;
	private int totalnumber;
	private int totalpages;
	private ArrayList<String> pageCount;
	
	
	public String execute() {
		long uid = (Long) getSession().get("id");
		articles = new ArrayList<ArticleTemp>();
		GenericArticleDao articleDao =  new GenericArticleDao();
		int number =24;
		currentPage = 1;
//		Set<GenericArticle> tempArticles = new HashSet<GenericArticle>(articleDao.getAllEntity());
		
		ArrayList<GenericArticle> articlesG = articleDao.getArticlesByUserPage(uid, currentPage, number);
//		for(GenericArticle articleTemp : tempArticles) {
//			articlesG.add(articleTemp);
//		}
		
//		//sort articles by date
//		articlesG = SortUtil.revertSort(articlesG);
		
		//initial
		totalnumber = articleDao.getCountByUser(uid);
		totalpages = getPageCount(totalnumber, number);
		
		//init page count
		pageCount = new ArrayList<String>();
		
		
		for(int i = 1;i<=totalpages;i++) {
			pageCount.add(i+"");
		}
		
		
		//
		//clone generic article to aritcleTemp
		for(GenericArticle a : articlesG) {
			ArticleTemp aTemp = new ArticleTemp();
			aTemp.setCategory(Category.getCategory(a.getCategory()));
			aTemp.setDate(a.getDate().toString());
			aTemp.setId((int) a.getId());
			aTemp.setTitle(a.getTitle());
			aTemp.setOwner(a.getUser().getName());
			aTemp.setIstop(a.getIstop());
			articles.add(aTemp);
		}
		
		
		return SUCCESS;
	}

	


	public ArrayList<ArticleTemp> getArticles() {
		return articles;
	}




	public void setArticles(ArrayList<ArticleTemp> articles) {
		this.articles = articles;
	}




	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}




	public int getCurrentPage() {
		return currentPage;
	}




	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}




	public int getTotalnumber() {
		return totalnumber;
	}




	public void setTotalnumber(int totalnumber) {
		this.totalnumber = totalnumber;
	}




	public int getTotalpages() {
		return totalpages;
	}




	public void setTotalpages(int totalpages) {
		this.totalpages = totalpages;
	}




	public ArrayList<String> getPageCount() {
		return pageCount;
	}




	public void setPageCount(ArrayList<String> pageCount) {
		this.pageCount = pageCount;
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
