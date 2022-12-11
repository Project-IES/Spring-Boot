package com.ashokit.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entities.ContactsMasterEntity;

public interface ContactsMasterRepository extends JpaRepository<ContactsMasterEntity, Serializable>{
	
}
