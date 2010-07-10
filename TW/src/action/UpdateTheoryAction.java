package action;

import java.util.ArrayList;

import service.GetArticles;

import bean.GenericArticle;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateTheoryAction extends ActionSupport{
	/**
	 * wjc 
	 * usage: update news
	 */
	private static final long serialVersionUID = 5843553509139320770L;
	//five news to be displayed
	ArrayList<GenericArticle> theories;
	
	//Get service
	
	public String execute(){
		GetArticles service = new GetArticles();
		theories=service.getSomeTheories();
		return SUCCESS;
	}

	public ArrayList<GenericArticle> getTheories() {
		return theories;
	}

	public void setTheories(ArrayList<GenericArticle> theories) {
		this.theories = theories;
	}


	
}
