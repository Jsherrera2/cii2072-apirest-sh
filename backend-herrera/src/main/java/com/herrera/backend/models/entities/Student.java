package com.herrera.backend.models.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Table(name="Students")
@Entity
public class Student extends Person implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_student")
	private Long idStudent;
	
	@Column(name="address", length=255)
	private String address;
	
	@Column(name="start_From", length=35)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar startFrom;
	
	//** Cardinalidad de uno a varios
	
	@OneToMany(mappedBy="student", fetch=FetchType.LAZY)//mappedBy apunta al nombre del atributo en la clase Subscription
	private List<Subscription> subscription;
	
	public Student() {
		super();
	}
	public Student(Long idStudent) {
		super();
		this.idStudent = idStudent;
	}
	public Long getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(Long idStudent) {
		this.idStudent = idStudent;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Calendar getStartFrom() {
		return startFrom;
	}
	public void setStartFrom(Calendar startFrom) {
		this.startFrom = startFrom;
	}
	public List<Subscription> getSubscription() {
		return subscription;
	}
	public void setSubscription(List<Subscription> subscription) {
		this.subscription = subscription;
	}
	
	

}
