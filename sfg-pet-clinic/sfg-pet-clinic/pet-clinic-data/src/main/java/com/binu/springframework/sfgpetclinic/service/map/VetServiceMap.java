package com.binu.springframework.sfgpetclinic.service.map;

import java.util.Set;

import com.binu.springframework.sfgpetclinic.model.Vet;
import com.binu.springframework.sfgpetclinic.service.CrudService;


public class VetServiceMap extends AbstractMapService<Vet,Long> implements CrudService<Vet,Long>{

	@Override
	public Set<Vet> findAll() {
		
		return super.findAll();
		
	}
	
	@Override
	public Vet findById(Long id) {
		
		return super.findById(id);
		
	}
	
	@Override
	public Vet save(Long id, Vet vet) {
		
		return super.save(id, vet);
		
	}
	
	@Override
	public void deleteById(Long id) {
		
		super.deleteById(id);
		
	}
	
	@Override
	public void delete(Vet vet) {
		
		super.delete(vet);
		 
	}

	@Override
	public void save(Vet vet) {
		 
		super.save(vet.getId(), vet);
		
	}
	
	
	
	
}
