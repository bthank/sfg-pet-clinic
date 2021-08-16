package com.binu.springframework.sfgpetclinic.service.map;

import java.util.Set;

import com.binu.springframework.sfgpetclinic.model.Pet;
import com.binu.springframework.sfgpetclinic.service.CrudService;


public class PetServiceMap extends AbstractMapService<Pet,Long> implements CrudService<Pet,Long>{

	@Override
	public Set<Pet> findAll() {
		
		return super.findAll();
		
	}
	
	@Override
	public Pet findById(Long id) {
		
		return super.findById(id);
		
	}
	
	@Override
	public Pet save(Long id, Pet pet) {
		
		return super.save(id, pet);
		
	}
	
	@Override
	public void deleteById(Long id) {
		
		super.deleteById(id);
		
	}
	
	@Override
	public void delete(Pet pet) {
		
		super.delete(pet);
		 
	}

	@Override
	public void save(Pet pet) {
		 
		super.save(pet.getId(), pet);
		
	}
	
	
	
	
}
