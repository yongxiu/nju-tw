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

	public String execute() {
		
		String INDEX_PATH = ServletActionContext.getServletContext()
				.getRealPath("/")
				+ "index";
		Document doc = null;
		articles = new ArrayList<ArticleTemp>();

		try {
			Hits hits = LuceneSearch.search(search, INDEX_PATH);
//			for (int i = 0; i < hits.length(); i++) {
//				doc = hits.doc(i);
//				ArticleTemp article = new ArticleTemp();
//				article.setId(Integer.parseInt(doc.get("id")));
//				article.setTitle(doc.get("title"));
//				article.setCategory(doc.get("category"));
//				article.setDate(doc.get("date"));
//				articles.add(article);
//
//			}
			
			

			// add hits to session
			getSession().put("hits"+search, hits);

			//get page count
			pageCount = new ArrayList<String>();
			
			int pages = PageService.countPage(hits.length());
			
			//get articles
			articles = PageService.getArticleByPage(1, pages, hits);
			
			for (int i = 1; i <= pages; i++) {
				pageCount.add(i+"");
			}

			// add pageCount to session
			getSession().put("pageCount"+search, pageCount);

			// add current page to session
			String currentPage = "1";
			getSession().put("currentPage"+search, currentPage);

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


	
}
