package dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.hibernateTemlate.HibernateGenericDao;
import dao.hibernateTemlate.HibernateUtil;

import bean.Article;
import bean.GenericArticle;
import bean.User;


public class UserDao extends HibernateGenericDao<User,Long>{
	// get hibernate session
	public Session getSession() {
		return HibernateUtil.getSession();
	}

	// close hibernate session
	public void closeSession() {
		HibernateUtil.closeSession();
	}
	
	public Set<GenericArticle> getArticles(long id){
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		User user=(User) session.get(User.class, id);
		Set<GenericArticle> articles=user.getArticles();

		for(GenericArticle a:articles){
			System.out.println(a.getContent());
		}
		tx.commit();
		session.close();
		return articles;
	}

	@Override
	public boolean delete(Long id) {
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		User user = (User) session.get(User.class, id);
		Set<GenericArticle> articles = user.getArticles();
		Query query = session.createQuery("from User u where u.role=1");
		ArrayList<User> admins = (ArrayList<User>) query.list();
		User admin = admins.get(0);
		for(GenericArticle article:articles) {
			article.setUser(admin);
			session.update(article);
		}
		session.delete(user);
		tx.commit();
		closeSession();
		return true;
		
		
	}
	
	public User getSuperAdmin() {
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		Query query = session.createQuery("from User u where u.role=1");
		ArrayList<User> users = (ArrayList<User>) query.list();
		tx.commit();
		closeSession();
		
		User user = users.get(0);
		return user;
		
	}
	
	public static void main(String[] args) {
		UserDao userDao = new UserDao();
		userDao.delete(new Long(3));
	}
	
	

}
