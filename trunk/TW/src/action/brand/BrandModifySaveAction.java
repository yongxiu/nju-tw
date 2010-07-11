package action.brand;

import java.util.ArrayList;

import bean.GenericArticle;

import com.opensymphony.xwork2.ActionSupport;

import dao.GenericArticleDao;

public class BrandModifySaveAction extends ActionSupport{
	private String[] checkId;
	private int topicid;
	public String execute(){
		GenericArticleDao articleDao = new GenericArticleDao();
		GenericArticle article;
		
		if(checkId!=null){
			ArrayList<GenericArticle> articles = (ArrayList<GenericArticle>) articleDao.getAllEntity();
			for(GenericArticle a:articles){
				if(a.getBrandid() == topicid){
					a.setBrandid(0);
					articleDao.update(a);
				}
			}
			
			for(int i=0;i<checkId.length;i++){
				long articleId = Long.parseLong(checkId[i]);
				article = articleDao.getById(articleId);
				article.setBrandid(topicid);
				articleDao.update(article);
			}
		}
		return SUCCESS;
	}
	public String[] getCheckId() {
		return checkId;
	}
	public void setCheckId(String[] checkId) {
		this.checkId = checkId;
	}
	public int getTopicid() {
		return topicid;
	}
	public void setTopicid(int topicid) {
		this.topicid = topicid;
	}
	
}
