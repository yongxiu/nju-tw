package action.topic;

import bean.TopicImage;

import com.opensymphony.xwork2.ActionSupport;

import dao.TopicImageDao;

public class TopicChangeAction extends ActionSupport{
	private int topicid;
	
	private String imagePath;
	
	
	public String execute() {
		TopicImageDao dao = new TopicImageDao();
		TopicImage topicImage = dao.getById(topicid);
		imagePath = topicImage.getPath();
		
		return SUCCESS;
	}

	public int getTopicid() {
		return topicid;
	}

	public void setTopicid(int topicid) {
		this.topicid = topicid;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	
	
	
}
