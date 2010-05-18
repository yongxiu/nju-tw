package action.navigation;

import java.util.ArrayList;

import service.GetArticles;

import bean.GenericArticle;

import com.opensymphony.xwork2.ActionSupport;

public class GetMediaListAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<GenericArticle> medias;
	
	public String execute() throws Exception {
		GetArticles service = new GetArticles();
		medias = service.getAllMedias();
		return SUCCESS;
		
	}

	public ArrayList<GenericArticle> getMedias() {
		return medias;
	}

	public void setMedias(ArrayList<GenericArticle> medias) {
		this.medias = medias;
	}
	
	
}
