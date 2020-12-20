package com.herrera.backend.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="Subjects")
@Entity

public class Subject implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_Subject")
	private Long idSubject;
	
	@Column(name="name")
	private String name;
	
	
	@Column(name="hours", length=1)
	private int hours;
	
	@JoinColumn(name="fk_category", referencedColumnName="id_category")
	@ManyToOne
	private Category category;


	public Subject() {
		super();
	}


	public Subject(Long idSubject) {
		super();
		this.idSubject = idSubject;
	}


	public Long getIdSubject() {
		return idSubject;
	}


	public void setIdSubject(Long idSubject) {
		this.idSubject = idSubject;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHours() {
		return hours;
	}


	public void setHours(int hours) {
		this.hours = hours;
	}
	
	
	


}
