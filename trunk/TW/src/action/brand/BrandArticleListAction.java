package action.brand;

import java.util.ArrayList;

import service.Category;

import bean.GenericArticle;
import bean.temp.ArticleTemp;

import com.opensymphony.xwork2.ActionSupport;

import dao.GenericArticleDao;

public class BrandArticleListAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<ArticleTemp> articles;
	public ArrayList<ArticleTemp> getArticles() {
		return articles;
	}


	public void setArticles(ArrayList<ArticleTemp> articles) {
		this.articles = articles;
	}


	private int brandid;
	
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
		articlesG = articleDao.getArticlesByBrandId(getBrandid());
		
		//clone generic article to aritcleTemp
		for(GenericArticle a : articlesG) {
			ArticleTemp aTemp = new ArticleTemp();
			aTemp.setCategory(Category.getCategory(a.getCategory()));
			aTemp.setDate(a.getDate().toString());
			aTemp.setId((int) a.getId());
			aTemp.setTitle(a.getTitle());
			aTemp.setBrandiworkName(articleDao.getNameByBrand(a.getId()));
			articles.add(aTemp);
		}
		
		return SUCCESS;
	}


	public void setBrandid(int brandid) {
		this.brandid = brandid;
	}


	public int getBrandid() {
		return brandid;
	}	
	
}
