package action.admin;

import bean.Organization;

import com.opensymphony.xwork2.ActionSupport;

import dao.OrganizationDao;

public class OrgModifyAction extends ActionSupport{
	private int orgid;
	private Organization org;
	@Override
	public String execute() throws Exception {
		OrganizationDao orgDao = new OrganizationDao();
		org = orgDao.getById(orgid);
		return SUCCESS;
	}
	public int getOrgid() {
		return orgid;
	}
	public void setOrgid(int orgid) {
		this.orgid = orgid;
	}
	public Organization getOrg() {
		return org;
	}
	public void setOrg(Organization org) {
		this.org = org;
	}
	
}
