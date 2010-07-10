package dao;

import java.util.ArrayList;

import org.hibernate.Query;
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
	
	public ArrayList<File> getFileByPage(int currentPage,int number) {
		Session session = getSession();
		Transaction tx  = session.beginTransaction();
		
		Query query = session.createQuery("from File order by date desc");
		query.setFirstResult((currentPage - 1)*number);
		query.setMaxResults(number);
		ArrayList<File> files = (ArrayList<File>) query.list();
		return files;
	}
	
	
	public ArrayList<File> getFileByCategoryPage(int currentPage,int number,int category){
		Session session = getSession();
		Transaction tx  = session.beginTransaction();
		Query query;
		if(category == 0) {
			query = session.createQuery("from File order by date desc");
		}
		
		else {
			query = session.createQuery("from File f where f.category=:category order by date desc");
			query.setParameter("category", category);
		}
		 
		query.setFirstResult((currentPage - 1)*number);
		query.setMaxResults(number);
		ArrayList<File> files = (ArrayList<File>) query.list();
		return files;
	}
	
	public int getAllFilesCount() {
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("select count(f) from File f");
		ArrayList<Integer> result = (ArrayList<Integer>) query.list();
		int count = result.get(0);
		return count;
	}
	
	public int getFileCountByCategory(int category){
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Query query;
		if(category == 0) {
			query = session.createQuery("select count(f) from File f");
		}
		
		else {
			query = session.createQuery("select count(f) from File f where f.category=:category");
			query.setParameter("category", category);
		}
		ArrayList<Integer> result = (ArrayList<Integer>) query.list();
		int count = result.get(0);
		return count;
	}
	
	public static void main(String[] args) {
		FileDao fileDao = new FileDao();
		ArrayList<File> files = fileDao.getFileByPage(1,2);
		System.out.println(files.get(1).getId());
		System.out.println(fileDao.getAllFilesCount());
	}
}
