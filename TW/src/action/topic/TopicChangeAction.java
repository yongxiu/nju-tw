package action.topic;

import com.opensymphony.xwork2.ActionSupport;

public class TopicChangeAction extends ActionSupport{
	private int topicid;
	
	private String imagePath;
	
	
	public String execute() {
		
		imagePath = "/TW/topicImage/huodong"+topicid+".gif";
		
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
