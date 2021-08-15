package com.binu.springframework.sfgpetclinic.service;

import java.util.Set;

import com.binu.springframework.sfgpetclinic.model.Pet;

public interface PetService {

	Pet findById(Long id);
	
	Set<Pet> findAll();
	
	Pet save(Pet pet);
}
