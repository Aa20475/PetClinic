package com.destiny.petclinic.services;

import com.destiny.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(long Id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
