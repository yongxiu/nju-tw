package action.admin;

import bean.Organization;

import com.opensymphony.xwork2.ActionSupport;

import dao.OrganizationDao;

public class OrgUpdateAction extends ActionSupport{
	private int orgid;
	private String department;
	private String content;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		OrganizationDao orgDao = new OrganizationDao();
		Organization org = orgDao.getById(orgid);
		org.setDepartment(department);
		org.setContent(content);
		orgDao.update(org);
		return SUCCESS;
	}
	public int getOrgid() {
		return orgid;
	}
	public void setOrgid(int orgid) {
		this.orgid = orgid;
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
	
}
