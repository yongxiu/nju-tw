package bean;

import java.util.Set;

public class User {
	/**
	 * user entity 
	 * wjc
	 */
	private long id;
	
	private String username;
	
	private String password;
	
	private String name;
	
	private int role;
	
	private Set<GenericArticle> articles;
	
	private Set<File> files;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public User(String username, String password, String name,int role) {
		
		this.username = username;
		this.password = password;
		this.role = role;
		this.name=name;
	}

	public User() {
		
	}

	public Set<GenericArticle> getArticles() {
		return articles;
	}

	public void setArticles(Set<GenericArticle> articles) {
		this.articles = articles;
	}

	public Set<File> getFiles() {
		return files;
	}

	public void setFiles(Set<File> files) {
		this.files = files;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
