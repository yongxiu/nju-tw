package action;

import org.apache.struts2.ServletActionContext;

import bean.Article;

import com.opensymphony.xwork2.ActionSupport;

public class DetailArticleAction extends ActionSupport {
	private int id; //article's id
	private Article article;
	
	public String execute(){
		if(getId()==1){
		
			article=new Article();
			article.setTitle("news title 1");
			article.setContent("news content 1");
		}
		
		if(getId()==2){
			article=new Article();
			article.setTitle("news title 2");
			article.setContent("news content 2");
		}
		
		if(getId()==3){
			article=new Article();
			article.setTitle("news title 3");
			article.setContent("news content 3");
		}
		return SUCCESS;
		
	}

	
	
	
	
	
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}










	public Article getArticle() {
		return article;
	}










	public void setArticle(Article article) {
		this.article = article;
	}
}
