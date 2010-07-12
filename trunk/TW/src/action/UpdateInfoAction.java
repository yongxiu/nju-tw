package action;

import java.util.ArrayList;

import service.DateFormatService;
import service.GetArticles;

import bean.GenericArticle;
import bean.temp.ArticleTemp;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateInfoAction extends ActionSupport{
	/**
	 * wjc 
	 * usage: update news
	 */
	private static final long serialVersionUID = 5843553509139320770L;
	//five news to be displayed
	ArrayList<ArticleTemp> infos;
	
	//Get service
	
	public String execute(){
		GetArticles service = new GetArticles();
		DateFormatService dateFormatService = new DateFormatService();
		ArrayList<GenericArticle> infosG=service.getSomeInfos();
		infos = new ArrayList<ArticleTemp>();
		ArticleTemp articleTemp;
		for(GenericArticle article:infosG) {
			articleTemp = new ArticleTemp();
			articleTemp.setId(article.getId());
			articleTemp.setTitle(article.getTitle());
			articleTemp.setDate(dateFormatService.changeDateToStrig(article.getDate()));
			infos.add(articleTemp);
		}
		return SUCCESS;
	}

	public ArrayList<ArticleTemp> getInfos() {
		return infos;
	}

	public void setInfos(ArrayList<ArticleTemp> infos) {
		this.infos = infos;
	}

	
	
	
}
