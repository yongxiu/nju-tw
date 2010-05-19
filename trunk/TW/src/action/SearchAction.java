package action;

import java.io.IOException;
import java.util.Date;
import java.util.ArrayList;
import java.util.Map;

import org.apache.lucene.document.Document;
import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.search.Hits;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import service.Category;
import service.LuceneSearch;
import service.page.PageService;

import bean.GenericArticle;
import bean.temp.ArticleTemp;

import com.opensymphony.xwork2.ActionSupport;

import dao.GenericArticleDao;

public class SearchAction extends ActionSupport implements SessionAware {
	/**
	 * Author: wjc usage: search artile with specific title
	 */
	// article id
	private ArrayList<ArticleTemp> articles;

	private String search;

	private Map session;

	private ArrayList<String> pageCount;
	
	private int currentPage;
	
	private String pages;
	
	private int number;
	
	private long time;

	public String execute() {
		//time
		long start,end;
		
		String INDEX_PATH = ServletActionContext.getServletContext()
				.getRealPath("/")
				+ "index";
		Document doc = null;
		articles = new ArrayList<ArticleTemp>();
		Hits hits = null;
		try {
			//start time
			Date datestart = new Date();
			start = datestart.getTime();
			
			if(getSession().get("hits"+search)!=null)
				hits = (Hits) getSession().get("hits"+search);
			else {
				hits = LuceneSearch.search(search, INDEX_PATH);
			}
			
			//end time
			Date endtart = new Date();
			end = endtart.getTime();
			time = end - start;
			
			//add time to session
			getSession().put("time", time);
			System.out.println(time);

			// add hits to session
			getSession().put("hits"+search, hits);

			//get page count
			pageCount = new ArrayList<String>();
			
			int pages = PageService.countPage(hits.length());
			//add pages to the session
			getSession().put("pages"+search, pages+"");
			this.pages = pages+"";
			
			//get articles
			articles = PageService.getArticleByPage(1, pages, hits);
			
			for (int i = 1; i <= pages; i++) {
				pageCount.add(i+"");
			}

			// add pageCount to session
			getSession().put("pageCount"+search, pageCount);

			// add current page to session
			currentPage = 1;
			getSession().put("currentPage"+search, currentPage);
			
			//add number to session
			number = hits.length();
			getSession().put("number", number);

		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return SUCCESS;
	}

	public ArrayList<ArticleTemp> getArticles() {
		return articles;
	}

	public void setArticles(ArrayList<ArticleTemp> articles) {
		this.articles = articles;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
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

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	
	
}
