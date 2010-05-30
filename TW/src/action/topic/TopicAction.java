package action.topic;

import com.opensymphony.xwork2.ActionSupport;

import dao.TopicImageDao;

public class TopicAction extends ActionSupport{
	private String img1;
	private String img2;
	private String img3;
	public String getImg1() {
		return img1;
	}
	public void setImg1(String img1) {
		this.img1 = img1;
	}
	public String getImg2() {
		return img2;
	}
	public void setImg2(String img2) {
		this.img2 = img2;
	}
	public String getImg3() {
		return img3;
	}
	public void setImg3(String img3) {
		this.img3 = img3;
	}
	
	public String execute() {
		TopicImageDao dao = new TopicImageDao();
		img1 = dao.getById(1).getPath();
		img2 = dao.getById(2).getPath();
		img3 = dao.getById(3).getPath();
		return SUCCESS;
	}
}