package action.admin;

import com.opensymphony.xwork2.ActionSupport;

import dao.OrganizationDao;

public class OrgDeleteAction extends ActionSupport{
	private int orgid;
	public String execute() {
		OrganizationDao orgDao = new OrganizationDao();
		orgDao.delete(orgid);
		return SUCCESS;
	}
	public int getOrgid() {
		return orgid;
	}
	public void setOrgid(int orgid) {
		this.orgid = orgid;
	}
	
	
}
