package action;

import java.util.ArrayList;

import service.GetArticles;

import bean.GenericArticle;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateInfoAction extends ActionSupport{
	/**
	 * wjc 
	 * usage: update news
	 */
	private static final long serialVersionUID = 5843553509139320770L;
	//five news to be displayed
	ArrayList<GenericArticle> infos;
	
	//Get service
	
	public String execute(){
		GetArticles service = new GetArticles();
		infos=service.getSomeInfos();
		return SUCCESS;
	}

	public ArrayList<GenericArticle> getInfos() {
		return infos;
	}

	public void setInfos(ArrayList<GenericArticle> infos) {
		this.infos = infos;
	}

	
	
	
}
