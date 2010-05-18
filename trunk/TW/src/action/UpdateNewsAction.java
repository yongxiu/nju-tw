package action;

import java.util.ArrayList;

import service.GetArticles;

import bean.GenericArticle;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateNewsAction extends ActionSupport{
	/**
	 * wjc 
	 * usage: update news
	 */
	private static final long serialVersionUID = 5843553509139320770L;
	//five news to be displayed

	ArrayList<GenericArticle> news;
	
	//Get service
	
	public String execute(){
	
		GetArticles service = new GetArticles();
	
		news=service.getFiveNews();
		
		return SUCCESS;
	}

	public ArrayList<GenericArticle> getNews() {
		return news;
	}

	public void setNews(ArrayList<GenericArticle> news) {
		this.news = news;
	}
	
	
	
}