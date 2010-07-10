package action;

import java.util.ArrayList;

import service.GetArticles;

import bean.GenericArticle;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateGuideAction extends ActionSupport{
	/**
	 * wjc 
	 * usage: update news
	 */
	private static final long serialVersionUID = 5843553509139320770L;
	//five news to be displayed
	ArrayList<GenericArticle> guides;
	
	//Get service
	
	public String execute(){
		GetArticles service = new GetArticles();
		guides=service.getSomeGuides();
		return SUCCESS;
	}

	public ArrayList<GenericArticle> getGuides() {
		return guides;
	}

	public void setGuides(ArrayList<GenericArticle> guides) {
		this.guides = guides;
	}




	
	
}
