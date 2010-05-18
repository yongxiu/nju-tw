package action.navigation;

import java.util.ArrayList;

import service.GetArticles;

import bean.GenericArticle;

import com.opensymphony.xwork2.ActionSupport;

public class GetTheoryListAction extends ActionSupport{
	private ArrayList<GenericArticle> theories;
	
	public String execute() throws Exception {
		GetArticles service = new GetArticles();
		theories = service.getAllThories();
		return SUCCESS;
	}

	public ArrayList<GenericArticle> getTheories() {
		return theories;
	}

	public void setTheories(ArrayList<GenericArticle> theories) {
		this.theories = theories;
	}
	
	
}
