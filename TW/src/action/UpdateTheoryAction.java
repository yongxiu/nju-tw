package action;

import java.util.ArrayList;

import service.DateFormatService;
import service.GetArticles;

import bean.GenericArticle;
import bean.temp.ArticleTemp;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateTheoryAction extends ActionSupport{
	/**
	 * wjc 
	 * usage: update news
	 */
	private static final long serialVersionUID = 5843553509139320770L;
	//five news to be displayed
	ArrayList<ArticleTemp> theories;
	
	//Get service
	
	public String execute(){

		GetArticles service = new GetArticles();
		DateFormatService dateFormatService = new DateFormatService();
		ArrayList<GenericArticle> theoriesG=service.getSomeNews();
		theories = new ArrayList<ArticleTemp>();
		ArticleTemp articleTemp;
		for(GenericArticle article:theoriesG) {
			articleTemp = new ArticleTemp();
			articleTemp.setId(article.getId());
			articleTemp.setTitle(article.getTitle());
			articleTemp.setDate(dateFormatService.changeDateToStrig(article.getDate()));
			theories.add(articleTemp);
		}
		return SUCCESS;
	}

	public ArrayList<ArticleTemp> getTheories() {
		return theories;
	}

	public void setTheories(ArrayList<ArticleTemp> theories) {
		this.theories = theories;
	}


	
}
