package com.binu.springframework.sfgpetclinic.service.map;

import java.util.Set;

import com.binu.springframework.sfgpetclinic.model.Owner;
import com.binu.springframework.sfgpetclinic.service.CrudService;


public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long>{

	@Override
	public Set<Owner> findAll() {
		
		return super.findAll();
		
	}
	
	@Override
	public Owner findById(Long id) {
		
		return super.findById(id);
		
	}
	
	@Override
	public Owner save(Long id, Owner owner) {
		
		return super.save(id, owner);
		
	}
	
	@Override
	public void deleteById(Long id) {
		
		super.deleteById(id);
		
	}
	
	@Override
	public void delete(Owner owner) {
		
		super.delete(owner);
		 
	}

	@Override
	public void save(Owner owner) {
		 
		super.save(owner.getId(), owner);
		
	}
	
	
	
	
}
