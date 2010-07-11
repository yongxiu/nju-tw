package dao;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import bean.Brand;
import bean.IWork;
import dao.hibernateTemlate.HibernateGenericDao;
import dao.hibernateTemlate.HibernateUtil;

public class IWorkDao extends HibernateGenericDao<IWork, Integer>{
	//get session
	public Session getSession() {
		return HibernateUtil.getSession();
	}
	
	//close session
	public void closeSession() {
		HibernateUtil.closeSession();
	}
	
	public ArrayList<String> getAllIWorkNames(){
		Session session = getSession();
		Transaction tx  = session.beginTransaction();
		Query query = session.createQuery("select name from IWork");
		ArrayList<String> names = (ArrayList<String>) query.list();
		tx.commit();
		closeSession();
		return names;
	}
	
	public int getIdByName(String name) {
		Session session =  getSession();
		Transaction tx = session.beginTransaction();
		Query query  = session.createQuery("from IWork i where i.name =:name");
		query.setParameter("name", name);
		ArrayList<IWork> iWorks = (ArrayList<IWork>) query.list();
		IWork iWork = iWorks.get(0);
		int id = iWork.getId();
		tx.commit();
		closeSession();
		return id;
	}
	
	public static void main(String[] args) {
		IWorkDao iWorkDao = new IWorkDao();
		ArrayList<String> names = iWorkDao.getAllIWorkNames();
		for(String name:names) {
			System.out.println(name);
		}
	}
	
}
