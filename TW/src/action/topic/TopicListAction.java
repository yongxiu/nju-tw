package action.topic;

import java.util.ArrayList;

import bean.GenericArticle;

import com.opensymphony.xwork2.ActionSupport;

import dao.GenericArticleDao;

public class TopicListAction extends ActionSupport{
	private int topicid;
	private ArrayList<GenericArticle> articles;
	
	public String execute() {
		GenericArticleDao articleDao = new GenericArticleDao();
		articles = articleDao.getArticlesByTopic(topicid);
		return SUCCESS;
	}

	public int getTopicid() {
		return topicid;
	}

	public void setTopicid(int topicid) {
		this.topicid = topicid;
	}

	public ArrayList<GenericArticle> getArticles() {
		return articles;
	}

	public void setArticles(ArrayList<GenericArticle> articles) {
		this.articles = articles;
	}
	
	
}
