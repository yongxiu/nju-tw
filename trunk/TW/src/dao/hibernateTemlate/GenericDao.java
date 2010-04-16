package dao.hibernateTemlate;

import java.util.List;

public interface GenericDao <E,K>{
	//add entity
	public boolean create(E entity);
	 
	//get entities
	public List<E> getAllEntity();
	
	//get the entity with the specific id
	public E getById(K id);
	
	//update an entity
	public void update(E entity);
	
	//delete an entity
	public boolean delete(K id );
}
