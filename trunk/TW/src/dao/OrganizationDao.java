package dao;

import java.util.ArrayList;
import java.util.List;

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
	
	
	
	@Override
	public List<Organization> getAllEntity() {
		// TODO Auto-generated method stub
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from Organization o order by id");
		ArrayList<Organization> orgs = (ArrayList<Organization>) query.list();
		tx.commit();
		closeSession();
		return orgs;
	}

	public static void main(String[] args) {
		OrganizationDao organizationDao = new OrganizationDao();
		ArrayList<Organization> orgs = (ArrayList<Organization>) organizationDao.getAllEntity();
		for(Organization o:orgs) {
			System.out.println(o.getId());
		}
	}
}
