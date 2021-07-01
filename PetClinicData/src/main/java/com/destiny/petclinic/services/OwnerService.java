package com.destiny.petclinic.services;

import com.destiny.petclinic.model.Owner;
import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(long Id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
