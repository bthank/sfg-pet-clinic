package com.binu.springframework.sfgpetclinic.service;

import java.util.Set;

public interface CrudService<T,ID> {
	/**
	 * Find all instances of type T
	 * 
	 * @return a Set<T>
	 */
	Set<T> findAll();
	
	/**
	 * Find by id and return instance of type T
	 * 
	 * @param id of type ID
	 * @return T
	 */
	T findById(ID id);
	
	/**
	 * Save entity type T to the database
	 * 
	 * @param t of type T
	 * @return void
	 */
	void save(T t);
	
	/**
	 * Delete entity of type T from the database
	 * 
	 * @param t of type T
	 * @return void
	 */
	void delete(T t);
	
	/**
	 * Delete entity of type T by id of type ID from the database
	 * 
	 * @param id of type ID
	 * @return void
	 */
	void deleteById(ID id);
	
	
	
	

}
