package action;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Map;

import org.apache.lucene.search.Hits;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import service.page.PageService;

import bean.temp.ArticleTemp;

import com.opensymphony.xwork2.ActionSupport;

public class PageAction extends ActionSupport implements SessionAware{
	/**
	 * page function
	 */
	
	private ArrayList<ArticleTemp> articles;

	private Map session;

	private ArrayList<String> pageCount;
	
	private int currentPage;
	
	private String pages;
	
	//current page
	private int pp;
	
	//query string
	private String search;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		
		
		//get objs from session 
		search  = new String(search.getBytes("ISO-8859-1"), "utf-8");
		System.out.println(search);
		Hits hits = (Hits) getSession().get("hits"+search);
		System.out.println("hits length ：　"+hits.length());
		pageCount = (ArrayList<String>) getSession().get("pageCount"+search);
		
	
		//pages
		pages = (String) getSession().get("pages"+search);
		
		System.out.println("pValue : "+pp);


		int pages = PageService.countPage(hits.length());
		articles = PageService.getArticleByPage(pp, pages, hits);
		
		//add current page to sessin
		getSession().put("currentPage"+search, pp+"");
		currentPage = pp ;
		//add page count to session
		
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

	public ArrayList<String> getPageCount() {
		return pageCount;
	}

	public void setPageCount(ArrayList<String> pageCount) {
		this.pageCount = pageCount;
	}

	public int getPp() {
		return pp;
	}

	public void setPp(int pp) {
		this.pp = pp;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}



	public int getCurrentPage() {
		return currentPage;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	
	
	

	
	
	
	
}
