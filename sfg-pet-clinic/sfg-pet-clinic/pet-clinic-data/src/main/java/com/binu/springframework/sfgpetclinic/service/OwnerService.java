package com.binu.springframework.sfgpetclinic.service;

import java.util.Set;

import com.binu.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
	
	Owner findByLastName(String lastName);

 
	
	
}
