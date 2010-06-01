package action.admin;

import bean.Organization;

import com.opensymphony.xwork2.ActionSupport;

import dao.OrganizationDao;

public class OrgAddAction extends ActionSupport{
	private String department;
	private String content;
	private int category;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		OrganizationDao orgDao = new OrganizationDao();
		Organization org = new Organization();
		org.setDepartment(department);
		org.setContent(content);
		org.setCategory(category);
		orgDao.create(org);
		return SUCCESS;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	
}
