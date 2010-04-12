package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.Article;

public class TestArticle {
	public static void main(String[] args){
		Configuration config=new Configuration();
		config.configure("/hibernateConfig/hibernate.cfg.xml");
		SessionFactory sessionFactory=config.buildSessionFactory();
		
		
		//test Save a article
		Article article=new Article("jj", "jj!");
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(article);
		tx.commit();
		session.close();
	}
}
