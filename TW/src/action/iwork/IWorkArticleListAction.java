package action.iwork;

import java.util.ArrayList;

import service.Category;


import bean.GenericArticle;
import bean.temp.ArticleTemp;

import com.opensymphony.xwork2.ActionSupport;

import dao.GenericArticleDao;

public class IWorkArticleListAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<ArticleTemp> articles;
	private int iworkid;
	
	public String execute() throws Exception {
		articles = new ArrayList<ArticleTemp>();
		GenericArticleDao articleDao =  new GenericArticleDao();
	
//		Set<GenericArticle> tempArticles = user.getArticles();
		ArrayList<GenericArticle> articlesG ;
//		for(GenericArticle articleTemp : tempArticles) {
//			articlesG.add(articleTemp);
//		}
//		
//		//sort articles by date
//		articlesG = SortUtil.revertSort(articlesG);
		
		//top sort
		articlesG = articleDao.getArticlesByIWorkId(getIworkid());
		
		//clone generic article to aritcleTemp
		for(GenericArticle a : articlesG) {
			ArticleTemp aTemp = new ArticleTemp();
			aTemp.setCategory(Category.getCategory(a.getCategory()));
			aTemp.setDate(a.getDate().toString());
			aTemp.setId((int) a.getId());
			aTemp.setTitle(a.getTitle());
			aTemp.setBrandiworkName(articleDao.getNameByIWork(a.getId()));
			articles.add(aTemp);
		}
		return SUCCESS;
	}


	public void setIworkid(int iworkid) {
		this.iworkid = iworkid;
	}

	public int getIworkid() {
		return iworkid;
	}


	public void setArticles(ArrayList<ArticleTemp> articles) {
		this.articles = articles;
	}


	public ArrayList<ArticleTemp> getArticles() {
		return articles;
	}
	
}
