package bean;

public class Article {
	private long id;
	private String title;
	private String content;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Article(String title, String content) {
		
		
		this.title = title;
		this.content = content;
	}
	public Article() {
	
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
