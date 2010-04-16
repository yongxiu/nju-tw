package dao.hibernateTemlate;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.hql.ast.tree.FromClause;

public class HibernateGenericDao<E, K> implements GenericDao<E, K> {
	// get hibernate session
	public Session getSession() {
		return HibernateUtil.getSession();
	}

	// close hibernate session
	public void closeSession() {
		HibernateUtil.closeSession();
	}

	@Override
	// create an entity
	public boolean create(E entity) {
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(entity);
			
			
		} catch (HibernateException createException) {
			// TODO: handle exception
			createException.printStackTrace();
			closeSession();
			return false;
		}
		tx.commit();
		closeSession();
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	// delete an entity
	public boolean delete(K id) {
		// TODO Auto-generated method stub
		Session session = getSession();

		Transaction tx = session.beginTransaction();
		try {

			
			E entityDeleted = (E) session.get(getEntityClass(), (Serializable) id);
			session.delete(entityDeleted);
			tx.commit();
			closeSession();
		} catch (HibernateException deleteEx) {
			// TODO: handle exception
			System.out.println("entity not exist");
			deleteEx.printStackTrace();
			closeSession();
			return false;
		}
		
		
		return true;

	}

	@SuppressWarnings("unchecked")
	@Override
	// get all entity
	public List<E> getAllEntity() {
		// TODO Auto-generated method stub
		Session session=getSession();
		
		List<E> entities = null;
		try{
			
			entities=session.createQuery("from "+getEntityClass().getName()).list();
			
		}
		catch (HibernateException e) {
			// TODO: handle exception
			closeSession();
			e.printStackTrace();
		}
		closeSession();
		return entities;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	// get entity by id
	public E getById(K id) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Transaction tx = session.beginTransaction();

		E entity = (E) session.get(getEntityClass(), (Serializable) id);

		tx.commit();
		closeSession();
		return entity;

	}

	@SuppressWarnings("unchecked")
	@Override
	// update an entity
	public void update(E entity) {
		// TODO Auto-generated method stub
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		
		try{
		
			session.update(entity);
			tx.commit();
			closeSession();
		}
		catch (HibernateException updateEx) {
			// TODO: handle exception
			closeSession();
			updateEx.printStackTrace();
		}

	}

	// get E class
	@SuppressWarnings("unchecked")
	private Class<E> getEntityClass() {
		return (Class<E>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	// get K class
	@SuppressWarnings("unchecked")
	private Class<E> getKeyClass() {
		return (Class<E>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[1];
	}

}
