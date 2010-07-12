package dao;

import java.util.ArrayList;
import java.util.Set;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
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
		Query query = session.createQuery("from GenericArticle a where a.category =:category order by a.date desc");
		
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
		Query query = session.createQuery("from GenericArticle a where a.category =:category1 or a.category =:category2 order by a.date desc");
		
		query.setParameter("category1", category1);
		query.setParameter("category2", category2);
		query.setFirstResult((pageCount-1)*number);
		query.setMaxResults(number);
		ArrayList<GenericArticle> articles = (ArrayList<GenericArticle>) query.list();
		
		tx.commit();
		closeSession();
		return articles;
	}
	
	//get Articles by page count for medias
	public ArrayList<GenericArticle> getArticlesByPage(int pageCount,int number,int category1,int category2,int category3,int category4,int category5){
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from GenericArticle a where a.category =:category1 or a.category =:category2 or a.category =:category3 or a.category =:category4 or a.category =:category5 order by a.date desc");
		
		query.setParameter("category1", category1);
		query.setParameter("category2", category2);
		query.setParameter("category3", category3);
		query.setParameter("category4", category4);
		query.setParameter("category5", category5);
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
	
	
	public ArrayList<GenericArticle> getArticlesByTopic(int topicid){
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from GenericArticle a where a.topic =:topic order by a.date desc");
		query.setParameter("topic", topicid);
		ArrayList<GenericArticle> articles = (ArrayList<GenericArticle>) query.list();
		tx.commit();
		closeSession();
		return articles;
	}
	
	public ArrayList<GenericArticle> getArticlesByTopicPage(int topicid,int currentPage,int number){
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from GenericArticle a where a.topic =:topic order by a.date desc");
		query.setParameter("topic", topicid);
		query.setFirstResult((currentPage-1)*number);
		query.setMaxResults(number);
		ArrayList<GenericArticle> articles = (ArrayList<GenericArticle>) query.list();
		tx.commit();
		closeSession();
		return articles;
	}
	
	public int getCountByTopic(int topicid) {
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery( "select count(a) from GenericArticle a where a.topic =:topicid");
		query.setParameter("topicid", topicid);
		ArrayList<Integer> result = (ArrayList<Integer>) query.list();
		int count = result.get(0);
		closeSession();
		return count;
	}
	
	public ArrayList<GenericArticle> getArticlesTopSort(){
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from GenericArticle order by istop desc,date desc");
		ArrayList<GenericArticle> articles = (ArrayList<GenericArticle>) query.list();
		tx.commit();
		closeSession();
		return articles;
	}
	
	public ArrayList<GenericArticle> getArticlesByPageTopSort(int currentPage,int number){
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from GenericArticle  order by istop desc,date desc");
		query.setFirstResult((currentPage-1)*number);
		query.setMaxResults(number);
		ArrayList<GenericArticle> articles = (ArrayList<GenericArticle>) query.list();
		tx.commit();
		closeSession();
		return articles;
	}

	public long getMaxTopValue() {
		Session session =  getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("select max(a.istop) from GenericArticle a");
		ArrayList<Long> result = (ArrayList<Long>) query.list();
		long count = result.get(0);
		return count;
	}
	
	
	public int getAllArticleCount() {
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery( "select count(a) from GenericArticle a");
		
		ArrayList<Integer> result = (ArrayList<Integer>) query.list();
		int count = result.get(0);
		closeSession();
		return count;
	}
	
	
	public ArrayList<GenericArticle> getSomeArticles(int category){
		Session session =  getSession();
		Transaction tx = session.beginTransaction();
	
		
			Query query = session.createQuery("from GenericArticle a where a.category=:category order by istop desc,date desc");
			query.setParameter("category", category);
			query.setMaxResults(6);
			ArrayList<GenericArticle> articles = (ArrayList<GenericArticle>) query.list();
			return articles;
		
		
	
		
	}
	
	
	public ArrayList<GenericArticle> getArticlesByUserPage(long uid,int currentPage,int number){
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from GenericArticle a where a.user.id =:uid order by istop desc,date desc");
		query.setParameter("uid", uid);
		query.setFirstResult((currentPage-1)*number);
		query.setMaxResults(number);
		ArrayList<GenericArticle> articles = (ArrayList<GenericArticle>) query.list();
		return articles;
	}
	
	public int getCountByUser(long uid) {
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("select count(a) from GenericArticle a where a.user.id =:uid");
		query.setParameter("uid", uid);
		ArrayList<Integer> result = (ArrayList<Integer>) query.list();
		int count = result.get(0);
		tx.commit();
		closeSession();
		return count;
	}
	
	public ArrayList<GenericArticle> getArticlesByLevelPage(int level,int currentPage,int number){
		Session session = getSession();
		Transaction tx =  session.beginTransaction();
		Query query = null;
		if(level == 1) {
			query = session.createQuery("from GenericArticle a where a.category= 1 or a.category= 2 or a.category= 3 order by istop desc,date desc");
			
		}
		if(level == 2) {
			query = session.createQuery("from GenericArticle a where a.category= 7 or a.category= 8 or a.category= 9 or a.category=10 order by istop desc,date desc");

		}
		query.setFirstResult((currentPage-1)*number);
		query.setMaxResults(number);
		ArrayList<GenericArticle> articles = (ArrayList<GenericArticle>) query.list();
		
		tx.commit();
		closeSession();
		return articles;
	}
	
	public int getCountByLevel(int level) {
		Session session = getSession();
		Transaction tx =  session.beginTransaction();
		Query query = null;
		if(level == 1) {
			query = session.createQuery("select count(a) from GenericArticle a where a.category= 1 or a.category= 2 or a.category= 3 order by istop desc,date desc");
			ArrayList<Integer> result = (ArrayList<Integer>) query.list();
			int count = result.get(0);
			tx.commit();
			closeSession();
			return count;
		}
		if(level == 2) {
			query = session.createQuery("select count(a) from GenericArticle a where a.category= 7 or a.category= 8 or a.category= 9 or a.category=10 order by istop desc,date desc");
			
			ArrayList<Integer> result = (ArrayList<Integer>) query.list();
			int count = result.get(0);
			tx.commit();
			closeSession();
			return count;
		}
		else {
			tx.commit();
			closeSession();
			return 0;
		}
		
	}
	
	public ArrayList<GenericArticle> getArticlesByIWorkId(int id){
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from GenericArticle a where a.iworkid=:id");
		query.setParameter("id", id);
		ArrayList<GenericArticle> articles = (ArrayList<GenericArticle>) query.list();
		tx.commit();
		closeSession();
		return articles;
	}
	
	public ArrayList<GenericArticle> getArticlesByBrandId(int id){
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from GenericArticle a where a.brandid=:id");
		query.setParameter("id", id);
		ArrayList<GenericArticle> articles = (ArrayList<GenericArticle>) query.list();
		tx.commit();
		closeSession();
		return articles;
	}
	
	
	
	
	public ArrayList<GenericArticle> getArticlesByCategoryPage(int category,int currentPage,int number) {
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from GenericArticle a where a.category =:category");
		query.setParameter("category", category);
		query.setFirstResult((currentPage-1)*number);
		query.setMaxResults(number);
		ArrayList<GenericArticle> articles = (ArrayList<GenericArticle>) query.list();
		tx.commit();
		closeSession();
		return articles;
	}
	
	public int getCountByCategory(int category) {
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("select count(a) from GenericArticle a where a.category =:category");
		query.setParameter("category", category);
		ArrayList<Integer> result = (ArrayList<Integer>) query.list();
		int count = result.get(0);
		tx.commit();
		closeSession();
		return count;
	}
	
	public static void main(String[] args) {
		GenericArticleDao dao = new GenericArticleDao();
//		ArrayList<GenericArticle> articles = dao.getArticlesByPage(4, 20, 10, 11);
//		for(GenericArticle article:articles) {
//			System.out.println(article.getId());
//		}
//		ArrayList<GenericArticle> articles = dao.getArticlesByPageTopSort(1,5);
//		for(GenericArticle article:articles) {
//			System.out.println(article.getId());
//		}
//		System.out.println();
//		int count = dao.getCountByTopic(3);
//		System.out.println(count);
//		ArrayList<GenericArticle> articles = dao.getArticlesByUserPage(1, 1, 6);
//		for(GenericArticle a:articles) {
//			System.out.println(a.getId());
//		}
//		int count = dao.getCountByUser(2);
//		System.out.println(count);
//		ArrayList<GenericArticle> articles = dao.getArticlesByLevelPage(2, 1, 100);
//		for(GenericArticle article:articles) {
//			System.out.println(article.getCategory());
//		}
//		System.out.println(dao.getCountByLevel(3));
//		ArrayList<GenericArticle> articles  = dao.getArticlesByCategory(1);
//		for(GenericArticle article:articles) {
//			System.out.println(article.getCategory());
//		}
		ArrayList<GenericArticle> articles = dao.getArticlesByIWorkId(1);
		for(GenericArticle a:articles) {
			System.out.println(a.getIworkid());
		}
		
	}
}
