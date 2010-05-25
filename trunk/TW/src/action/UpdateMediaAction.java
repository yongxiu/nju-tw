package action;

import java.util.ArrayList;

import service.GetArticles;

import bean.GenericArticle;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateMediaAction extends ActionSupport{
	/**
	 * wjc 
	 * usage: update news
	 */
	private static final long serialVersionUID = 5843553509139320770L;
	//five news to be displayed
	ArrayList<GenericArticle> medias;
	
	//Get service
	
	public String execute(){
		GetArticles service = new GetArticles();
		medias=service.getFiveMedias();
		return SUCCESS;
	}

	public ArrayList<GenericArticle> getMedias() {
		return medias;
	}

	public void setMedias(ArrayList<GenericArticle> medias) {
		this.medias = medias;
	}


	
	
}