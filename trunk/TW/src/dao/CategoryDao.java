package dao;



import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import bean.Category;
import dao.hibernateTemlate.HibernateGenericDao;
import dao.hibernateTemlate.HibernateUtil;

public class CategoryDao extends HibernateGenericDao<Category, Integer>{
	//get session
	public Session getSession() {
		return HibernateUtil.getSession();
	}
	
	//close session
	public void closeSession() {
		HibernateUtil.closeSession();
	}
	
	public String getNameByCategory(int category) {
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("select name from Category c where c.category=:category");
		query.setParameter("category", category);
		ArrayList<String> names = (ArrayList<String>) query.list();
		String name = names.get(0);
		tx.commit();
		closeSession();
		return name;
	}
	
	public int getCategoryByName(String name) {
		Session session = getSession();
		Transaction tx  = session.beginTransaction();
		Query query = session.createQuery("select category from Category c where c.name=:name");
		query.setParameter("name", name);
		ArrayList<Integer> categorys = (ArrayList<Integer>) query.list();
		Integer category = categorys.get(0);
		tx.commit();
		closeSession();
		return category;
	}
	
	public static void main(String[] args) {
		CategoryDao categoryDao = new CategoryDao();
		System.out.println(categoryDao.getNameByCategory(1));
		System.out.println(categoryDao.getCategoryByName("团学新闻"));
	}
}
