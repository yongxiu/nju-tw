package dao;

import java.util.ArrayList;
import java.util.Set;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.omg.CORBA.PUBLIC_MEMBER;

import antlr.collections.List;
import bean.GenericArticle;
import dao.hibernateTemlate.HibernateGenericDao;
import dao.hibernateTemlate.HibernateUtil;

public class GenericArticleDao extends HibernateGenericDao<GenericArticle,Long>{
	//get session
	public Session getSession() {
		return HibernateUtil.getSession();
	}
	
	//close session
	public void closeSession() {
		HibernateUtil.closeSession();
	}
	
	//get Articles by page count
	public ArrayList<GenericArticle> getArticlesByPage(int pageCount,int number,int category){
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from GenericArticle a where a.category =:category");
		
		query.setParameter("category", category);
		query.setFirstResult((pageCount-1)*number);
		query.setMaxResults(number);
		ArrayList<GenericArticle> articles = (ArrayList<GenericArticle>) query.list();
		
		tx.commit();
		closeSession();
		return articles;
	}
	
	//get Articles by page count for news
	public ArrayList<GenericArticle> getArticlesByPage(int pageCount,int number,int category1,int category2){
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from GenericArticle a where a.category =:category1 or a.category =:category2");
		
		query.setParameter("category1", category1);
		query.setParameter("category2", category2);
		query.setFirstResult((pageCount-1)*number);
		query.setMaxResults(number);
		ArrayList<GenericArticle> articles = (ArrayList<GenericArticle>) query.list();
		
		tx.commit();
		closeSession();
		return articles;
	}
	
	public int getCountBycategory(int category) {
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery( "select count(a) from GenericArticle a where a.category =:category");
		query.setParameter("category", category);
		ArrayList<Integer> result = (ArrayList<Integer>) query.list();
		int count = result.get(0);
		closeSession();
		return count;
		
	}
	

	
	

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		
		GenericArticle article = (GenericArticle) session.load(GenericArticle.class, id);
		article.setUser(null);
		
		session.delete(article);
		tx.commit();
		return true;
	}

	public static void main(String[] args) {
		GenericArticleDao dao = new GenericArticleDao();
		ArrayList<GenericArticle> articles = dao.getArticlesByPage(4, 20, 10, 11);
		for(GenericArticle article:articles) {
			System.out.println(article.getId());
		}
	}
}
