package action.iwork;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import service.Category;

import com.opensymphony.xwork2.ActionSupport;

import dao.BrandDao;
import dao.CategoryDao;
import dao.GenericArticleDao;
import dao.IWorkDao;
import dao.TopicImageDao;

import bean.GenericArticle;
import bean.IWork;
import bean.temp.ArticleTemp;

public class IWorkModifyAction extends ActionSupport implements SessionAware{
	private int topicid;
	


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
		CategoryDao categoryDao = new CategoryDao();
		
		GenericArticleDao articleDao = new GenericArticleDao();
		ArrayList<GenericArticle> articlesTemp;

		IWorkDao iWorkDao = new IWorkDao();
		IWork iWork = iWorkDao.getById(topicid);
		BrandDao brandDao = new BrandDao();
		img = iWork.getPath();
		
		articlesTemp = articleDao.getArticlesByPageTopSort(currentPage, number);

		// clone generic article to aritcleTemp
		for (GenericArticle b : articlesTemp) {
			ArticleTemp aTemp = new ArticleTemp();
			if(b.getCategory()!=0){
				aTemp.setCategory(categoryDao.getNameByCategory(b.getCategory()));
			}
			else if (b.getCategory()==0&&b.getBrandid()!=0) {
				aTemp.setCategory(brandDao.getNameById(b.getBrandid()));
			}
			else if(b.getCategory()==0&&b.getBrandid()==0&&b.getIworkid()!=0){
				aTemp.setCategory(iWorkDao.getNameById(b.getIworkid()));
			}
			else {
				aTemp.setCategory("其他");
			}
			
			
			aTemp.setDate(b.getDate().toString());
			aTemp.setId((int) b.getId());
			aTemp.setTitle(b.getTitle());
			aTemp.setIworkid(b.getIworkid());
			articles.add(aTemp);
		}

		for (ArticleTemp a : articles) {
			if (a.getIworkid() == topicid) {
				
				a.setChecked(1);
			} else {
				
				a.setChecked(0);
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

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
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
