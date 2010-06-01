package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import bean.File;

import dao.hibernateTemlate.HibernateGenericDao;
import dao.hibernateTemlate.HibernateUtil;

public class FileDao extends HibernateGenericDao<File,Long>{
	//get session
	public Session getSession() {
		return HibernateUtil.getSession();
	}
	
	//close session
	public void closeSession() {
		HibernateUtil.closeSession();
	}
	

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		
		File file = (File) session.load(File.class, id);
		file.setUser(null);
		
		session.delete(file);
		tx.commit();
		return true;
	}
	
		
}
