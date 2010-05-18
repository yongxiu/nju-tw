package action.navigation;

import java.util.ArrayList;

import service.GetArticles;

import bean.GenericArticle;

import com.opensymphony.xwork2.ActionSupport;

public class GetNewsListAction extends ActionSupport{
	private ArrayList<GenericArticle> news;

	public String execute() throws Exception {
		GetArticles service = new GetArticles();
		news = service.getAllNews();
		return SUCCESS;
	}

	public ArrayList<GenericArticle> getNews() {
		return news;
	}

	public void setNews(ArrayList<GenericArticle> news) {
		this.news = news;
	}
	
	
}
