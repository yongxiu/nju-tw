package action;

import java.util.ArrayList;

import service.DateFormatService;
import service.GetArticles;

import bean.GenericArticle;
import bean.temp.ArticleTemp;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateGuideAction extends ActionSupport{
	/**
	 * wjc 
	 * usage: update news
	 */
	private static final long serialVersionUID = 5843553509139320770L;
	//five news to be displayed
	ArrayList<ArticleTemp> guides;
	
	//Get service
	
	public String execute(){
		GetArticles service = new GetArticles();
		DateFormatService dateFormatService = new DateFormatService();
		ArrayList<GenericArticle> guidesG=service.getSomeGuides();
		guides = new ArrayList<ArticleTemp>();
		ArticleTemp articleTemp;
		for(GenericArticle article:guidesG) {
			articleTemp = new ArticleTemp();
			articleTemp.setId(article.getId());
			articleTemp.setTitle(article.getTitle());
			articleTemp.setDate(dateFormatService.changeDateToStrig(article.getDate()));
			guides.add(articleTemp);
		}
		return SUCCESS;
	}

	public ArrayList<ArticleTemp> getGuides() {
		return guides;
	}

	public void setGuides(ArrayList<ArticleTemp> guides) {
		this.guides = guides;
	}




	
	
}
