package action.navigation;

import java.util.ArrayList;

import service.GetArticles;

import bean.GenericArticle;

import com.opensymphony.xwork2.ActionSupport;

public class GetInfoListAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<GenericArticle> infos;
	
	public String execute() throws Exception {
		GetArticles service = new GetArticles();
		infos = service.getAllInfos();
		return SUCCESS;
	}

	public ArrayList<GenericArticle> getInfos() {
		return infos;
	}

	public void setInfos(ArrayList<GenericArticle> infos) {
		this.infos = infos;
	}
	
	
}
