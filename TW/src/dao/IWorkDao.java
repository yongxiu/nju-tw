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
	
	public String getNameById(int id){
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from IWork i where i.id=:id");
		query.setParameter("id", id);
		ArrayList<IWork> iworks =  (ArrayList<IWork>) query.list();
		IWork iwork = iworks.get(0);
		String name = iwork.getName();
		tx.commit();
		closeSession();
		return name;
	}
	
	public ArrayList<IWork> getTopIWorks(){
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from IWork i where i.top=1");
		ArrayList<IWork> iWorks = (ArrayList<IWork>) query.list();
		tx.commit();
		closeSession();
		return iWorks;
	}
	
	public ArrayList<IWork> getNotTopIWorks(){
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from IWork i where i.top=0");
		ArrayList<IWork> iWorks = (ArrayList<IWork>) query.list();
		tx.commit();
		closeSession();
		return iWorks;
	}
	
	public static void main(String[] args) {
		IWorkDao iWorkDao = new IWorkDao();
		String names = iWorkDao.getNameById(2);
		System.out.println(names);
	}
	
}
