package action;

import java.util.ArrayList;

import service.ArticleService;
import service.ArticleTempService;
import service.GetArticles;
import bean.GenericArticle;
import bean.temp.ArticleTemp;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class PicnewsAction extends ActionSupport{
	/**
	 * update pic news
	 */
	//five pic news
	private ArticleTemp picnews1;
	private ArticleTemp picnews2;
	private ArticleTemp picnews3;
	private ArticleTemp picnews4;
	private ArticleTemp picnews5;
	
	
	public String execute() throws Exception {
		GetArticles service = new GetArticles();
		ArticleTempService articleTempService = new ArticleTempService();
		ArticleService articleService = new ArticleService();
		ArrayList<GenericArticle> articles = service.GetFivePicnews();
		//assign to pic news
		GenericArticle article1 = articles.get(0);
		GenericArticle article2 = articles.get(1);
		GenericArticle article3 = articles.get(2);
		GenericArticle article4 = articles.get(3);
		GenericArticle article5 = articles.get(4);
		
		picnews1 = new ArticleTemp();
		picnews2 = new ArticleTemp();
		picnews3 = new ArticleTemp();
		picnews4 = new ArticleTemp();
		picnews5 = new ArticleTemp();
		
		//set path
		picnews1.setPath(article1.getPath());
		picnews2.setPath(article2.getPath());
		picnews3.setPath(article3.getPath());
		picnews4.setPath(article4.getPath());
		picnews5.setPath(article5.getPath());
		
		//set title
		picnews1.setTitle(article1.getTitle());
		picnews2.setTitle(article2.getTitle());
		picnews3.setTitle(article3.getTitle());
		picnews4.setTitle(article4.getTitle());
		picnews5.setTitle(article5.getTitle());
		
		//set introduce
		String introduce1 = articleTempService.getIntroduce(articleService.getPureStringFromHtml(article1.getContent()));
		String introduce2 = articleTempService.getIntroduce(articleService.getPureStringFromHtml(article2.getContent()));
		String introduce3 = articleTempService.getIntroduce(articleService.getPureStringFromHtml(article3.getContent()));
		String introduce4 = articleTempService.getIntroduce(articleService.getPureStringFromHtml(article4.getContent()));
		String introduce5 = articleTempService.getIntroduce(articleService.getPureStringFromHtml(article5.getContent()));
		
		picnews1.setIntroduce(introduce1);
		picnews2.setIntroduce(introduce2);
		picnews3.setIntroduce(introduce3);
		picnews4.setIntroduce(introduce4);
		picnews5.setIntroduce(introduce5);
		
		
		
		return SUCCESS;
	}


	public ArticleTemp getPicnews1() {
		return picnews1;
	}


	public void setPicnews1(ArticleTemp picnews1) {
		this.picnews1 = picnews1;
	}


	public ArticleTemp getPicnews2() {
		return picnews2;
	}


	public void setPicnews2(ArticleTemp picnews2) {
		this.picnews2 = picnews2;
	}


	public ArticleTemp getPicnews3() {
		return picnews3;
	}


	public void setPicnews3(ArticleTemp picnews3) {
		this.picnews3 = picnews3;
	}


	public ArticleTemp getPicnews4() {
		return picnews4;
	}


	public void setPicnews4(ArticleTemp picnews4) {
		this.picnews4 = picnews4;
	}


	public ArticleTemp getPicnews5() {
		return picnews5;
	}


	public void setPicnews5(ArticleTemp picnews5) {
		this.picnews5 = picnews5;
	}



   
	
}
