package dao;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import bean.Organization;
import dao.hibernateTemlate.HibernateGenericDao;
import dao.hibernateTemlate.HibernateUtil;

public class OrganizationDao extends HibernateGenericDao<Organization,Integer>{
	
	//get session
	public Session getSession() {
		return HibernateUtil.getSession();
	}
	
	//close session
	public void closeSession() {
		HibernateUtil.closeSession();
	}
	
	public ArrayList<Organization> getOrgsByCategory(int category){
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from Organization o where o.category =:category");
		query.setParameter("category", category);
		ArrayList<Organization> orgs = (ArrayList<Organization>) query.list();
		return orgs;
	}
	
	public static void main(String[] args) {
		OrganizationDao organizationDao = new OrganizationDao();
		ArrayList<Organization> orgs = organizationDao.getOrgsByCategory(3);
		for(Organization o:orgs) {
			System.out.println(o.getDepartment());
		}
	}
}
