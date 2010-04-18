package bean;

public class Organization {
	/**
	 * organization entity
	 * wjc
	 */
	private int id;
	
	private String content;
	
	private String department;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Organization(String content, String department) {
		
		this.content = content;
		this.department = department;
	}

	public Organization() {
	
	}


}
