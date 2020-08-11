package com.ecommerce.auth.server.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Authority")
public class Authority implements Serializable {

	private static final long serialVersionUID = -6738441845591108696L;
	
	@Id
	@Column(name = "name")
    private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}