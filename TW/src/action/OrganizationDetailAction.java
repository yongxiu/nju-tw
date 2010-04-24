package action;

import bean.Organization;

import com.opensymphony.xwork2.ActionSupport;

import dao.OrganizationDao;

public class OrganizationDetailAction extends ActionSupport{
	//org's id
	private int id;
	
	//org bean
	private Organization org;
	
	public String execute(){
		System.out.println("into organizationDetail action");
		OrganizationDao dao=new OrganizationDao();
		org=dao.getById(getId());
		System.out.println(org.getId());
		return SUCCESS;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Organization getOrg() {
		return org;
	}

	public void setOrg(Organization org) {
		this.org = org;
	}
	
	
	
}
