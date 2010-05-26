package dao;

import org.hibernate.Session;

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
	
		
}
