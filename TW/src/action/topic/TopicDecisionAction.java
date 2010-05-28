package action.topic;

import bean.GenericArticle;

import com.opensymphony.xwork2.ActionSupport;

import dao.GenericArticleDao;

public class TopicDecisionAction extends ActionSupport{
	private String[] checkId;
	private int topicid;

	public String execute() throws Exception {
		GenericArticleDao articleDao = new GenericArticleDao();
		GenericArticle article;
		for(int i=0;i<checkId.length;i++) {
			System.out.println(checkId[i]);
			long articleId = Long.parseLong(checkId[i]);
			article = articleDao.getById(articleId);
			article.setTopic(topicid);
			articleDao.update(article);
			
			//sys out
			System.out.println("update topic : "+topicid);
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
