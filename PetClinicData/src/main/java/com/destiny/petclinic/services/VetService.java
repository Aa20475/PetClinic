package com.destiny.petclinic.services;

import com.destiny.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(long Id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
