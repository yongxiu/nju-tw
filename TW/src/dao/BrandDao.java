package dao;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import bean.Brand;
import dao.hibernateTemlate.HibernateGenericDao;
import dao.hibernateTemlate.HibernateUtil;

public class BrandDao extends HibernateGenericDao<Brand, Integer>{
	//get session
	public Session getSession() {
		return HibernateUtil.getSession();
	}
	
	//close session
	public void closeSession() {
		HibernateUtil.closeSession();
	}
	
	public ArrayList<String> getAllBrandNames(){
		Session session = getSession();
		Transaction tx  = session.beginTransaction();
		Query query = session.createQuery("select name from Brand");
		ArrayList<String> names = (ArrayList<String>) query.list();
		tx.commit();
		closeSession();
		return names;
	}
	
	public int getIdByName(String name) {
		Session session =  getSession();
		Transaction tx = session.beginTransaction();
		Query query  = session.createQuery("from Brand b where b.name =:name");
		query.setParameter("name", name);
		ArrayList<Brand> brands = (ArrayList<Brand>) query.list();
		Brand brand = brands.get(0);
		int id = brand.getId();
		tx.commit();
		closeSession();
		return id;
	}
	
	public ArrayList<Brand> getTopBrands(){
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from Brand b where b.top=1");
		ArrayList<Brand> brands = (ArrayList<Brand>) query.list();
		tx.commit();
		closeSession();
		return brands;
	}
	
	public static void main(String[] args) {
		BrandDao brandDao = new BrandDao();
		ArrayList<Brand> brands = brandDao.getTopBrands();
		for(Brand brand:brands) {
			System.out.println(brand.getPath());
		}
	}
}
