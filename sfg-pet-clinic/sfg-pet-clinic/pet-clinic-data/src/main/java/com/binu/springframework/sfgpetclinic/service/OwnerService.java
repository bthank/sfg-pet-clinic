package com.binu.springframework.sfgpetclinic.service;

import java.util.Set;

import com.binu.springframework.sfgpetclinic.model.Owner;

public interface OwnerService {
	
	Owner findByLastName(String lastName);

	Owner findById(Long id);
	
	Set<Owner> findAll();
	
	Owner save(Owner owner);
	
	
	
}
