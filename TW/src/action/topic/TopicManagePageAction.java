package action.topic;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import service.ArticleTempService;
import service.Category;

import bean.GenericArticle;
import bean.temp.ArticleTemp;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.generic.NEW;

import dao.GenericArticleDao;
import dao.TopicImageDao;

public class TopicManagePageAction extends ActionSupport implements SessionAware {
	private int topicid;

	private int isnew;

	private String img;

	private ArrayList<ArticleTemp> articles;

	private Map session;

	private int currentPage;

	private int totalnumber;

	private int totalpages;

	private ArrayList<String> pageCount;

	public String execute() {
		articles = new ArrayList<ArticleTemp>();
		int number = 24;
		
		GenericArticleDao articleDao = new GenericArticleDao();
		ArrayList<GenericArticle> articlesTemp;

		TopicImageDao dao = new TopicImageDao();
		this.setImg(dao.getById(topicid).getPath());

		// old
		if (getIsnew() == 0) {
			articlesTemp = articleDao.getArticlesByPageTopSort(currentPage, number);

			// clone generic article to aritcleTemp
			for (GenericArticle b : articlesTemp) {
				ArticleTemp aTemp = new ArticleTemp();
				aTemp.setCategory(Category.getCategory(b.getCategory()));
				aTemp.setDate(b.getDate().toString());
				aTemp.setId((int) b.getId());
				aTemp.setTitle(b.getTitle());
				aTemp.setTopid(b.getTopic());
				articles.add(aTemp);
			}

			for (ArticleTemp a : articles) {
				if (a.getTopid() == topicid) {
					a.setChecked(1);
				} else {
					a.setChecked(0);
				}
			}
			
			
			
		}

		// new
		else {
			articlesTemp = articleDao.getArticlesByPageTopSort(currentPage, number);

			// clone generic article to aritcleTemp
			for (GenericArticle b : articlesTemp) {
				ArticleTemp aTemp = new ArticleTemp();
				aTemp.setCategory(Category.getCategory(b.getCategory()));
				aTemp.setDate(b.getDate().toString());
				aTemp.setId((int) b.getId());
				aTemp.setTitle(b.getTitle());
				aTemp.setTopid(b.getTopic());
				articles.add(aTemp);
			}
		}
		
		
		
		//initial
		totalnumber = articleDao.getAllArticleCount();
		totalpages = getPageCount(totalnumber, number);
		System.out.println("totalpages:"+totalpages);
		//init page count
		pageCount = new ArrayList<String>();
		for(int i = 1;i<=totalpages;i++) {
			pageCount.add(i+"");
		}
		return SUCCESS;
	}

	public int getTopicid() {
		return topicid;
	}

	public void setTopicid(int topicid) {
		this.topicid = topicid;
	}

	public int getIsnew() {
		return isnew;
	}

	public void setIsnew(int isnew) {
		this.isnew = isnew;
	}

	public ArrayList<ArticleTemp> getArticles() {
		return articles;
	}

	public void setArticles(ArrayList<ArticleTemp> articles) {
		this.articles = articles;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getImg() {
		return img;
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

	public int getPageCount(int count, int number) {
		int result;

		if (count % number == 0) {
			if (count == number)
				result = 0;
			else
				result = count / number;
		} else {
			if (count < number)
				result = 0;
			else
				result = count / number + 1;
		}

		return result;
	}

}
