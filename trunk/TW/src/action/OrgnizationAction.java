package action;

import java.util.ArrayList;

import bean.Organization;

import com.opensymphony.xwork2.ActionSupport;

import dao.OrganizationDao;

public class OrgnizationAction extends ActionSupport{
	
	//所有的组织
	private ArrayList<Organization> allOrg;
	
	//书记
	private ArrayList<Organization> org1;
	
	//内部机构
	private ArrayList<Organization> org2;
	
	//下属机构
	private ArrayList<Organization> org3;
	
	public String execute(){
		OrganizationDao dao=new OrganizationDao();
		allOrg=(ArrayList<Organization>) dao.getAllEntity();
		
		//get all org
		
		
		org1=new ArrayList<Organization>();
		org2=new ArrayList<Organization>();
		org3=new ArrayList<Organization>();
		
		for(Organization org:allOrg){
			
			if(org.getCategory()==1){
				org1.add(org);
			}
			
			else if(org.getCategory()==2){
				org2.add(org);
			}
			else if(org.getCategory()==3){
				org3.add(org);
			}
		}
		
		
		return SUCCESS;
	}

	public ArrayList<Organization> getOrg1() {
		return org1;
	}

	public void setOrg1(ArrayList<Organization> org1) {
		this.org1 = org1;
	}

	public ArrayList<Organization> getOrg2() {
		return org2;
	}

	public void setOrg2(ArrayList<Organization> org2) {
		this.org2 = org2;
	}

	public ArrayList<Organization> getOrg3() {
		return org3;
	}

	public void setOrg3(ArrayList<Organization> org3) {
		this.org3 = org3;
	}

	public ArrayList<Organization> getAllOrg() {
		return allOrg;
	}

	public void setAllOrg(ArrayList<Organization> allOrg) {
		this.allOrg = allOrg;
	}
	
	
	
	
	
}
