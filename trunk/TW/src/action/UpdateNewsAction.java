package action;

import java.util.ArrayList;

import service.DateFormatService;
import service.GetArticles;

import bean.GenericArticle;
import bean.temp.ArticleTemp;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateNewsAction extends ActionSupport{
	/**
	 * wjc 
	 * usage: update news
	 */
	private static final long serialVersionUID = 5843553509139320770L;
	//five news to be displayed

	ArrayList<ArticleTemp> news;
	
	//Get service
	
	public String execute(){
	
		GetArticles service = new GetArticles();
		DateFormatService dateFormatService = new DateFormatService();
		ArrayList<GenericArticle> newsG=service.getSomeNews();
		news = new ArrayList<ArticleTemp>();
		ArticleTemp articleTemp;
		for(GenericArticle article:newsG) {
			articleTemp = new ArticleTemp();
			articleTemp.setId(article.getId());
			articleTemp.setTitle(article.getTitle());
			articleTemp.setDate(dateFormatService.changeDateToStrig(article.getDate()));
			news.add(articleTemp);
		}
		
		return SUCCESS;
	}

	public ArrayList<ArticleTemp> getNews() {
		return news;
	}

	public void setNews(ArrayList<ArticleTemp> news) {
		this.news = news;
	}
	
	
	
}
