package bean;

import java.util.Date;

public class GenericArticle {
	private long id;
	
	private String title;
	
	private Date date;
	
	private String content;
	
	private User user;
	
	private int category;
	
	private boolean state;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public GenericArticle(String title, Date date, String content, User user,
			int category, boolean state) {
		super();
		this.title = title;
		this.date = date;
		this.content = content;
		this.user = user;
		this.category = category;
		this.state = state;
	}

	public GenericArticle() {
		
	}
	
	
}
