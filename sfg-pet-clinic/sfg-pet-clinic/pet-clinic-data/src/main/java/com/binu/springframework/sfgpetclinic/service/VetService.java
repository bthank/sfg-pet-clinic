package com.binu.springframework.sfgpetclinic.service;

import java.util.Set;

import com.binu.springframework.sfgpetclinic.model.Vet;

public interface VetService {

	Vet findById(Long id);
	
	Set<Vet> findAll(); 	
	
	Vet save(Vet vet);
}
