package com.objectfrontier.land;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name="user")
public class DemoPojo {
	
	@Id
	@Column(name="id")
	@ApiModelProperty(notes = "The database generated product ID")
	private int id;
	
	@Column(name="name")
	@ApiModelProperty(notes = "This is user name")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DemoPojo [id=" + id + ", name=" + name + "]";
	}

}
