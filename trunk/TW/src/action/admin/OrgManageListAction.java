package action.admin;

import java.util.ArrayList;

import bean.Organization;

import com.opensymphony.xwork2.ActionSupport;

import dao.OrganizationDao;

public class OrgManageListAction extends ActionSupport{
	private ArrayList<Organization> orgs;
	public String execute() {
		OrganizationDao orgDao = new OrganizationDao();
		orgs = (ArrayList<Organization>) orgDao.getAllEntity();
		return SUCCESS;
	}
	public ArrayList<Organization> getOrgs() {
		return orgs;
	}
	public void setOrgs(ArrayList<Organization> orgs) {
		this.orgs = orgs;
	}
	
	
}
