package action.navigation;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
import bean.Organization;

import dao.OrganizationDao;

public class OrgListAction extends ActionSupport{
	private ArrayList<Organization> orgs;
	private int category;
	private String orgName;
	
	public String execute() {
		OrganizationDao oDao = new OrganizationDao();
		orgName = getOrgNameByCategory(category);
		orgs = oDao.getOrgsByCategory(category);
		return SUCCESS;
	}

	public ArrayList<Organization> getOrgs() {
		return orgs;
	}

	public void setOrgs(ArrayList<Organization> orgs) {
		this.orgs = orgs;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	public String getOrgNameByCategory(int category) {
		if(category == 1) {
			return "书记室";
		}
		
		else if (category == 2) {
			return "机构设置";
		}
		
		else if (category == 3) {
			return "学生组织";
		}
		
		else {
			return "基层团委";
		}
	}
	
	
}
