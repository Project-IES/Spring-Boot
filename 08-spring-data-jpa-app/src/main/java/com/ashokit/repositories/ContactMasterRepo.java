package com.ashokit.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ashokit.entities.ContactsMasterEntity;

public interface ContactMasterRepo extends CrudRepository<ContactsMasterEntity, Serializable>{
	
	@Query("select contactName from ContactsMasterEntity where contactNumber = :num")
	List<String> findContactNameByContactNumber(long num);
}
