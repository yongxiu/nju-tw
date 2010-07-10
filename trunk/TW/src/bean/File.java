package bean;

import java.util.Date;

public class File {
	private long id;
	
	private String filename;
	
	private User user;
	
	private String path;
	
	private boolean state;
	
	private Date date;

	private int category;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public File(String filename, User user, String path, boolean state,
			Date date,int category) {
		super();
		this.filename = filename;
		this.user = user;
		this.path = path;
		this.state = state;
		this.date = date;
		this.category = category;
	}

	public File() {
		
	}
	
	
}
