package com.ashokit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CONTACTS_MASTER")
public class ContactsMasterEntity {
	@Column(name="CONTACT_ID")
	@Id
	private Integer contacId;
	@Column(name="CONTACT_NAME")
	private String contactName;
	@Column(name="CONTACT_NUMBER")
	private Long contactNumber;
}


