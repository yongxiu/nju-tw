package action.navigation.news;

import java.util.ArrayList;

import service.GetArticles;

import bean.GenericArticle;

import com.opensymphony.xwork2.ActionSupport;

public class GetNewsOfPublicAction extends ActionSupport{
	private ArrayList<GenericArticle> news;
	
	public String  execute() {
		GetArticles service = new GetArticles();
		news = service.getAllPublicNews();
		return SUCCESS;
	}

	public ArrayList<GenericArticle> getNews() {
		return news;
	}

	public void setNews(ArrayList<GenericArticle> news) {
		this.news = news;
	}
	
	
}
