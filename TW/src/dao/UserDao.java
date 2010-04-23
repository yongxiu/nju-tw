package dao;

import java.io.Serializable;
import java.util.Set;


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
	
	

}
